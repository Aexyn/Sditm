package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class mapselectionActivity extends Activity {
	/** Called when the activity is first created. */
	Button online, offline;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapselection);

		offline = (Button) findViewById(R.id.button1);
		online = (Button) findViewById(R.id.button2);

		offline.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						mapsActivity.class);
				startActivity(i);

			}
		});

		online.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						onlinemapActivity.class);
				startActivity(i);

			}
		});

	}
}