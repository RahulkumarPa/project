package sis.ait.college;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends Activity{
	Button btnSignUp,btnSignIn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_screen);
		getActionBar().setTitle("  Form");
		
		btnSignUp = (Button) findViewById(R.id.btnSignUp);
		btnSignIn = (Button) findViewById(R.id.btnSignIn);
		
		btnSignUp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Sign Up", Toast.LENGTH_LONG).show();
				Intent i = new Intent(FormActivity.this,SignUpActivity.class);
				startActivity(i);
			}
		});
		
		btnSignIn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Sign In", Toast.LENGTH_LONG).show();
				Intent i = new Intent(FormActivity.this,SignInActivity.class);
				startActivity(i);
			}
		});
	}
	
}
