package com.example.rishabhkhanna.code_n_counter.Animation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by devesh on 4/9/16.
 */
public class LineTransition extends View {

    float xPos = 0;
    float maxWidth = 0,yPos=0;
    Paint paint;

    private Runnable animateLine = new Runnable() {

        @Override
        public void run() {
            boolean reached = false;
            xPos += 10;

            if (xPos <= maxWidth) {
                invalidate();
            } else reached = true;

            if (!reached)
                postDelayed(this, 15);
        }
    };

    public void init() {
paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
        post(animateLine);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(xPos,yPos,maxWidth,yPos,paint);
    }


    public LineTransition(Context context, AttributeSet attrs,float x,float y,float z) {
        super(context, attrs);
        xPos = x;
        yPos =y;
        maxWidth = z;
        init();
    }
}