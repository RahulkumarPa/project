package sis.ait.college;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        Thread splash = new Thread(){
        	public void run(){
        		try{
					sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
        		Intent i=new Intent(MainActivity.this,FormActivity.class);
                startActivity(i);
				}
        	}
        };
     splash.start();
   }
    
}
