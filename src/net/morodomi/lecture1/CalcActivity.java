package net.morodomi.lecture1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Activity for Android Lecture 1
 * This controls the input of EditText and Event when the button is clicked.
 * @author Masahiro Morodomi <morodomi at gmail.com>
 */
public class CalcActivity extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// call super method of parent class to process anything needed.
		super.onCreate(savedInstanceState);
		// set main view XML.
		setContentView(R.layout.main);
		// create button instance in this program.
		Button equal = (Button) findViewById(R.id.equal);
		// set click event of button instance.
		equal.setOnClickListener(this);
	}

	/* Called when any instance of this activity which set OnClickListener is click */
	@Override
	public void onClick(View v) {
		// create EditText instance.
		EditText editText1 = (EditText) findViewById(R.id.edit_text_1);
		// get string from EditText instance
		String string1 = editText1.getEditableText().toString();
		// Convert from String type to Integer
		int number1;
		int number2;
		try {
			number1 = Integer.parseInt(string1);
			// You can also write those three line as below.
			number2 = Integer.parseInt(
					((EditText) findViewById(R.id.edit_text_2))
					.getEditableText()
					.toString()
			);
			// Calculate 2 numbers.
			int answer = number1 + number2;

			// Get the view which show the answer.
			TextView textView = (TextView) findViewById(R.id.answer);
			Log.d("Morodomi", String.valueOf(answer));
			// Set the answer to the view.
			textView.setText(String.valueOf(answer));
		} catch(NumberFormatException e) {
			showDialog(1);
		}
	}
}