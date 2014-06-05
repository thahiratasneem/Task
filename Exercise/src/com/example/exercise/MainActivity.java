package com.example.exercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
Button camera;
Button phonebook;
Button musicplayer;
Button secondactivity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		camera=(Button)findViewById(R.id.camera_button);
        phonebook=(Button)findViewById(R.id.phonebook_button);
        musicplayer=(Button)findViewById(R.id.musicplayer_button);
        secondactivity=(Button)findViewById(R.id.secondactivity_button);
        camera();
        phonebook();
        musicplayer();
        secondactivity();
        
	}

	public void camera()
	{
				camera.setOnClickListener(new OnClickListener() {

				public void onClick(View v) {
					camera();
					Intent intent1 =new Intent("android.media.action.IMAGE_CAPTURE");
					startActivity(intent1);	
				}
			});
	}
		
	
		public void phonebook()
		{
			phonebook.setOnClickListener(new OnClickListener()
			{
			public void onClick(View v)
			{
				phonebook();
	Intent intent2=new Intent();
	intent2.setComponent(new android.content.ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
	//		    i.setAction("android.intent.action.MAIN");
	//		    i.addCategory("android.intent.category.LAUNCHER");
	//		    i.addCategory("android.intent.category.DEFAULT");
	startActivity(intent2);
}

});
		}

		
	public void musicplayer()
	{
		musicplayer.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent3 = new Intent("android.intent.action.MUSIC_PLAYER");
				intent3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent3);
			}
		});
	}
	

		public void secondactivity()
		{
		secondactivity.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent intent4= new Intent(MainActivity.this,SecondActivity.class);
				startActivity(intent4);
			}
		});
	}
	}


