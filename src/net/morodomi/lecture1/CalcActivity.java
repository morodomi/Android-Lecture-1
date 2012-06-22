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
	 * Activity���������ꂽ���A �܂����߂�Android Framework�ɂ���Ăяo����܂��B
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// �e�̃N���X�̃��\�b�h���ĂсA�K�v�ȏ��������܂��B
		super.onCreate(savedInstanceState);
		// ���C����View��ݒ肵�܂��B
		setContentView(R.layout.main);
		// �{�^���C���X�^���X���쐬���܂��B
		Button equal = (Button) findViewById(R.id.equal);
		// �{�^���C���X�^���X�ɑ΂��āA�N���b�N���ꂽ���̃C�x���g��ݒ肵�܂��B
		equal.setOnClickListener(this);
	}

	// �{�^�����N���b�N�����ƁA���̃��\�b�h���Ăяo����܂��B
	@Override
	public void onClick(View v) {
		// EditText�̃C���X�^���X���쐬���܂��B
		EditText editText1 = (EditText) findViewById(R.id.edit_text_1);
		// �C���X�^���X���當����𔲂��o���܂��B
		String string1 = editText1.getEditableText().toString();
		// String�^��Integer�^�֕ϊ����܂��B
		int number1 = Integer.parseInt(string1);
		
		// ����Ȃӂ��ɂ������܂��B
		int number2 = Integer.parseInt(
				((EditText) findViewById(R.id.edit_text_2))
				.getEditableText()
				.toString()
		);

		// ����2�̐������v�Z���܂��B
		int answer = number1 + number2;

		// �v�Z���ʂ�\������View���擾���܂��B
		TextView textView = (TextView) findViewById(R.id.answer);
		// View�Ɍ��ʂ������o���܂��B
		textView.setText(String.valueOf(answer));
	}
}