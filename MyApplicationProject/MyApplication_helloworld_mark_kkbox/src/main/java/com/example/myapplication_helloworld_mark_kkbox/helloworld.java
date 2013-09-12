package com.example.myapplication_helloworld_mark_kkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.Intent;
import android.util.Log;

public class helloworld extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		Log.d("LOG_TAG.onCreate", "helloworld.onCreate");


        Button nextBtn = (Button)findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), R.string.pressed_button, Toast.LENGTH_LONG).show();

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

	@Override
	protected void onStart()
	{
		super.onStart();

		Log.d("LOG_TAG.onStart", "helloworld.onStart");
	}

	@Override
	protected void onResume()
	{
		super.onResume();

		Log.d("LOG_TAG.onResume", "helloworld.onResume");
	}

	@Override
	protected void onPause()
	{
		super.onPause();

		Log.d("LOG_TAG.onPause", "helloworld.onPause");
	}

	@Override
	protected void onStop()
	{
		super.onStop();

		Log.d("LOG_TAG.onStop", "helloworld.onStop");
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();

		Log.d("LOG_TAG.onDestroy", "helloworld.onDestroy");
	}


    
}
