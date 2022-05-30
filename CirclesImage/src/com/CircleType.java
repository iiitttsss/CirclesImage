package com;

public class CircleType
{
    private float radius;
    private int color;

    public CircleType(float radius, int gray)
    {
        this.radius = radius;
        this.color = Global.getPro().color(gray);
    }

    public CircleType(float radius, int r, int g, int b)
    {
        this.radius = radius;
        this.color = Global.getPro().color(r, g, b);
    }

    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public int getColor()
    {
        return color;
    }

    public void setColor(int color)
    {
        this.color = color;
    }
}
