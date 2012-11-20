package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class admissionActivity extends Activity {
	/** Called when the activity is first created. */

	Button app, prospectus, scholar, faq, counselling;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admission);

		app = (Button) findViewById(R.id.button1);
		prospectus = (Button) findViewById(R.id.button2);
		scholar = (Button) findViewById(R.id.button3);
		counselling = (Button) findViewById(R.id.button4);
		faq = (Button) findViewById(R.id.button5);

		app.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						formActivity.class);
				startActivity(i);
			}
		});

		prospectus.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri uri = Uri
						.parse("http://design.trademart.in/sample/ncce/sditm-brochure.pdf");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});

		scholar.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						scholarActivity.class);
				startActivity(i);
			}
		});

		counselling.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						counsellingActivity.class);
				startActivity(i);
			}
		});

		faq.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						faqActivity.class);
				startActivity(i);
			}
		});

	}
}