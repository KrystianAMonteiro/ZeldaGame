package com.xhavasstudios.entitites;

import java.awt.image.BufferedImage;

public class Enemy extends Entity{
	
	private double speed = 1;
	private int maskx = 8, masky = 8, maskw =10, maskh = 10;
	private int frames = 0, maxFrames = 7, index = 0, maxIndex = 8;

	public Enemy(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
		

		}	
}
