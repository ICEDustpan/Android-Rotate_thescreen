package com.avd.rotate_thescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //监听竖屏按钮
        Button button_Vertical_screen;
        button_Vertical_screen = (Button) findViewById(R.id.Vertical_screen);

        //监听横屏按钮
        Button button_Horizontal_screen;
        button_Horizontal_screen = (Button) findViewById(R.id.Horizontal_screen);


        //执行竖屏方法
        button_Vertical_screen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                System.out.println("竖屏");
                Toast.makeText(getApplicationContext(), "竖屏", Toast.LENGTH_SHORT).show();
                Log.i("TEST", "button onClick");
            }
        });


        //执行横屏方法
        button_Horizontal_screen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);
                Toast.makeText(getApplicationContext(), "横屏", Toast.LENGTH_SHORT).show();
                System.out.println("横屏");
                Log.i("TEST", "button onClick");
            }
        });

    }

}
