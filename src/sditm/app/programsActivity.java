package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class programsActivity extends Activity {
	/** Called when the activity is first created. */
	Button btech, mba, eligible, diploma;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.programs);

		btech = (Button) findViewById(R.id.button2);
		mba = (Button) findViewById(R.id.button1);

		diploma = (Button) findViewById(R.id.button3);
		eligible = (Button) findViewById(R.id.button4);

		btech.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						btechActivity.class);
				startActivity(i);
			}
		});

		mba.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						postgraduateActivity.class);
				startActivity(i);
			}
		});

		eligible.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						eligibilityActivity.class);
				startActivity(i);
			}
		});

		diploma.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						diplomaActivity.class);
				startActivity(i);
			}
		});

	}
}