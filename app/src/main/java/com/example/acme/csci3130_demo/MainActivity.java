package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText Text_Field;
    Button Copy_Button;
    TextView textAppear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text_Field = (EditText) this.findViewById(R.id.Text_Field);
        Copy_Button = (Button) this.findViewById(R.id.Copy_Button);
        textAppear = (TextView) this.findViewById(R.id.textAppear);
    }
    public void Copied(View v){
        String msg = Text_Field.getText().toString();
        if(this.notPassword(msg)==true && this.atleastEight(msg)==true&&this.atleastNine(msg)==true&&this.atleastTen(msg)==true&&this.atleastEleven(msg)==true)
        textAppear.setText("Strong!");
        else
            textAppear.setText("Not Strong!");
    }
    public boolean notPassword(String m){
        boolean nP = !m.equalsIgnoreCase("password");
        return nP;
    }
    public boolean atleastEight(String m){
        boolean nP = m.toString().length()>7;
        return nP;
    }
    public boolean atleastNine(String m){
        boolean nP = m.toString().length()>8;
        return nP;
    }
    public boolean atleastTen(String m){
        boolean nP = m.toString().length()>9;
        return nP;
    }
    public boolean atleastEleven(String m){
        boolean nP = m.toString().length()>10;
        return nP;
    }
}