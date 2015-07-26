package com.example.pictureliulan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class Main extends Activity {
	//����һ������ͼƬ������
	int[] images = new int[]
			{R.drawable.bill1,
			R.drawable.bill2,
			R.drawable.bill3,
			R.drawable.bill4,
			R.drawable.bill5};
	int currentImg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        ��ȡLinearLayout��������
        LinearLayout main=(LinearLayout)findViewById(R.id.root);
//        ���򴴽�ImageView���
        final ImageView image=new ImageView(this);
//        ��ImageView�����ӵ�LinearLayout����������
        main.addView(image);
//        ��ʼ��ʱ��ʾ��һ��ͼƬ
        image.setImageResource(images[0]);
        image.setOnClickListener(new OnClickListener()
        {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				image.setImageResource(images[++currentImg%images.length]);
			}
		});
    }


   
}
