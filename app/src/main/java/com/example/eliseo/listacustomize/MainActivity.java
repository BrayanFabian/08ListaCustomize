package com.example.eliseo.listacustomize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {
    ArrayList<Pais> paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paises = new ArrayList<Pais>();

        // ArrayList<Pais> paises = new ArrayList<Pais>();
        paises.add(new Pais("Germany", "Berlin", R.drawable.germany));
        paises.add(new Pais("Japan", "Tokyo", R.drawable.japan));
        paises.add(new Pais("Italy", "Rome", R.drawable.italy));
        paises.add(new Pais("France", "Paris", R.drawable.france));
        paises.add(new Pais("Netherlands", "Amsterdam", R.drawable.netherlands));
        paises.add(new Pais("Sweden", "Stockholm", R.drawable.sweden));
        paises.add(new Pais("Norway", "Oslo", R.drawable.norway));

        Adaptador adaptador = new Adaptador(this, R.layout.activity_custom, paises);

        ListView lista = (ListView) findViewById(R.id.lvPaises);
        lista.setOnItemLongClickListener(this);
        lista.setOnItemClickListener(this);

        lista.setAdapter(adaptador);
    }
    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

        //Toast.makeText(getBaseContext(), "" + paises.get(i).bandera, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, VistaActivity.class);

        intent.putExtra("nombre", paises.get(i).nombre);
        intent.putExtra("capital", paises.get(i).capital);
        intent.putExtra("bandera", paises.get(i).bandera);
        startActivity(intent);

        return false;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getBaseContext(), "Manten Presionado...", Toast.LENGTH_SHORT).show();
    }
}
