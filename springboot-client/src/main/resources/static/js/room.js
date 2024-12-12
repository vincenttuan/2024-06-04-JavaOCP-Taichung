// 獲取 DOM 元素
const roomList = document.getElementById('roomList');
const roomIdInput = document.getElementById('roomId');
const roomNameInput = document.getElementById('roomName');
const roomSizeInput = document.getElementById('roomSize');
const addResult = document.getElementById('addResult');

// 透過 fetch 經由 http://localhost:8080/rest/rooms 取得遠端資料
// async 非同步, await 等待, fetch 取資料, json() 字串轉 json 物件

const fetchRooms = async () => {
	try {
		console.log('取得 rooms 資料');
		const response = await fetch('http://localhost:8080/rest/rooms');
		const apiResponse = await response.json();
		console.log(apiResponse);
		//addResult.innerHTML = '<h3>' + apiResponse.message + '</h3>';
		addResult.innerText = apiResponse.message;
	} catch(e) {
		console.err(e);
	}	
};

fetchRooms();


