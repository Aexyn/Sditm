package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class extraActivity extends Activity {
	/** Called when the activity is first created. */
	Button subscribe;
	TextView develop;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.extra);

		subscribe = (Button) findViewById(R.id.button1);
		develop = (TextView) findViewById(R.id.textView2);
		develop.setClickable(true);

		subscribe.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						subscribeActivity.class);
				startActivity(i);

			}
		});
		develop.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(
						getApplicationContext(),
						"Aman Talwar (+919992999250) & Ankit Ahuja (+918950471451)",
						Toast.LENGTH_LONG).show();
			}
		});

	}
}