package yiutto.chronometer;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Chronometer.OnChronometerTickListener;
public class MainActivity extends Activity {
	Chronometer ch;
	Button start;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// ��ȡ��ʱ�����
		ch = (Chronometer) findViewById(R.id.test);
		// ��ȡ����ʼ����ť
		start = (Button) findViewById(R.id.start);
		start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View source) {
				// ���ÿ�ʼ��ʱʱ��
				ch.setBase(SystemClock.elapsedRealtime());
				// ������ʱ��
				ch.start();
				start.setEnabled(false);
			}
		});
		// ΪChronometer���¼�������
		ch.setOnChronometerTickListener(new OnChronometerTickListener() {

			@Override
			public void onChronometerTick(Chronometer ch) {
				// ����ӿ�ʼ��ʱ�����ڳ���20s
				if (SystemClock.elapsedRealtime() - ch.getBase() > 20 * 1000) {
					ch.stop();
					start.setEnabled(true);
				}

			}
		});

	}

}