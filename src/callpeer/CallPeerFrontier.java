package callpeer;


import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class CallPeerFrontier extends Activity {
	
	Button next;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(callpeer.gen.R.layout.front);
		next =(Button) findViewById(R.id.button1);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent bigiy= new Intent("android.intent.action.MAIN");
				startActivity(bigiy);
			}
		});
				
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
	
	
	
	

}
