package com.example.yourhealthprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class DoctorActivity extends Activity {
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_doctor);
		
		Button PatientList = (Button) findViewById(R.id.button1);

		//create an onclikc listener for the setup button
		PatientList.setOnClickListener(new View.OnClickListener() {
	   
			@Override
			public void onClick(View v) {
				// make it start the SetupActivity
				Log.i("Setup", "Hello World");
				Intent i = new Intent(DoctorActivity.this, PatientListActivity.class);
				startActivity(i);
			}
		});
		//create an onclikc listener for the setup button
	}
}
