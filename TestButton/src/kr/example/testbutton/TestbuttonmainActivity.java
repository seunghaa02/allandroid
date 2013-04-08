package kr.example.testbutton;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TestbuttonmainActivity extends Activity implements OnClickListener {
	static final int[] BUTTONS = {
		R.id.button1,
		R.id.button2,
		R.id.button3
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testbuttonmain);
		
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	TextView textview = (TextView)findViewById(R.id.test_text_view);
		    	textview.setText("가위를 냈습니다.");
		    	Log.i("가위를 냈습니다.","is Clicked");
		    }
		});
		
		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	TextView textview = (TextView)findViewById(R.id.test_text_view);
		    	textview.setText("바위를 냈습니다.");
		    	Log.i("바위를 냈습니다","is Clicked");
		    }
		});
		
		Button button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	TextView textview = (TextView)findViewById(R.id.test_text_view);
		    	textview.setText("보를 냈습니다.");
		    	Log.i("보를 냈습니다.","is Clicked");
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.testbuttonmain, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
