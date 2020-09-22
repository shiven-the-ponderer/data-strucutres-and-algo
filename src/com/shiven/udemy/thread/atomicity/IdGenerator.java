package com.shiven.udemy.thread.atomicity;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {
	
	private AtomicLong id = new AtomicLong();
	
	public long newId() {
		return id.incrementAndGet();
	}

}
