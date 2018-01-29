package com.sysol.educamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button loginBtn;
    private EditText Username;
    private EditText   Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn=(Button)findViewById(R.id.signin_btn);
        Username=(EditText)findViewById(R.id.email);
        Password=(EditText)findViewById(R.id.password);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=Username.getText().toString();
                String pass=Password.getText().toString();
                if((email.equals("admin"))&&(pass.equals("123"))) {
                    Intent i = new Intent(login.this, Maindash.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(getBaseContext(),"Check Password or email",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
