package com.example.yourhealthprototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GoalActivity extends Activity {

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_goal);
		Button Goal = (Button) findViewById(R.id.button1);
		
		//create an onclick listener for the login button
		Goal.setOnClickListener(new View.OnClickListener() {
					
				@Override
			public void onClick(View v) { 
					// make it start the LoginActivity
					Toast.makeText(getApplicationContext(), getString(R.string.msg2), Toast.LENGTH_SHORT).show();
				}
			});
	}
}
