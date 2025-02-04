package com.example.websocket.channel;

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
	
	// 當客戶端與伺服端建立連接時會自動觸發
	@OnOpen
	public void onOpen(Session session) {
		// session id: 每一個連線都有獨立的 session id 值, 以便區隔來源
		System.out.println("有人連進來了 session id = " + session.getId());
	}
	
	// 當客戶端傳送字串資料到伺服端時觸發
	@OnMessage
	public void onMessage(String message, Session session) {
		System.out.println("session id = " + session.getId() + " 說(message): " + message);
	}
	
	// 當客戶端與伺服端關閉連接時會自動觸發
	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		System.out.println("session id = " + session.getId() + " 已關閉連線, 原因: " + closeReason);
	}
	
	// 當客戶端與伺服端通訊過程中發生錯誤時會自動觸發
	@OnError
	public void onError(Session session, Throwable throwable) {
		System.out.println("session id = " + session.getId() + " 發生連線錯誤, 原因: " + throwable);
	}
	
	
	
}
