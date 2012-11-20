package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class diplomaActivity extends Activity {
	/** Called when the activity is first created. */
	Button mech, civil;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diploma);

		mech = (Button) findViewById(R.id.button2);
		civil = (Button) findViewById(R.id.button1);

		mech.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						mechdpActivity.class);
				startActivity(i);
			}
		});

		civil.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						civildpActivity.class);
				startActivity(i);
			}
		});
	}
}