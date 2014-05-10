package com.example.activity01.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity01 extends Activity {
    private Button myButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity01);
        myButton = (Button)findViewById(R.id.myButton);
        myButton.setOnClickListener(new myButtonListener());
    }
    class myButtonListener implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("testIntent","123");
            intent.setClass(Activity01.this,OtherActivity.class);
            Activity01.this.startActivity(intent);
        }
    }

}
