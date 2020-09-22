package com.shiven.designpattern.strategy;

public class Duck {
	
	IFlyingBehaviour flyingBehaviour;
	IQuackingBehaviour quackingBehaviour;
	
	public void display(){
		System.out.println("i am common display to all");
	}

	public void setFlyingBehaviour(IFlyingBehaviour flyingBehaviour) {
		this.flyingBehaviour = flyingBehaviour;
	}

	public void setQuackingBehaviour(IQuackingBehaviour quackingBehaviour) {
		this.quackingBehaviour = quackingBehaviour;
	}
	
	public void fly(){
		flyingBehaviour.fly();
	}
	
	public void quack(){
		quackingBehaviour.quack();
	}
	
}
