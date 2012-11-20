package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class facultyloginActivity extends Activity {
	Button login;
	/** Called when the activity is first created. */
	EditText name, password;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facultylogin);

		name = (EditText) findViewById(R.id.editText1);
		password = (EditText) findViewById(R.id.editText2);

		login = (Button) findViewById(R.id.button1);

		login.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				if (name.getText().toString().equals("sditm")
						&& password.getText().toString().equals("ankitaman")) {

					Intent i = new Intent(getApplicationContext(),
							retriveActivity.class);
					startActivity(i);

				}

				else
					Toast.makeText(getApplicationContext(),
							"Invalid Name or Password", Toast.LENGTH_SHORT)
							.show();

			}
		});

	}
}