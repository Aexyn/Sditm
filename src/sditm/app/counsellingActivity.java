package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class counsellingActivity extends Activity {
	/** Called when the activity is first created. */

	Button hscs;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counselling);

		hscs = (Button) findViewById(R.id.button1);

		hscs.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Uri uri = Uri.parse("http://www.hscs.org/");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);

			}
		});

	}
}