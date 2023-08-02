package com.example.appcalculadora;
import android.app.Activity;
import android.content.res.Configuration;
import android.widget.LinearLayout;
public class AjusteView {
    public static void adjustLinearLayoutHeight(Activity activity, LinearLayout linearLayout) {
        int orientation = activity.getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            int heightInPixels = (int) activity.getResources().getDimension(R.dimen.layout_height_horizontal);
            linearLayout.getLayoutParams().height = heightInPixels;
        } else {
            int heightInPixels2 = (int) activity.getResources().getDimension(R.dimen.layout_height_vertical);
            linearLayout.getLayoutParams().height = heightInPixels2;
        }

        linearLayout.requestLayout();
    }
}
