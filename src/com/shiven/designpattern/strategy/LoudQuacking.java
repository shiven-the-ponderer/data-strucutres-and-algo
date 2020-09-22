package com.shiven.designpattern.strategy;

public class LoudQuacking implements IQuackingBehaviour{

	@Override
	public void quack() {
		System.out.println("i am quacking loudly");
	}

}
