
package com.example.seulgichoi.mipossible;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MonthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.month_main);

        Button button1 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                //Intent intent = new Intent(DayActivity.this, MainActivity.class);
                //startActivity(intent);
                finish();
            }
        });
    }
}
