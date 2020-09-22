package com.shiven.designpattern.strategy;

public class CloudFlying implements IFlyingBehaviour{

	@Override
	public void fly() {
		System.out.println("i am flying in cloud");
	}

}
