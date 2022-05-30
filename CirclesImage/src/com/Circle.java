package com;

import processing.core.PVector;

public class Circle
{
    private PVector position;
    private CircleType circleType;


    public Circle(PVector position, CircleType circleType)
    {
        this.position = position;
        this.circleType = circleType;
    }

    public CircleType getCircleType()
    {
        return circleType;
    }

    public void setCircleType(CircleType circleType)
    {
        this.circleType = circleType;
    }

    public PVector getPosition()
    {
        return position;
    }

    public void setPosition(PVector position)
    {
        this.position = position;
    }


}
