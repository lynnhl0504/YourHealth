package com.example.yourhealthprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button logIn = (Button) findViewById(R.id.button1);
		Button signUp = (Button) findViewById(R.id.button2);
		Button help = (Button) findViewById(R.id.button3);
		
		//create an onclick listener for the login button
		logIn.setOnClickListener(new View.OnClickListener() {
					
				@Override
			public void onClick(View v) { 
					// make it start the LoginActivity
					Intent i = new Intent(MainActivity.this, LoginActivity.class);
					startActivity(i);
				}
			});
			//create an onclikc listener for the setup button
			signUp.setOnClickListener(new View.OnClickListener() {
		   
				@Override
				public void onClick(View v) {
					// make it start the SetupActivity
					Log.i("Setup", "Hello World");
					Intent i = new Intent(MainActivity.this, SignUpActivity.class);
					startActivity(i);
				}
			});
			
			//create an onclikc listener for the setup button
			help.setOnClickListener(new View.OnClickListener() {
		   
				@Override
				public void onClick(View v) {
					// make it start the SetupActivity
					Log.i("Setup", "Hello World");
					Intent i = new Intent(MainActivity.this, HelpActivity.class);
					startActivity(i);
				}
			});


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
