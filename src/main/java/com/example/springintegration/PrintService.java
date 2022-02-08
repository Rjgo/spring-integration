package com.example.springintegration;

public class PrintService implements CustomGateway {

	public void print(String message) {
		System.out.println(message);
	}
}
