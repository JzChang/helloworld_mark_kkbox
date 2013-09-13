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

public class nextViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.next_view);

		Log.d("LOG_TAG.onCreate", "nextViewActivity.onCreate");
	}

	@Override
	protected void onStart() {
		super.onStart();

		Log.d("LOG_TAG.onStart", "nextViewActivity.onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();

		Log.d("LOG_TAG.onResume", "nextViewActivity.onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();

		Log.d("LOG_TAG.onPause", "nextViewActivity.onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();

		Log.d("LOG_TAG.onStop", "nextViewActivity.onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		Log.d("LOG_TAG.onDestroy", "nextViewActivity.onDestroy");
	}

	@Override
	protected void  onRestart () {
		super.onRestart();

		Log.d("LOG_TAG.onRestart", "nextViewActivity.onRestart");
	}

	@Override
	public void onBackPressed() {
		// 按下 Back 鍵
		super.onBackPressed();

		Log.d("LOG_TAG.onBackPressed", "nextViewActivity.onBackPressed");
	}

}
