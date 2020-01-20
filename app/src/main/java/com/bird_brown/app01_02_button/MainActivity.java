package com.bird_brown.app01_02_button;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button1);      // ボタンのオブジェクト取得
        b.setOnClickListener(this);                         // ボタンをリスナ登録する
    }

    @Override
    public void onClick(View view) {    // 自動生成メソッドで引数viewにクリックしたボタン情報が渡される
        TextView t = (TextView)findViewById(R.id.textView1);    // TextViewオブジェクトを取得
        t.setText("こんにちは");                             // TextViewに文字列「こんにちは」を設定

        //  ボタンを複数使用する場合の手法
        //  if (view.getId() == R.id.button1) {
        //     t.setText("こんにちは");
        // }
    }
}
