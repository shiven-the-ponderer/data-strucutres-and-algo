package com.shiven.designpattern.singleton;

public class EagerInitialization {
	
	private static final EagerInitialization EAGER_INITIALIZATION = new EagerInitialization();
	
	private EagerInitialization(){
		
	}
	
	public EagerInitialization getInstance(){
		return EAGER_INITIALIZATION;
	}
}
