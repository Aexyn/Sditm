package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class SditmActivity extends Activity {
	/** Called when the activity is first created. */
	ImageView front;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		front = (ImageView) findViewById(R.id.imageView1);

		front.setClickable(true);

		front.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), page1.class);
				startActivity(i);

			}
		});
	}
}