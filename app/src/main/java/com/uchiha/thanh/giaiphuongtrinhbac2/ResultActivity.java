package com.uchiha.thanh.giaiphuongtrinhbac2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView txtKQ;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtKQ = (TextView) findViewById(R.id.txtResult);
        btnBack = (Button) findViewById(R.id.btnBack);
        //get lay intent da goi resultActivity
        Intent callIntent = getIntent();

        //get lay bundle da gui
        Bundle packBundle = callIntent.getBundleExtra("MyPackage");
        //lay gia tri a,b
        final int a = packBundle.getInt("soa");
        int b = packBundle.getInt("sob");
        giaiPTB2(a,b);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });

    }
    public void giaiPTB2(int a, int b){
        if(a==0){
            if(b==0){
                txtKQ.setText("Phuong trinh vo so nghiem");
                return;
            }
            else{
                txtKQ.setText("Phuong trinh vo nghiem");
            }
        }else {
            float kq = (-1) * b /(float)a;
            txtKQ.setText("Kết quả : " + kq);
        }
    }
}
