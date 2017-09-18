package com.uchiha.thanh.giaiphuongtrinhbac2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnKQ;
    EditText edta, edtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKQ = (Button) findViewById(R.id.btnKQ);
        edta = (EditText) findViewById(R.id.edtA);
        edtb = (EditText) findViewById(R.id.edtB);
        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //tao intent de mo class resultActivity
                Intent myIntent = new Intent(MainActivity.this,ResultActivity.class);
                String numa = edta.getText().toString();
                String numb = edtb.getText().toString();




                int a = Integer.parseInt(numa);
                int b = Integer.parseInt(numb);

                //khai bao bundle de dong bo khoi du lieu sang ResultActivity
                Bundle bundle = new Bundle();
                bundle.putInt("soa",a);
                bundle.putInt("sob",b);

                //dua bundle vao intent
                myIntent.putExtra("MyPackage",bundle);
                //mo ResultActivity thong qua intent
                startActivity(myIntent);
            }
        });


    }
}
