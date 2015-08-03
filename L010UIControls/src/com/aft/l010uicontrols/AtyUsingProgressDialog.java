package com.aft.l010uicontrols;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AtyUsingProgressDialog extends Activity {

	private ProgressDialog progressDialog;
	private Button showButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_progressdialog);

		showButton = (Button) findViewById(R.id.showButton);
		showButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				progressDialog = ProgressDialog.show(
						AtyUsingProgressDialog.this, "title", "show message");
				new Thread() {
					public void run() {
						try {
							Thread.sleep(3000);
							progressDialog.dismiss();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					};
				}.start();
			}
		});
	}
}
