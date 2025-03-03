package com.example.internal_files;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity
{
    TextView tv1;
    EditText eD1;
    private final String FILENAME = "Lior.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weddings();
        try
        {
            read();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }


    }

    public void weddings()
    {
        tv1 = (TextView) findViewById(R.id.tv1);
        eD1 = (EditText) findViewById(R.id.eD1);
    }

    public void read() throws IOException {
        FileInputStream fIS= openFileInput(FILENAME);
        InputStreamReader iSR = new InputStreamReader(fIS);
        BufferedReader bR = new BufferedReader(iSR);
        StringBuilder sB = new StringBuilder();
        String line = bR.readLine();
        while (line != null) {
            sB.append(line+'\n');
            line = bR.readLine();
        }
        bR.close();
        iSR.close();
        fIS.close();
        tv1.setText(sB.toString());
    }
    public void write() throws IOException {
        FileOutputStream fOS = openFileOutput(FILENAME,MODE_PRIVATE);
        OutputStreamWriter oSW = new OutputStreamWriter(fOS);
        BufferedWriter bW = new BufferedWriter(oSW);
        bW.write("ss");
        bW.close();
        oSW.close();
        fOS.close();
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.it2)
        {
            Intent si = new Intent(this, MainActivity2.class);
            startActivity(si);
        }
        return true;
    }

}