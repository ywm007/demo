package com.aft.l010uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class AtyUsingRatingBar extends Activity {

	private RatingBar ratingBar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.aty_using_ratingbar);
		ratingBar = (RatingBar) findViewById(R.id.ratingBar);
		ratingBar.setMax(10);
		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
				Toast.makeText(AtyUsingRatingBar.this, "当前星级:"+arg1, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
