package com.example.gridlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;


public class MainActivity extends Activity {
	GridLayout gridLayout;
//	����16����ť���ı�
	String[] chars=new String[]{
		"7","8","9","/",
		"4","5","6","*",
		"1","2","3","-",
		".","0","=","+",
	};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridLayout=(GridLayout)findViewById(R.id.root);
        for (int i = 0; i < chars.length; i++) {
			Button bn=new Button(this);
			bn.setText(chars[i]);
//			���øð�ť���ֺŴ�С
			bn.setTextSize(40);
//			ָ����������ڵ���
			GridLayout.Spec rowSpec=GridLayout.spec(i/4+2);
//			ָ����������ڵ���
			GridLayout.Spec columnSpec=GridLayout.spec(i%4);
			GridLayout.LayoutParams params=new GridLayout.LayoutParams(rowSpec,columnSpec);
//			ָ�������ռ��������
			params.setGravity(Gravity.FILL);
			gridLayout.addView(bn,params);
			}
    }
}
