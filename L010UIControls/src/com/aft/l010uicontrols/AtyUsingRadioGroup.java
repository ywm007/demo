package com.aft.l010uicontrols;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class AtyUsingRadioGroup extends Activity {

	private Button btnSubmit ;
	private RadioButton btnRadio0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_radiogroup);
		btnRadio0 = (RadioButton) findViewById(R.id.radio0);
		btnSubmit = (Button) findViewById(R.id.btnSubmit);
		btnSubmit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(btnRadio0.isChecked())
				{
					Dialog alertDialog = new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("提示").setMessage("hello world").setPositiveButton("OK", null).create();
					alertDialog.show();	
				}
			}
		});
	}
}
