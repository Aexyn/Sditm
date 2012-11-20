package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class subscribeActivity extends Activity {
	/** Called when the activity is first created. */
	EditText name, age, address;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subscribe);

		Button store = (Button) findViewById(R.id.button1);

		name = (EditText) findViewById(R.id.editText1);
		age = (EditText) findViewById(R.id.editText2);
		address = (EditText) findViewById(R.id.editText3);

		store.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s = new String();
				String m = new String();
				String n = new String();
				s = name.getText().toString();
				m = age.getText().toString();
				n = address.getText().toString();
				Intent i = new Intent(Intent.ACTION_SEND);
				i.setType("text/plain");

				i.putExtra(Intent.EXTRA_EMAIL,
						new String[] { "cse.sditm@gmail.com" });
				i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
				i.putExtra(Intent.EXTRA_TEXT, "NAME: " + s + " ; MOBILE: " + m
						+ " ; EMAIL: " + n);
				try {
					startActivity(Intent.createChooser(i, "Send mail..."));
				} catch (android.content.ActivityNotFoundException ex) {
					Toast.makeText(subscribeActivity.this,
							"There are no email clients installed.",
							Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

}