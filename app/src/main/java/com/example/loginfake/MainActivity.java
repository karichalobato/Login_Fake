package com.example.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{
    private LinearLayout mLinearLayout;
    private Button bt_contact;
    private EditText txt1,txt2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = findViewById(R.id.LinearLayout);

        bt_contact = findViewById(R.id.bt_contact);
        txt1 = findViewById(R.id.Edit_Text1);
        txt2 = findViewById(R.id.Edit_Text2);
        textView = findViewById(R.id.textView_print);

       bt_contact.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               textView.setText(txt1.getText());
           }
       });

       bt_contact.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View v) {
               textView.setText(txt2.getText());
               return true;
           }
       });


    }
    /*
    @Override
    public void onClick(View v){
        int ViewId = v.getId();
        Log.i("id", ViewId+"");
        switch (ViewId) {
            case R.id.bt_contact:
                Toast.makeText(MainActivity.this,textView.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
    }*/
}

