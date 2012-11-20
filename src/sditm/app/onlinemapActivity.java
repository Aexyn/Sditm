package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class onlinemapActivity extends Activity {
	/** Called when the activity is first created. */
	Button delhi, panipat, chandigarh;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onlinemap);

		delhi = (Button) findViewById(R.id.button1);
		panipat = (Button) findViewById(R.id.button2);
		chandigarh = (Button) findViewById(R.id.button3);

		delhi.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Uri uri = Uri.parse("http://g.co/maps/8rd5v");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);

			}
		});

		panipat.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Uri uri = Uri.parse("http://g.co/maps/yge4g");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);

			}
		});

		chandigarh.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Uri uri = Uri.parse("http://g.co/maps/343xy");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);

			}
		});

	}
}