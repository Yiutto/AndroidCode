package com.example.checkbutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	RadioGroup rg;
	TextView show;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// ��ȡ������rg��show�������
		rg = (RadioGroup) findViewById(R.id.rg);
		show = (TextView) findViewById(R.id.show);
		// ΪRadioGroup�����OnCheck�¼����¼�������
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// �����û���ѡ�ĵ�ѡ��ť����̬�ı�tip�ַ�����ֵ
				String tip = checkedId == R.id.male ? "�����Ա�������" : "�����Ա���Ů��";
				// �޸�show����е��ı���
				show.setText(tip);
			}
		});
	}

}
