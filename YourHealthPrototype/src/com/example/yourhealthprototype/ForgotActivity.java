package com.example.yourhealthprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForgotActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgot);

	Button Next = (Button) findViewById(R.id.button1);

		
	//create an onclikc listener for the setup button
	Next.setOnClickListener(new View.OnClickListener() {
   
		@Override
		public void onClick(View v) {
			// make it start the SetupActivity
			Toast.makeText (getApplicationContext(), "email sent!", Toast.LENGTH_LONG).show();
			Intent i = new Intent(ForgotActivity.this, LoginActivity.class);
			startActivity(i);
		}
	});
	
	}
}
