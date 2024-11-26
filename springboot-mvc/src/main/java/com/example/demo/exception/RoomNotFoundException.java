package com.example.demo.exception;

public class RoomNotFoundException extends RoomException {

	public RoomNotFoundException() {
		super("查無此房間");
	}
	
	public RoomNotFoundException(String message) {
		super(message);
	}
	
}
