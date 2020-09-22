package com.shiven.interview.questions.collections;

public class Apple {
	
	private String colour;
	
	public Apple(String colour) {
		this.colour = colour;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if (!(obj instanceof Apple))
			return false;	
		if (obj == this)
			return true;
		return this.colour.equals(((Apple) obj).colour);
	}
	
	public int hashCode() {
		return this.colour.hashCode();
	}

}
