package com;

import processing.core.PApplet;

public class Main extends PApplet
{
	private Canvas canvas;

	@Override
	public void settings()
	{
		size(1200, 1200);
	}

	@Override
	public void setup()
	{
		System.out.println("start program");
		Global.setPro(this);
		canvas = new Canvas();

	}

	@Override
	public void draw()
	{
		this.background(150);
		RenderCanvas.renderCanvas(canvas);
	}

	public static void main(String[] args)
	{
		PApplet.main(new String[] { Main.class.getName() });
	}
}
