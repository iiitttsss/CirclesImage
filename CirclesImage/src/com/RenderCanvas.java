package com;

import processing.core.PGraphics;

public class RenderCanvas
{
    public static final float SIDE_MULTIPLIER = 1;
    private static PGraphics pg = Global.getPro().createGraphics(Global.getPro().width, Global.getPro().height);

    public static void renderCircle(Circle circle)
    {
        pg.fill(circle.getCircleType().getColor());
        pg.circle(circle.getPosition().x, circle.getPosition().y, circle.getCircleType().getRadius());
    }

    public static void renderCanvas(Canvas canvas)
    {
        pg.beginDraw();
        for (Circle circle : canvas.getCircles())
        {
            renderCircle(circle);
        }
        pg.endDraw();
        Global.getPro().image(pg, 0, 0);
    }

    public static PGraphics getPg()
    {
        return pg;
    }

    public static void setPg(PGraphics pg)
    {
        RenderCanvas.pg = pg;
    }
}
