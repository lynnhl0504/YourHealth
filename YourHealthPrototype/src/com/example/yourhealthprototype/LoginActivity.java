package com.example.yourhealthprototype;

import android.app.Activity;
import android.content.Intent;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class LoginActivity extends Activity {

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		Button logIn = (Button) findViewById(R.id.button1);
		Button Forgot = (Button) findViewById(R.id.button3);
		Button register = (Button) findViewById(R.id.button2);
	
		
		final Spinner spinner = (Spinner) findViewById(R.id.spinner1);

		logIn.setOnClickListener(new OnClickListener() {

		  @Override
		  public void onClick(View v) {
			  if(spinner.getSelectedItem().equals("Doctor")){
				  Intent i = new Intent(LoginActivity.this, DoctorActivity.class);
					startActivity(i);
			}
			  else{
				  Intent i = new Intent(LoginActivity.this, PatientActivity.class);
					startActivity(i);  
			  }
		  }

		});
		//create an onclikc listener for the setup button
		Forgot.setOnClickListener(new View.OnClickListener() {
	   
			@Override
			public void onClick(View v) {
				// make it start the SetupActivity
				Log.i("Setup", "Hello World");
				Intent i = new Intent(LoginActivity.this, ForgotActivity.class);
				startActivity(i);
			}
		});
		//create an onclikc listener for the setup button
		register.setOnClickListener(new View.OnClickListener() {
	   
			@Override
			public void onClick(View v) {
				// make it start the SetupActivity
				Log.i("Setup", "Hello World");
				Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
				startActivity(i);
			}
		});
		
		
	}
}
