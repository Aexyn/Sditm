package sditm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class page1 extends Activity {
	/** Called when the activity is first created. */
	ImageView about, programs, alumini, admission, maps, extra, news, sdtext,
			contact, gallery;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page1);

		admission = (ImageView) findViewById(R.id.imageView1);
		maps = (ImageView) findViewById(R.id.imageView2);
		alumini = (ImageView) findViewById(R.id.imageView3);
		news = (ImageView) findViewById(R.id.imageView4);
		programs = (ImageView) findViewById(R.id.imageView5);
		about = (ImageView) findViewById(R.id.imageView6);
		extra = (ImageView) findViewById(R.id.imageView7);
		sdtext = (ImageView) findViewById(R.id.imageView8);
		contact = (ImageView) findViewById(R.id.imageView9);
		gallery = (ImageView) findViewById(R.id.imageView10);

		admission.setClickable(true);
		about.setClickable(true);
		news.setClickable(true);
		alumini.setClickable(true);
		programs.setClickable(true);
		maps.setClickable(true);
		extra.setClickable(true);
		contact.setClickable(true);
		gallery.setClickable(true);

		about.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-gener2ated method stub
				about.setImageResource(R.drawable.helps);
				Intent i = new Intent(getApplicationContext(),aboutActivity.class);
				startActivity(i);
				// Thread.sleep(1500);
				// Toast.makeText(getApplicationContext(), "Enter all fields",
				// Toast.LENGTH_SHORT).show();
				// about.setImageResource(R.drawable.help);

			}

		});

		gallery.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				// gallery.setImageResource(R.drawable.gallerys);
				Intent i = new Intent(getApplicationContext(),
						galryActivity.class);
				startActivity(i);
				gallery.setImageResource(R.drawable.gallerys);
			}
		});

		admission.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				admission.setImageResource(R.drawable.addmissio_n);
				Intent i = new Intent(getApplicationContext(),
						admissionActivity.class);
				startActivity(i);
			}
		});

		programs.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				programs.setImageResource(R.drawable.coursess);
				Intent i = new Intent(getApplicationContext(),
						programsActivity.class);
				startActivity(i);
			}
		});

		maps.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				maps.setImageResource(R.drawable.maps);
				Intent i = new Intent(getApplicationContext(),
						mapselectionActivity.class);
				startActivity(i);
			}
		});

		news.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				news.setImageResource(R.drawable.news);
				Intent i = new Intent(getApplicationContext(),
						registerActivity.class);
				startActivity(i);
			}
		});

		extra.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				extra.setImageResource(R.drawable.extrra);
				Intent i = new Intent(getApplicationContext(),
						extraActivity.class);
				startActivity(i);
			}
		});

		alumini.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				alumini.setImageResource(R.drawable.faculty);
				Intent i = new Intent(getApplicationContext(),
						aluminiActivity.class);
				startActivity(i);
			}
		});

		contact.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				contact.setImageResource(R.drawable.contactuss);
				Intent i = new Intent(getApplicationContext(),
						contactusActivity.class);
				startActivity(i);
			}
		});
	}

	@Override
	protected void onResume() {
		about.setImageResource(R.drawable.help);
		admission.setImageResource(R.drawable.admission);
		alumini.setImageResource(R.drawable.ffaculy);
		maps.setImageResource(R.drawable.map);
		news.setImageResource(R.drawable.newss);
		extra.setImageResource(R.drawable.eextra);
		programs.setImageResource(R.drawable.courses);
		contact.setImageResource(R.drawable.contactus);
		gallery.setImageResource(R.drawable.gallery);
		super.onResume();
	}
}