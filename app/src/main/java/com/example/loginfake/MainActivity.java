package com.example.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout mLinearLayout;
    private Button bt_contact;
    private EditText txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = findViewById(R.id.LinearLayout);

        bt_contact = findViewById(R.id.bt_contact);

        txt1 = findViewById(R.id.Edit_Text1);
        txt2 = findViewById(R.id.Edit_Text2);

        bt_contact.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        int ViewId = v.getId();
        Log.i("id", ViewId+"");
        switch (ViewId) {
            case R.id.bt_contact:
                Toast.makeText(MainActivity.this,txt1.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

}

