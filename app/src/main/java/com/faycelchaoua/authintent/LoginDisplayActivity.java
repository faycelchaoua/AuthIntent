package com.faycelchaoua.authintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginDisplayActivity extends AppCompatActivity {

    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display);

        Intent intent = getIntent();
        TextView loginDisplay = (TextView) findViewById(R.id.email_display);
        TextView passwordDisplay = (TextView) findViewById(R.id.password_display);

        if (intent != null) {
            loginDisplay.setText(intent.getStringExtra(EXTRA_LOGIN));
            passwordDisplay.setText(intent.getStringExtra(EXTRA_PASSWORD));
        }

    }
}

