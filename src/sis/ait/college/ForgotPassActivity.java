package sis.ait.college;

import android.app.Activity;
import android.os.Bundle;

public class ForgotPassActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forgot_pass_screen);
		getActionBar().setTitle("  Reset Password");
	}

}
