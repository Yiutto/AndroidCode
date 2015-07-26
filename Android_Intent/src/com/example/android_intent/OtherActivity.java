package com.example.android_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {
	private TextView textView;


	public OtherActivity() {
		// TODO Auto-generated constructor stub
	}
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_other);
	        textView=(TextView)this.findViewById(R.id.msg);
	        Intent intent=getIntent();
	        String name=intent.getStringExtra("name");
	        int age=intent.getIntExtra("age",0);
	        String address=intent.getStringExtra("address");
	        textView.setText("name--->>"+name+"\n"+"age--->>"+age+"\n"+"address--->>"+address+"\n");
	 }

}
