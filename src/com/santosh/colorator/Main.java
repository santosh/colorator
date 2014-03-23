package com.santosh.colorator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;

public class Main extends Activity
{
    TextView colorful;
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
    }

    public static String randomColor() {
    String color = "#" + randomChar() + randomChar() + randomChar() + randomChar() + randomChar() + randomChar();
    return color;
}
    private OnClickListener colorfullistener = new View.OnClickListener() {
    @Override
        public void onClick(View colorful) {
            colorful.setBackgroundResource(R.color.blue);
        }
    };
}
