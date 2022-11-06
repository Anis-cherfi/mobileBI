package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        Button btnconnect1java=findViewById(R.id.btnconnect1);
        btnconnect1java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userjava =findViewById(R.id.txtuser);
                EditText pwdjava = findViewById(R.id.txtpwd);
                String userstr = userjava.getText().toString();
                String pwdstr = pwdjava.getText().toString();
                TextView txtmsgjava =findViewById(R.id.txtmsg);
                txtmsgjava.setText(userstr +" "+ pwdstr);

                TextView txterroruserjava=findViewById(R.id.txterroruser);
                TextView txterrorpwdjava =findViewById(R.id.txterrorpwd);
                Boolean valid= Boolean.TRUE;
                if(userstr.matches("")){
                    txterroruserjava.setText("Ce champ est requis!");
                    valid= Boolean.FALSE;
                }else{
                    txterroruserjava.setText("");
                   
                }

                if(pwdstr.matches("")){
                    txterrorpwdjava.setText("Ce champ est requis!");
                    valid= Boolean.FALSE;
                }else{
                    txterrorpwdjava.setVisibility(View.INVISIBLE);
                    
                }

                if(valid){
                    Intent Activity3 = new Intent(MainActivity.this, Activity3.class);
                    Activity3.putExtra("username", userstr);
                    startActivity(Activity3);
                }


            }
        });




    }
}
