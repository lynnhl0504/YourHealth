package com.example.yourhealthprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatientActivity extends Activity {

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_patient);
		
		Button request = (Button) findViewById(R.id.button1);
		Button goal = (Button) findViewById(R.id.button2);
		
		//create an onclick listener for the login button
		request.setOnClickListener(new View.OnClickListener() {
							
				@Override
			public void onClick(View v) { 
					// make it start the LoginActivity
					Toast.makeText(getApplicationContext(), getString(R.string.msg), Toast.LENGTH_SHORT).show();
				}
			});
		//create an onclick listener for the login button
		goal.setOnClickListener(new View.OnClickListener() {
									
				@Override
			public void onClick(View v) { 
					Intent i = new Intent(PatientActivity.this, GoalActivity.class);
					startActivity(i);
				}
			});
	}
}


