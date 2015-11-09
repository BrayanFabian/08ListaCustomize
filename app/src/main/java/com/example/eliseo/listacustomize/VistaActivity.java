package com.example.eliseo.listacustomize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class VistaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);


        Bundle datos=this.getIntent().getExtras();

        TextView tvNombre=(TextView) findViewById(R.id.tvNombre);
        TextView tvCapital=(TextView) findViewById(R.id.tvCapital);
        ImageView imgBandera=(ImageView) findViewById(R.id.imgBandera);

        tvNombre.setText(datos.getString("nombre"));
        tvCapital.setText(datos.getString("capital"));
        imgBandera.setImageResource(datos.getInt("bandera"));
    }

    public void btnAtrasClic(View v){
        finish();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vista, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
