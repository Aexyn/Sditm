package sditm.app;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class retriveActivity extends Activity {
	/** Called when the activity is first created. */
	EditText name, age, address, n;
	Button retrive;
	databaseforsubscribe addressBook;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.retrive);

		addressBook = new databaseforsubscribe(this, "addressDB", null, 2);
		name = (EditText) findViewById(R.id.editText1);
		age = (EditText) findViewById(R.id.editText2);
		address = (EditText) findViewById(R.id.editText3);
		n = (EditText) findViewById(R.id.editText4);

		retrive = (Button) findViewById(R.id.button3);

		retrive.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (n.getText().toString().equals(""))
					Toast.makeText(getApplicationContext(), "Enter record no.",
							Toast.LENGTH_SHORT).show();
				else {
					SQLiteDatabase database = addressBook.getWritableDatabase();
					Cursor row = database.query("Addressbook", null, null,
							null, null, null, null);
					Boolean found = false;
					while (row.moveToNext())
						if (Integer.parseInt(row.getString(0)) == Integer
								.parseInt(n.getText().toString())) {
							name.setText(row.getString(1));
							age.setText(row.getString(2));
							address.setText(row.getString(3));
							found = true;
							break;
						}
					if (!found)
						Toast.makeText(getApplicationContext(),
								"No data with this no.", Toast.LENGTH_SHORT)
								.show();
					row.close();
				}
			}
		});

	}
}