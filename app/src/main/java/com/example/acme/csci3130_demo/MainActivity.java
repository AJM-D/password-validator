package com.example.acme.csci3130_demo;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText Text_Field;
    Button Copy_Button;
    ClipboardManager cbm;
    ClipData cd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Copy_Button = (Button) this.findViewById(R.id.Copy_Button);
        Text_Field = (EditText) this.findViewById(R.id.Text_Field);
        cbm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
    }
    public void Copied(View v){
        cd =ClipData.newPlainText("text", Text_Field.getText().toString());
        cbm.setPrimaryClip(cd);
    }

}
