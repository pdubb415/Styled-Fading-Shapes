package com.aabtech.darwingapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import java.util.Random;

/**
 * Created by Abdullah on 3/28/2016.
 */
public class Circle extends shapes
{

    public Circle(Context context) {
        super(context);
    }

    @Override
    String getShapeType() {
        return "Circle";
    }
    public void onDraw(Canvas canvas)
    {

        Paint paint=new Paint();
        setShapeAlpha(100);
        paint.setColor(getrandomcolour());
        canvas.drawCircle(getx(),getx(), getradius(), paint);

    }
    int getx(){
        int x = (int )(Math.random() * 200 + 150);
        return x;
    }

    int getradius(){

        int radius   = (int )(Math.random() * 60 + 40);
        return radius;

    }
    int getrandomcolour(){
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return color;


    }
}
