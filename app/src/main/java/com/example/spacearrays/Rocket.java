package com.example.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Rocket {
    float x, y, vx, vy;
    Bitmap Image;
    Paint paint = new Paint();

    public Rocket(float x, float y, float vx, float vy, Bitmap Image) {
        this.x=x;
        this.y=y;
        this.vx=vx;
        this.vy=vy;
        this.Image=Image;
    }
    void draw(Canvas canvas) {
        Matrix matrix = new Matrix();
        matrix.setScale(0.2f, 0.2f);
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(Image, matrix, paint);
    }
    void move() {
        this.x+=vx;
        this.y+=vy;
    }

}
