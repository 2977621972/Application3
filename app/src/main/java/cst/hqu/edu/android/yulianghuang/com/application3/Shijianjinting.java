package cst.hqu.edu.android.yulianghuang.com.application3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Shijianjinting extends AppCompatActivity implements View.OnClickListener {
    EditText txt;
    Button button5;
    Button button6;
    Button button7;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shijianjinting);
        txt =(EditText) findViewById(R.id.edit_text);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button5.setOnClickListener(new MyClickListener() );
        button6.setOnClickListener(new OutClick(txt));
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("匿名内部类被单击");
            }
        });
        button8.setOnClickListener(this);
        Button button =(Button)findViewById(R.id.f2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            txt.setText("内部类按钮被单击了");
        }
    }

    @Override
    public void onClick(View v){
        txt.setText("Activity被单击了");
    }
    public void clickHandler(View source){
        txt.setText("绑定到标签被单击了");
    }
}
