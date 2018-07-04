package com.example.yourhealthprototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);

		Button signUp = (Button) findViewById(R.id.button1);
		
		//create an onclick listener for the login button
		signUp.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) { 
				// make it start the LoginActivity
				//Intent i = new Intent(SignUpActivity.this, SignUpActivity.class);
				//startActivity(i);
				finish();
				}
			});
	}
}
