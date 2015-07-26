package com.example.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View{
	public float currentX=40;
	public float currentY=50;
//	定义、并创建画笔
	Paint p=new Paint();
	public DrawView(Context context) {
		super(context);//引用父类，context是Activity的父类
	}
	public DrawView(Context context,AttributeSet set) {
		super(context,set);
	}
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
//		设置画笔颜色
		p.setColor(Color.RED);
//		绘制一个小圆（作为小球）
		canvas.drawCircle(currentX, currentY, 20, p);
	}
//	为该组件的触摸屏事件重写事件处理方法
	@SuppressLint("ClickableViewAccessibility") public boolean onTouchEvent(MotionEvent event) {
//		修改currentX，currentY两个属性
		currentX=event.getX();
		currentY=event.getY();
//		通知当前组件重绘自己
		invalidate();
//		返回true表明该处理方法已经处理该事件
		return true;
	}
}
