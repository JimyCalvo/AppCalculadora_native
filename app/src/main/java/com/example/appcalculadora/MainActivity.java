package com.example.appcalculadora;
import android.widget.CompoundButton;
import android.content.res.Configuration;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TableLayout;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
    private Switch orientationSwitch;
    private LinearLayout myLinearLayout;
    private TableLayout tableLayoutHorizontal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLinearLayout = findViewById(R.id.LinearView);
        adjustLinearLayoutHeight();
        orientationSwitch = findViewById(R.id.orientationSwitch);
        tableLayoutHorizontal = findViewById(R.id.tableLayoutHorizontal);


        orientationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                boolean isHorizontal = isChecked;
                CientificMode.setOrientation(MainActivity.this, isHorizontal);
                if (isHorizontal) {
                    tableLayoutHorizontal.setVisibility(TableLayout.VISIBLE);
                } else {
                    tableLayoutHorizontal.setVisibility(TableLayout.GONE);
                }

            }
        });

    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        adjustLinearLayoutHeight();
    }

    private void adjustLinearLayoutHeight() {
        AjusteView.adjustLinearLayoutHeight(this, myLinearLayout);
    }


}