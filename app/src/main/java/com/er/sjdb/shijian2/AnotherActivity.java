package com.er.sjdb.shijian2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sjdb on 2017/9/15.
 */

public class AnotherActivity extends AppCompatActivity {
    TextView editText2;
    EditText editText;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        editText2=(TextView) findViewById(R.id.textView4);
        intent=getIntent();
        editText=(EditText)findViewById(R.id.editText2);
        editText2.setText(intent.getStringExtra("sendto2"));
        Button bt1=(Button)findViewById(R.id.botton2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sendto1",editText.getText().toString());
                setResult(0,intent);
                finish();
            }
        });

    }
}
