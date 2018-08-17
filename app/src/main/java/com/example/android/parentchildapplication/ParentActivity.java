package com.example.android.parentchildapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "Parent Activity onCreate",Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_parent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        final Button childBtn=(Button)findViewById(R.id.childButton);
        childBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ParentActivity.this, ChildActivity.class );
                startActivity(i);
            }
        });
        Toast.makeText(this, "Parent Activity onStart", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Parent Activity onResume", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Parent Activity onPause", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Parent Activity onStop", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Parent Activity onRestart", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Parent Activity onDestroy", Toast.LENGTH_LONG).show();
    }


}
