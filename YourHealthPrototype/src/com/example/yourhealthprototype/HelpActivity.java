package com.example.yourhealthprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);

		Button about = (Button) findViewById(R.id.button1);
		
		//create an onclick listener for the login button
		about.setOnClickListener(new View.OnClickListener() {
					
				@Override
			public void onClick(View v) { 
					// make it start the LoginActivity
					Intent i = new Intent(HelpActivity.this, AboutActivity.class);
					startActivity(i);
				}
			});
	}
}