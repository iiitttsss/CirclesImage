package com;

import processing.core.PVector;

import java.util.ArrayList;

public class Canvas
{
    private ArrayList<Circle> circles;

    public Canvas()
    {
        Types.initTypes();
        circles = new ArrayList<>();
        circles.add(new Circle(new PVector(500, 500), Types.types.get(0)));
    }

    public ArrayList<Circle> getCircles()
    {
        return circles;
    }

    public void setCircles(ArrayList<Circle> circles)
    {
        this.circles = circles;
    }
}
