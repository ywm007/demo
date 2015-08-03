package com.aft.l010uicontrols;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;

public class AtyUsingImageSwitcher extends Activity {

	private ImageSwitcher imageSwitcher;
	private int[]  nImg = new int[]{R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5};
	private int nPost = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_imageswitch);
		imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
		imageSwitcher.setFactory(new ViewFactory() {
			
			@Override
			public View makeView() {
				return new ImageView(AtyUsingImageSwitcher.this);
			}
		});
		
		imageSwitcher.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				nPost++;
				nPost = nPost%nImg.length;
				showCurrentImage();
			}
		});
		
		showCurrentImage();
	}
	
	private void showCurrentImage(){
		imageSwitcher.setImageResource(nImg[nPost]);
	}
}
