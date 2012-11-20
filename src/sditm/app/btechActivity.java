package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class btechActivity extends Activity {
	/** Called when the activity is first created. */

	Button cse, ece, it, mech, civil;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.btech);

		cse = (Button) findViewById(R.id.button1);
		ece = (Button) findViewById(R.id.button2);
		mech = (Button) findViewById(R.id.button4);
		it = (Button) findViewById(R.id.button3);
		civil = (Button) findViewById(R.id.button5);

		cse.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						cseActivity.class);
				startActivity(i);
			}
		});

		ece.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						eceActivity.class);
				startActivity(i);
			}
		});

		it.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(), itActivity.class);
				startActivity(i);
			}
		});

		mech.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						mechanicalActivity.class);
				startActivity(i);
			}
		});

		civil.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						civilActivity.class);
				startActivity(i);
			}
		});

	}
}