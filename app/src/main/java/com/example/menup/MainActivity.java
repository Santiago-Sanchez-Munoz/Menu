package com.example.menup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.item1) {//Para la selección del idioma español
            //Se llama a un activity donde el idioma sea español
            Intent intent = new Intent(MainActivity.this, Espanol.class);
            startActivity(intent);
        }else if(id==R.id.item2){
            //Se llama al activity donde cambia el idioma a ingles
            Intent intent = new Intent(MainActivity.this, Ingles.class);
            startActivity(intent);
        }else if(id==R.id.item3){
            //Se llama al activity donde cambia el idioma a portugues
            Intent intent = new Intent(MainActivity.this, Portugues.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}