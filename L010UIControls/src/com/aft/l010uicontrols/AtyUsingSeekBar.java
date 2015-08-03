package com.aft.l010uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class AtyUsingSeekBar extends Activity {

	private SeekBar seekBar = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_seekbar);
		seekBar = (SeekBar) findViewById(R.id.seekBar1);
		seekBar.setMax(100);
		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				System.out.println("ywm >> onStopTrackingTouch "+ arg0.getProgress());
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				arg0.getProgress();
				System.out.println("ywm >> onStartTrackingTouch "+ arg0.getProgress());
			}
			
			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				
				System.out.println("ywm >> onProgressChanged = "+ arg1);
			}
		});
	}
}
