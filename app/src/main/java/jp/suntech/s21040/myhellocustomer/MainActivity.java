package jp.suntech.s21040.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.button3);
        HelloListener listener = new HelloListener();   //リスナのインスタンス作成
        btClick.setOnClickListener(listener);           //ボタンにリスナを組み込む

        Button btClear1 = findViewById(R.id.tbHouse);
        btClear1.setOnClickListener(listener);

        Button btClear2 = findViewById(R.id.tbName);
        btClear2.setOnClickListener(listener);
    }

    private  class HelloListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            //名前入力欄であるEditTextオブジェクトを取得
            EditText input1 = findViewById(R.id.etHouse);
            EditText input2 = findViewById(R.id.etName);
            //メッセージを表示するfindViewオブジェクトを取得
            TextView output1 = findViewById(R.id.tvOutput);
            //TextView output2 = findViewById(R.id.tvOutput);
            String inputStr1 = input1.getText().toString();
            //output1.setText(inputStr1 + "に住まいの");
            String inputStr2 = input2.getText().toString();
            output1.setText(inputStr1 + "に住まいの" + inputStr2 + "さん、こんにちは！");

            int id = view.getId();
            switch(id) {
                case R.id.tbHouse:
                    input1.setText("");
                    output1.setText("");
                    break;
                case R.id.tbName:
                    input2.setText("");
                    output1.setText("");
                    break;
            }
        }
    }
}