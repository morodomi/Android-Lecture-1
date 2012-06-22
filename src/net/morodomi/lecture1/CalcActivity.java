package net.morodomi.lecture1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends Activity implements OnClickListener {
	/**
	 * Activityが生成された時、 まず初めにAndroid Frameworkにから呼び出されます。
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// 親のクラスのメソッドを呼び、必要な処理をします。
		super.onCreate(savedInstanceState);
		// メインのViewを設定します。
		setContentView(R.layout.main);
		// ボタンインスタンスを作成します。
		Button equal = (Button) findViewById(R.id.equal);
		// ボタンインスタンスに対して、クリックされた時のイベントを設定します。
		equal.setOnClickListener(this);
	}

	// ボタンがクリックされると、このメソッドが呼び出されます。
	@Override
	public void onClick(View v) {
		// EditTextのインスタンスを作成します。
		EditText editText1 = (EditText) findViewById(R.id.edit_text_1);
		// インスタンスから文字列を抜き出します。
		String string1 = editText1.getEditableText().toString();
		// String型をInteger型へ変換します。
		int number1 = Integer.parseInt(string1);
		
		// こんなふうにも書けます。
		int number2 = Integer.parseInt(
				((EditText) findViewById(R.id.edit_text_2))
				.getEditableText()
				.toString()
		);

		// この2つの数字を計算します。
		int answer = number1 + number2;

		// 計算結果を表示するViewを取得します。
		TextView textView = (TextView) findViewById(R.id.answer);
		// Viewに結果を書き出します。
		textView.setText(String.valueOf(answer));
	}
}