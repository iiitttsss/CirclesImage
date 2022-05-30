package com;

import java.util.ArrayList;

public class Types
{
    public static ArrayList<CircleType> types;

    public static void initTypes()
    {
        types = new ArrayList<>();
        types.add(new CircleType(20,0));
    }
}
