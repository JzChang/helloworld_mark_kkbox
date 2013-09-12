package com.example.myapplication_helloworld_mark_kkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.Intent;

public class helloworld extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextBtn = (Button)findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "Toast......", Toast.LENGTH_LONG).show();

                jumpToNextLayout();
            }
        });
    }

    public void jumpToNextLayout(){
        //setContentView(R.layout.next_view);

		Intent intent = new Intent();
		intent.setClass(this, nextView.class);
		startActivity(intent);



	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.helloworld, menu);
        return true;
    }
    
}
