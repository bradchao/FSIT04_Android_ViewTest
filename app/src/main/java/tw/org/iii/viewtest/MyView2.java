package tw.org.iii.viewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2018/3/10.
 */

public class MyView2 extends View {
    public MyView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.YELLOW);
        Log.v("brad", "MyView2()");

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("brad", "setOnClick");
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.v("brad", "MyView2:onDraw()");
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(4);

        canvas.drawLine(0, 0,100,200, paint);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v("brad", "onTouch");
        return super.onTouchEvent(event);
    }
}
