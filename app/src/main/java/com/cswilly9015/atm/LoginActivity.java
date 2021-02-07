package com.cswilly9015.atm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.cswilly9015.atm.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void login(View view) {
        String userid = binding.userid.getText().toString();
        String passwd = binding.passwd.getText().toString();
        if ("willy".equals(userid) && "123456".equals(passwd)){
            finish();
        }
    }

    public void quit(View view) {

    }
}