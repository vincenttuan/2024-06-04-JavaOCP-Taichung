package com.example.demo.exception;

@SuppressWarnings("serial")
public class RoomAlreadyExistException extends RoomException {

	public RoomAlreadyExistException(String message) {
		super(message);
	}
	
}
