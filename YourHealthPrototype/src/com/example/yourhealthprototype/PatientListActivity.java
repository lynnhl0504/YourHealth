package com.example.yourhealthprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PatientListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_patientlist);

		Button patient1 = (Button) findViewById(R.id.button1);
		Button patient2 = (Button) findViewById(R.id.button2);
		Button patient3 = (Button) findViewById(R.id.button3);
		
		//create an onclikc listener for the setup button
		patient1.setOnClickListener(new View.OnClickListener() {
	   
			@Override
			public void onClick(View v) {
				// make it start the SetupActivity
				Log.i("Setup", "Hello World");
				Intent i = new Intent(PatientListActivity.this, patient1Activity.class);
				startActivity(i);
			}
		});
		//create an onclikc listener for the setup button
		patient2.setOnClickListener(new View.OnClickListener() {
	   
			@Override
			public void onClick(View v) {
				// make it start the SetupActivity
				Log.i("Setup", "Hello World");
				Intent i = new Intent(PatientListActivity.this, patient2Activity.class);
				startActivity(i);
			}
		});
		//create an onclikc listener for the setup button
		patient3.setOnClickListener(new View.OnClickListener() {
	   
			@Override
			public void onClick(View v) {
				// make it start the SetupActivity
				Log.i("Setup", "Hello World");
				Intent i = new Intent(PatientListActivity.this, patient3Activity.class);
				startActivity(i);
			}
		});
	}
}