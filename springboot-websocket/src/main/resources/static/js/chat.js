var webSocket;
const url = 'ws://localhost:8080/channel/chat';
const connectButton = document.getElementById('connectButton');
const closeButton = document.getElementById('closeButton');
const messageInput = document.getElementById('messageInput');
const sendButton = document.getElementById('sendButton');
const log = document.getElementById('log');

// 更新對話紀錄
const addLog = (message) => {
	log.textContent += `${message}\n`; 
};

// 連接按鈕
connectButton.onclick = () => {
	webSocket = new WebSocket(url);
	
	webSocket.onopen = () => {
		
	};
	
	webSocket.onmessage = (event) => {
			
	};
	
	webSocket.onclose = (event) => {
			
	};
	
	webSocket.onerror = (event) => {
			
	};			
};


// 廣播-發送按鈕
sendButton.onclick = () => {
	
};

// 斷開按鈕
closeButton.onclick = () => {
	if(webSocket) { // 是否在 open 狀態
		
	}
};

