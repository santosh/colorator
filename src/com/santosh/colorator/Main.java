package com.santosh.colorator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;
import android.graphics.Color;
import java.util.Random;
import android.widget.Toast;
import android.view.MenuItem;
import android.view.Menu;

public class Main extends Activity
{
    TextView colorful;
    public static final int ABOUT_ID = Menu.FIRST;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        colorful = (TextView)findViewById(R.id.colorful);
        colorful.setBackgroundResource(R.color.white);
        Toast.makeText(Main.this, "Start tapping to generate colors", Toast.LENGTH_LONG).show();
        colorful.setOnClickListener(colorfullistener);
    }

    public static char randomChar() {
    char[] rand = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    Random random = new Random();
    char randomChar = rand[random.nextInt(15)];
    return randomChar;
}

    public static String randomColor() {
    String color = "#" + randomChar() + randomChar() + randomChar() + randomChar() + randomChar() + randomChar();
    return color;
}
    private OnClickListener colorfullistener = new View.OnClickListener() {
    @Override
        public void onClick(View colorful) {
            colorful.setBackgroundColor(Color.parseColor(randomColor()));

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);
    menu.add(0, ABOUT_ID, 0, R.string.about_title).setShortcut('5', 'a')
        .setIcon(android.R.drawable.ic_dialog_info);
    return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
    switch (item.getItemId()) {
        case ABOUT_ID:
            Eula.showEula(this);
            return true;
        default:
            return false;
    }
    }
}
