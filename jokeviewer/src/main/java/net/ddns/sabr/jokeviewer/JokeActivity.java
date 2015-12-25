package net.ddns.sabr.jokeviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String j = getIntent().getStringExtra("joke");

        TextView jokeText = (TextView) findViewById(R.id.jokeText);

        jokeText.setText(j);
    }

}
