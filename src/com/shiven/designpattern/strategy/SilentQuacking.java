package com.shiven.designpattern.strategy;

public class SilentQuacking implements IQuackingBehaviour{

	@Override
	public void quack() {
		System.out.println("i am quacking silently");
	}

}
