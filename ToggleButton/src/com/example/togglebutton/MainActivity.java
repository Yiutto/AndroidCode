package com.example.togglebutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends Activity {
	ToggleButton toggle;
	Switch switcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggle=(ToggleButton)findViewById(R.id.toggle);
        switcher=(Switch)findViewById(R.id.switcher);
        final LinearLayout test=(LinearLayout)findViewById(R.id.test);
        OnCheckedChangeListener listener=new OnCheckedChangeListener() {
        	@Override
        	public void onCheckedChanged(CompoundButton	button, boolean isChecked) {
        		if (isChecked)
        		{
//        			����LinearLayout��ֱ����
        			test.setOrientation(1);
        		}
        		else
        		{
//        			����LinearLayoutˮƽ����
        			test.setOrientation(0);
        		}
        	}
			
		};
        toggle.setOnCheckedChangeListener(listener);
        switcher.setOnCheckedChangeListener(listener);
    }

}
