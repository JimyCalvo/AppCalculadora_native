package com.example.appcalculadora;
import android.app.Activity;
import android.content.pm.ActivityInfo;
public class CientificMode {
    public static void setOrientation(Activity activity, boolean isHorizontal) {
        if (isHorizontal) {
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        } else {
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

}

