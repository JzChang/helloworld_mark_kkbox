package com.example.myapplication_helloworld_mark_kkbox;

/**
 * Created by kkbox on 2013/9/12.
 */

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;
import android.content.Intent;

public class nextView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.next_view);

		Log.d("LOG_TAG.onCreate", "nextView.onCreate");
	}

	@Override
	protected void onStart() {
		super.onStart();

		Log.d("LOG_TAG.onStart", "nextView.onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();

		Log.d("LOG_TAG.onResume", "nextView.onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();

		Log.d("LOG_TAG.onPause", "nextView.onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();

		Log.d("LOG_TAG.onStop", "nextView.onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		Log.d("LOG_TAG.onDestroy", "nextView.onDestroy");
	}

	@Override
	public void onBackPressed() {
		// 按下 Back 鍵
		super.onBackPressed();

		Log.d("LOG_TAG.onBackPressed", "nextView.onBackPressed");
	}

}
