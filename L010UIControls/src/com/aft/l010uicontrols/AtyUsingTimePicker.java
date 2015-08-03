package com.aft.l010uicontrols;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class AtyUsingTimePicker extends Activity {

	private Button btnSelectDate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_datapinker);
		
		btnSelectDate = (Button) findViewById(R.id.btnSelectDate);
		
		btnSelectDate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				new TimePickerDialog(AtyUsingTimePicker.this, new TimePickerDialog.OnTimeSetListener() {
					
					@Override
					public void onTimeSet(TimePicker arg0, int arg1, int arg2) {
						btnSelectDate.setText(String.format("%02d:%02d", arg1,arg2));
					}
				}, 12, 05, true).show();
			}
		});
	}
}
