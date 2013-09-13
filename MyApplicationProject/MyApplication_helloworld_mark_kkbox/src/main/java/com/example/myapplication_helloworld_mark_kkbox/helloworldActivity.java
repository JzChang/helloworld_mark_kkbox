package com.example.myapplication_helloworld_mark_kkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.util.Log;
import android.content.Intent;

public class helloworldActivity extends Activity {

	private Button.OnClickListener buttonStartDownloadOnClick = new Button.OnClickListener() {
		public void onClick(View v) {
			Toast.makeText(v.getContext(), R.string.pressed_button_download, Toast.LENGTH_SHORT).show();

			// 啟動下載資料
			Intent intent = new Intent(helloworldActivity.this, downloadService.class);
			startService(intent);
		}
	};

	private Button.OnClickListener buttonNextOnClick = new Button.OnClickListener() {
		public void onClick(View v) {
			Toast.makeText(v.getContext(), R.string.pressed_button_examine, Toast.LENGTH_SHORT).show();
			jumpToNextLayout();
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.d("LOG_TAG.onCreate", "helloworldActivity.onCreate");

		Button buttonStartDownload = (Button) findViewById(R.id.start_download_button);
		Button buttonNext = (Button) findViewById(R.id.button_next);

		buttonStartDownload.setOnClickListener(buttonStartDownloadOnClick);
		buttonNext.setOnClickListener(buttonNextOnClick);
	}

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.helloworldActivity, menu);
		return true;
	}
	*/

	@Override
	protected void onStart() {
		super.onStart();

		Log.d("LOG_TAG.onStart", "helloworldActivity.onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();

		Log.d("LOG_TAG.onResume", "helloworldActivity.onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();

		Log.d("LOG_TAG.onPause", "helloworldActivity.onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();

		Log.d("LOG_TAG.onStop", "helloworldActivity.onStop");
	}

	@Override
	protected void onRestart() {
		super.onRestart();

		Log.d("LOG_TAG.onRestart", "helloworldActivity.onRestart");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		Log.d("LOG_TAG.onDestroy", "helloworldActivity.onDestroy");
	}

	private void jumpToNextLayout() {
		//setContentView(R.layout.next_view);
		Intent intent = new Intent();
		intent.setClass(this, nextViewActivity.class);
		startActivity(intent);
	}
}
