package com.Junit;

import java.util.Random;

public class RandomTo100 {
	Random random=new Random();
	public int getRandomNo()
	{
		return random.nextInt(100);
	}
}