package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class mapsActivity extends Activity {
	/** Called when the activity is first created. */
	Button delhi, panipat, chandigarh;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maps);

		delhi = (Button) findViewById(R.id.button1);
		panipat = (Button) findViewById(R.id.button2);
		chandigarh = (Button) findViewById(R.id.button3);

		delhi.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						fromdelhiActivity.class);
				startActivity(i);

			}
		});

		panipat.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						frompanipatActivity.class);
				startActivity(i);

			}
		});

		chandigarh.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						fromchandigarhActivity.class);
				startActivity(i);

			}
		});

	}
}