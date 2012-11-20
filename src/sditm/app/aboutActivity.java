package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class aboutActivity extends Activity {
	/** Called when the activity is first created. */
	Button ysd, govt, infra, faculty, research, extra, training;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);

		ysd = (Button) findViewById(R.id.button1);
		govt = (Button) findViewById(R.id.button2);
		infra = (Button) findViewById(R.id.button3);
		faculty = (Button) findViewById(R.id.button4);
		research = (Button) findViewById(R.id.button5);
		extra = (Button) findViewById(R.id.button6);
		training = (Button) findViewById(R.id.button7);

		ysd.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						ysdActivity.class);
				startActivity(i);

			}
		});

		govt.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						govtActivity.class);
				startActivity(i);

			}
		});

		infra.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						infraActivity.class);
				startActivity(i);

			}
		});

		faculty.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						facultyActivity.class);
				startActivity(i);

			}
		});

		research.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						researchActivity.class);
				startActivity(i);

			}
		});

		extra.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						extraactivitiesActivity.class);
				startActivity(i);

			}
		});

		training.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(),
						trainingActivity.class);
				startActivity(i);

			}
		});

	}
}