// 獲取 DOM 元素
const roomList = document.getElementById('roomList');
const roomIdInput = document.getElementById('roomId');
const roomNameInput = document.getElementById('roomName');
const roomSizeInput = document.getElementById('roomSize');
const addResult = document.getElementById('addResult');

// 新增房間
/*
async function addRoom() {
	
}
*/
const addRoom = async() => {
	// 取得表單輸入資訊
	const roomId = roomIdInput.value;
	const roomName = roomNameInput.value;
	const roomSize = roomSizeInput.value;
	
	// 儲存
	try {
		// 建立物件
		const roomDTO = {
			id: roomId,
			name: roomName,
			size: roomSize
		};
		
		// 物件轉 json 字串
		roomDTOString = JSON.stringify(roomDTO);
		console.log(roomDTOString);
		
		// post 送出
		const response = await fetch('http://localhost:8080/rest/room', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json'
			},
			body: roomDTOString
		});
		
		// 回應
		const apiResponse = await response.json();
		addResult.innerText = apiResponse.message;
		 
		// 重新查詢 rooms 資料
		fetchRooms();
		
	} catch(e) {
		console.err(e);
	}
};

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
		const rooms = apiResponse.data;
		displayRooms(rooms);
	} catch(e) {
		console.err(e);
	}	
};

// 刪除房間
const deleteRoom = async (roomId) => {
	try {
		const response = await fetch(`http://localhost:8080/rest/room/${roomId}`, {
			method: 'DELETE'
		});
		
		const apiResponse = await response.json();
		if(response.ok) {
			// 刪除成功, 重新查詢所有房間
			fetchRooms();
		} else {
			addResult.innerHTML = `${apiResponse.status} ${apiResponse.message} 請<a href="./">重新整理頁面</a>`;
		}
		
	} catch(e) {
		console.err(e);
	}
	
};

// 顯示所有房間
const displayRooms = (rooms) => {
	//alert(rooms);
	// 清空 roomList
	roomList.innerText = '';
	// 逐筆顯示每一個房間的資訊
	rooms.forEach(room => {
		// 建立 <li> 標籤
		const item = document.createElement('li');
		// 在 <li> 標籤內放入資料
		//item.textContent = '房號:' + room.id + ' 房名:' + room.name + ' 人數:' + room.size;
		item.textContent = `房號: ${room.id} 房名: ${room.name} 人數: ${room.size} `;
		//-----------------------------------------------------------------------------
		// 新建立一個刪除按鈕
		const deleteButton = document.createElement('button');
		deleteButton.textContent = '刪除';
		deleteButton.onclick = () => deleteRoom(room.id);
		// 將 deleteButton 加入到 item
		item.appendChild(deleteButton);
		//-----------------------------------------------------------------------------
		// 建立一個修改按鈕
		const updateButton = document.createElement('button');
		updateButton.textContent = '修改';
		updateButton.onclick = () => openModal(room.id, room.name, room.size);
		item.appendChild(updateButton);
		//-----------------------------------------------------------------------------
		// 將 <li> (item) 放到 <ul> (roomList)
		roomList.appendChild(item);
	});
}

// 呼叫 fetchRooms() 方法 
fetchRooms();


