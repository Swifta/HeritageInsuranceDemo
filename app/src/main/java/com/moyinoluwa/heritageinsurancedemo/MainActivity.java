package com.moyinoluwa.heritageinsurancedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText agentId;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agentId = (EditText) findViewById(R.id.agent_id);
        password = (EditText) findViewById(R.id.password);
    }

    public void moveToNextActivity(View view) {

        if (agentId.getText().toString().equals("agent1") && password.getText().toString()
                .equals("1234")) {
            Intent i = new Intent(this, NavigationActivity.class);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(this, "Either the username or password is not correct.", Toast.LENGTH_SHORT).show();
        }

    }
}
