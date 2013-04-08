package kr.example.testbutton;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TestbuttonmainActivity extends Activity implements OnClickListener {
	//멀티스레드를 쓸 일이 없기때문에 변수로 선언해서 써도 무관
	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testbuttonmain);

		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	tv.setText("가위를 냈습니다.");
		    }
		});
		
		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	TextView textview = (TextView)findViewById(R.id.test_text_view);
		    	tv.setText("바위를 냈습니다.");
		    }
		});
		
		Button button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	TextView textview = (TextView)findViewById(R.id.test_text_view);
		    	tv.setText("보를 냈습니다.");
		    }
		});
	}

	@Override
	public void onClick(View v) {
	}

}
