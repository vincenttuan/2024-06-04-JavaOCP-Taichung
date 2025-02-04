package com.example.websocket.channel;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.CloseReason;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

/**
 * @ServerEndpoint 表示一個 WebSocket 端點
 * "/channel/chat" 表示連接路徑: ws://localhost:8080/channel/chat
 * */

@ServerEndpoint(value = "/channel/chat")
public class ChatChannel {
	// 利用 Set + synchronized 來保存所有的 sessin 物件
	private static final Set<Session> sessions = Collections.synchronizedSet(new HashSet<>());
	
	// 廣播發送
	public void broadcast(String message) {
		// 逐筆發送
		sessions.forEach((session) -> {
			if(session.isOpen()) {
				session.getAsyncRemote().sendText(message);
			}
		});
	}
	
	// 當客戶端與伺服端建立連接時會自動觸發
	@OnOpen
	public void onOpen(Session session) {
		// session id: 每一個連線都有獨立的 session id 值, 以便區隔來源
		System.out.println("有人連進來了 session id = " + session.getId());
		// 將 session 保存在 sessions 中
		sessions.add(session);
		broadcast("有人上線了 id: " + session.getId());
	}
	
	// 當客戶端傳送字串資料到伺服端時觸發
	@OnMessage
	public void onMessage(String message, Session session) {
		System.out.println("session id = " + session.getId() + " 說(message): " + message);
		// 單筆發送
		//session.getAsyncRemote().sendText(message);
		// 進行廣播發送
		broadcast("[" + session.getId() + "] 說: " + message);
	}
	
	// 當客戶端與伺服端關閉連接時會自動觸發
	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		System.out.println("session id = " + session.getId() + " 已關閉連線, 原因: " + closeReason);
		broadcast("有人離線了 id: " + session.getId());
	}
	
	// 當客戶端與伺服端通訊過程中發生錯誤時會自動觸發
	@OnError
	public void onError(Session session, Throwable throwable) {
		System.out.println("session id = " + session.getId() + " 發生連線錯誤, 原因: " + throwable);
	}
	
	
	
}
