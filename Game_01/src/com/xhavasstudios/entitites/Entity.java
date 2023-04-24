package com.xhavasstudios.entitites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.xhavasstudios.main.Game;
import com.xhavasstudios.world.Camera;

public class Entity {
	
	public static BufferedImage LIFEPACK_EN = Game.spritesheet.getSprite(2*16, 0, 16, 16);
	public static BufferedImage WEAPON_EN = Game.spritesheet.getSprite(3*16, 0, 16, 16);
	public static BufferedImage BULLET_EN = Game.spritesheet.getSprite(4*16, 0, 16, 16);
	public static BufferedImage ENEMY_EN = Game.spritesheet.getSprite(0, 48, 16, 16);
	
	
	protected double x;
	protected double y;
	protected double width;
	protected double height;
	
	private BufferedImage sprite;
	
	public Entity(int x, int y, int width, int height, BufferedImage sprite) {
		this.x      =x;
		this.y      =y;
		this.width  = width;
		this.height = height;
		this.sprite = sprite;
	}
	
	
	public void setX (int newX) {
		this.x = newX;
	}
	public void setY (int newY) {
		this.x = newY;
	}
	

	public int getX() {
		return (int)this.x;
	}
	public int getY() {
		return (int)this.y;
	}
	public int getWidth() {
		return (int)this.width;
	}
	public int getHeight() {
		return (int)this.height;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, this.getX() - Camera.x, this.getY()- Camera.y, null);
	}
	
	
}
