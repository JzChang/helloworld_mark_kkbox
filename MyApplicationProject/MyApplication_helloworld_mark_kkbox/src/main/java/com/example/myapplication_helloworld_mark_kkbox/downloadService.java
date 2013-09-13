package com.example.myapplication_helloworld_mark_kkbox;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

////

//////////

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import android.os.AsyncTask;


/**
 * Created by kkbox on 2013/9/13.
 */
public class downloadService extends Service {
	public IBinder onBind(Intent intent) {
		return null;
	}

	/**
	 * Background Async Task to download file
	 */
	class DownloadFileFromURL extends AsyncTask<String, String, String> {

		/**
		 * Before starting background thread
		 * Show Progress Bar Dialog
		 */
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			//showDialog(progress_bar_type);
		}

		/**
		 * Downloading file in background thread
		 */
		@Override
		protected String doInBackground(String... f_url) {
			int count;
			try {
				URL url = new URL(f_url[0]);
				URLConnection conection = url.openConnection();
				conection.connect();
				// this will be useful so that you can show a tipical 0-100% progress bar
				int lenghtOfFile = conection.getContentLength();

				// download the file
				InputStream input = new BufferedInputStream(url.openStream(), 8192);

				// Output stream
				OutputStream output = new FileOutputStream("/sdcard/testImg.jpg");

				byte data[] = new byte[1024];

				long total = 0;

				while ((count = input.read(data)) != -1) {
					total += count;
					// publishing the progress....
					// After this onProgressUpdate will be called
					publishProgress("" + (int) ((total * 100) / lenghtOfFile));

					// writing data to file
					output.write(data, 0, count);
				}

				// flushing output
				output.flush();

				// closing streams
				output.close();
				input.close();

			} catch (Exception e) {
				Log.d("LOG_TAG", e.getMessage());
			}

			return null;
		}
	}

	private static String file_url = "https://dl.dropboxusercontent.com/u/19164997/testImg.jpg";

	@Override
	public void onCreate() {
		super.onCreate();

		Log.d("LOG_TAG.onCreate", "downloadService.onCreate");

		new DownloadFileFromURL().execute(file_url);
	}
}
