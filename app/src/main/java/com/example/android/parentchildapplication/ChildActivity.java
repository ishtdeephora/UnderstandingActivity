package com.example.android.parentchildapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);


    }

    @Override
    protected void onStart() {
        super.onStart();
        final Button ParentBtn=(Button)findViewById(R.id.parentButton);
        ParentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ChildActivity.this, ParentActivity.class );
                startActivity(i);
            }
        });
        Toast.makeText(this, "Child Activity onStart", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Child Activity onResume", Toast.LENGTH_LONG).show();
    }
}
