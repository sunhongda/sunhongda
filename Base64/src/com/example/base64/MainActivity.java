package com.example.base64;
import com.ab.util.AbBase64;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity {
	private EditText ed;
	private Button btn;
	private Button btn_jiemi;
 /**
  * andbase 的数据加密和解密方式
  */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 
		 ed = (EditText) findViewById(R.id.ed);
		 btn = (Button) findViewById(R.id.btn);
		 btn_jiemi = (Button) findViewById(R.id.btn_jiemi);
		 
		 btn.setOnClickListener(l);
		 btn_jiemi.setOnClickListener(l);
		 
		init();
		
	}
	   OnClickListener l=new OnClickListener() {
		private byte[] bytes;
		private String encode;

		@Override
		public void onClick(View v) {
             switch (v.getId()) {
			case R.id.btn:  
				String str = ed.getText().toString();
				bytes = str.getBytes(); 
				for(byte b : bytes)
					System.out.println(b);
				
   			encode = AbBase64.encode(bytes);
				Log.e("TAG",""+encode);
				
				break;
			case R.id.btn_jiemi:
				byte[] decode = AbBase64.decode(encode);
				/*for(byte b : decode){
					Log.e("TAG", b+"");
				}*/
				Log.e("TAG","111"+new String(decode));
				
				 break;
			default:
				break;
			}
			
		}
	};
	  //加密base64 
	private void init() {
		   

		   
	}
 

}
