package com.example.yumatsuzawa.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by yumatsuzawa on 15/04/24.
 */
public class HelloWorldView extends View {
    private Paint paint = new Paint();
    HelloWorldView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setTextSize(80);  // px
        paint.setColor(Color.rgb(255, 0, 0));
        canvas.drawText("Don't let me down", 0, 100, paint);    // draw text at x,y=0,100 pos.
    }
}
