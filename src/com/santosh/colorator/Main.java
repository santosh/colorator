package com.santosh.colorator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;
import android.graphics.Color;
import java.util.Random;
import android.util.Log;

public class Main extends Activity
{
    TextView colorful;
    public static final String TAG = "com.santosh.colorator";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        colorful = (TextView)findViewById(R.id.colorful);
        colorful.setBackgroundResource(R.color.white);
        colorful.setOnClickListener(colorfullistener);
        Log.i(TAG, "passed the onCreate()");
    }

    public static char randomChar() {
    Log.i(TAG, "about to do randomChar");
    char[] rand = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    Random random = new Random();
    char randomChar = rand[random.nextInt(15)];
    Log.i(TAG, "passed randomChar");
    return randomChar;
}

    public static String randomColor() {
    Log.i(TAG, "about to do randomColor");
    String color = "#" + randomChar() + randomChar() + randomChar() + randomChar() + randomChar() + randomChar();
    Log.i(TAG, "passed randomColor");
    return color;
}
    private OnClickListener colorfullistener = new View.OnClickListener() {
    @Override
        public void onClick(View colorful) {
            Log.i(TAG, "about to do onClick");
            colorful.setBackgroundColor(Color.parseColor(randomColor()));
            Log.i(TAG, "passed onClick");

        }
    };
}
