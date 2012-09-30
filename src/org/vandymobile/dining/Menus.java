package org.vandymobile.dining;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

/**
 * @author Matthew Lavin
 */

public class Menus extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
        Intent i = getIntent();
        String[] click = {"You clicked Breakfast!","You clicked Lunch!","You clicked Dinner!","What did you click?"};
        int page = i.getIntExtra("page", 3);
        ((TextView)findViewById(R.id.menu_tv)).setText(click[page]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menus, menu);
        return true;
    }
}