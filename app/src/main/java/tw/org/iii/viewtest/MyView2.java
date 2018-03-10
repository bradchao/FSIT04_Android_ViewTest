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

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Administrator on 2018/3/10.
 */

public class MyView2 extends View {
    private LinkedList<HashMap<String,Float>> line;
    private Paint paint;

    public MyView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.YELLOW);

        line = new LinkedList<>();
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(4);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (int i=1; i<line.size(); i++) {
            HashMap<String,Float> p0 = line.get(i-1);
            HashMap<String,Float> p1 = line.get(i);
            canvas.drawLine(p0.get("x"), p0.get("y"),
                    p1.get("x"), p1.get("y"), paint);
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float ex = event.getX();
        float ey = event.getY();

        String action = null;
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            action = "Down";
        }else if (event.getAction() == MotionEvent.ACTION_MOVE){
            action = "Move";
        }else if (event.getAction() == MotionEvent.ACTION_UP){
            action = "UP";
        }

        if (action != null) {
            Log.v("brad", action + ex + "x" + ey);

            HashMap<String,Float> point = new HashMap<>();
            point.put("x", ex); point.put("y", ey);
            line.add(point);
            invalidate();

        }
        return true; //super.onTouchEvent(event);
    }
}
