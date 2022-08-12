package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       EditText name = findViewById(R.id.name);
       Button displayName  = findViewById(R.id.displayName);
        TextView textView4 = findViewById(R.id.textView4);

        displayName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4.setText(name.getText().toString());
            }
        });
    }
}