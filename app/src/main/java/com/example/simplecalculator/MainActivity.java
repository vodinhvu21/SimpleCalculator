package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView,textView2,textView3,textView4;
    private EditText editText,editText1,editText2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        editText = (EditText) findViewById(R.id.editText);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textView4.setText(" ");
                String kq = " Kết quả là ";
                String text = editText.getText().toString();
                String text2 = editText1.getText().toString();
                String text3 = editText2.getText().toString();
                try {
                    double dou1 = Double.parseDouble(text);
                    double dou2 = Double.parseDouble(text2);
                    switch (text3) {
                        case "+":
                            ;
                            textView4.setText(kq+ (dou1 + dou2));
                            break;
                        case "-":
                            textView4.setText(kq+ (dou1 - dou2));
                            break;
                        case "*":
                            textView4.setText(kq+ dou1 * dou2);
                            break;
                        case "/":
                            textView4.setText(kq+ dou1 / dou2);
                            break;
                        default:
                            Toast.makeText(MainActivity.this, "Bạn nhập sai phép tính", Toast.LENGTH_SHORT).show();

                            break;
                    }


                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Bạn đã nhập chữ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}