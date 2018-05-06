package cst.hqu.edu.android.yulianghuang.com.application3;

import android.view.View;
import android.widget.EditText;

public class OutClick implements View.OnClickListener {
    EditText txt;
    public OutClick(EditText mes){
        txt =mes;
    }
    @Override
    public void onClick(View v) {
        txt.setText("外部类被单击了");
    }
}
