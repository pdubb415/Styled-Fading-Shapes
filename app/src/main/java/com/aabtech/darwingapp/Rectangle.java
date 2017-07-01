package com.aabtech.darwingapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.Random;


public class Rectangle extends shapes{
    private Rect rectangle;
    private Paint paint;

    public Rectangle(Context context) {
        super(context);

        // create a rectangle that we'll draw later
        rectangle = new Rect(getx(), gety(), getsidelength(), getsidelength());

        // create the Paint and set its color
        paint = new Paint();
        paint.setColor(getrandomcolour());
    }

    String getShapeType()
    {

        return "Rectangle";
    }
    public void onDraw(Canvas canvas)
    {
        setShapeAlpha(100);
        canvas.drawRect(rectangle, paint);

    }
    int getx(){
        int x = (int )(Math.random() * 100 + 80);
        return x;
    }
    int gety()
    {
        int y   = (int )(Math.random() * 180 + 120);
        return y;
    }
    int getsidelength(){

        int sidelength   = (int )(Math.random() * 250 + 200);
        return sidelength;

    }
    int getrandomcolour(){
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return color;


    }


}
