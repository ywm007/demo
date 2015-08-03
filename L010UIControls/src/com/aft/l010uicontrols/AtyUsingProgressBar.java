package com.aft.l010uicontrols;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class AtyUsingProgressBar extends Activity {

	private ProgressBar pb03Bar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_progressbar);
		pb03Bar = (ProgressBar) findViewById(R.id.progressBar3);
		pb03Bar.setMax(100);
		pb03Bar.setProgress(0);
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		startTimer();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		stopTimer();
	}
	
	private Timer timer = null;
	private TimerTask timerTask = null;
	private int progress = 0;
	private void startTimer()
	{
		if(timer == null){
			timer = new Timer();
			timerTask = new TimerTask() {
				
				@Override
				public void run() {
					progress++;
					pb03Bar.setProgress(progress);
					if(progress >=100){
						progress = 0;
					}
				}
			};
			timer.schedule(timerTask, 1000,1000);
		}
	}
	
	private void stopTimer()
	{
		if(timer!=null){
			timer.cancel();
			timerTask.cancel();
			timer = null;
			timerTask = null;
		}
	}
	
}
