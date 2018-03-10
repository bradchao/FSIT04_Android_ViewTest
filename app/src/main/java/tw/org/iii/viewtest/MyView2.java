package tw.org.iii.viewtest;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2018/3/10.
 */

public class MyView2 extends View {
    public MyView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.YELLOW);
    }
}
