package com.AkshayKumar;
interface AutoClosable {
	public void close() throws Exception;
}
public class AutoClose implements AutoClosable {
	@Override
	public void close() throws Exception {
		System.out.println("AutoClosable Closed...");
	}
}