package com.example.internal_files;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * @author  Lior Shem Tov
 * @version	1.1
 * @since	03/03/2025
 * Credits
 */

/**
 * The type Main activity 2.
 */
public class MainActivity2 extends AppCompatActivity {

    /**
     * The Si.
     */
    Intent si;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            si = getIntent();
        }

        @Override
        public boolean onCreateOptionsMenu (Menu menu)
        {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
        }

        public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.it1)
        {
            finish();
        }
        return true;
    }


}