package com.test.impl;

import com.test.Calculator;

public class SimpleCalculator implements Calculator{

	@Override
	public int add(int x, int y) {
		if(x < 0 || y < 0){
			throw new IllegalArgumentException("Inputs must be positive integers.");
		}
		return x + y;
	}

}
