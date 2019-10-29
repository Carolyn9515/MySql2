package com.example.mysql;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    Button btnGuardar, btnConsultar1, btnConsultar2, btnBorrar,btnEditar;
    boolean aviso1 = false;
    boolean aviso2 = false;
    boolean aviso3 = false;
    int resultadoInsert = 0;

    boolean estadoGuarda = false;

    MantenimientoMySQL manto = new MantenimientoMySQL();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        btnGuardar = findViewById(R.id.btnGuardar);
        btnConsultar1 = findViewById(R.id.btnConsultar1);
        btnConsultar2 = findViewById(R.id.btnConsultar2);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnEditar = findViewById(R.id.btnEditar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (et1.getText().toString().length() == 0) {

                        et1.setError("NO PUEDE QUEDAR VACIO");
                        aviso1 = false;
                    } else {
                        aviso1 = true;

                    }
                    if (et2.getText().toString().length() == 0) {

                        et2.setError("NO PUEDE QUEDAR VACIO");
                        aviso2 = false;
                    } else {
                        aviso2 = true;
                    }
                    if (et3.getText().toString().length() == 0) {

                        et3.setError("NO PUEDE QUEDAR VACIO");
                        aviso3 = false;
                    } else {
                        aviso3 = true;
                    }
                    if (aviso1 && aviso2 && aviso3) {
                        String codigo = et1.getText().toString();
                        String descripcion = et2.getText().toString();
                        String precio = et3.getText().toString();
                        manto.guardar(MainActivity.this, codigo, descripcion, precio);

                    }
                }


        });

        btnConsultar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnConsultar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    public void eliminarDatos(){

    }

}
