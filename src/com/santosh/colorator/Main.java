package com.santosh.colorator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class Main extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    /* TODO:
     * Something like on: public void orientationChange() {
     *     super .orientationChange();
     *     Toast show = Toast.makeText(this, "Orientation changed..", Toast.LENGTH_SHORT);
     *     show.setGravity(Gravity.CENTER, 0, 0);
     *     show.show();
     * }
     */
}
