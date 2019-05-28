package mx.edu.tesoem.itics.daniel.listadesplegablecontinua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner listadesplegable;
    GridView datosgrid;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] elementossp = {"suma","resta","division","multiplicacion","potencia"};
        String [] elementosgv = {"Nombre","Edad","Correo","Pablo","22","pablo@tesoem.com.mx","Jose Ramirez","30","jose@tosoem.com.mx"};

        listadesplegable = (Spinner) findViewById(R.id.listadesplegable);
        datosgrid = (GridView) findViewById(R.id.datosgrid);

        ArrayAdapter<String> elemenssp = new ArrayAdapter<String>( this,android.R.layout.simple_spinner_item,elementossp);
        ArrayAdapter<String> elensgv = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,elementosgv);


    }
}
