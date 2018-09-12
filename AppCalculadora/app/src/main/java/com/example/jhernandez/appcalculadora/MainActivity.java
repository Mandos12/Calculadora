package com.example.jhernandez.appcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etUno;
    private EditText etDos;
    private EditText etRes;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnDividir;
    private Button btnMultiplicar;
    private Button btnLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"App creada por José Armando Hernández Juárez", Toast.LENGTH_SHORT).show();

        etUno = (EditText)findViewById(R.id.etUno);
        etDos = (EditText)findViewById(R.id.etDos);
        etRes = (EditText)findViewById(R.id.etResult);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnMultiplicar = (Button) findViewById(R.id.btnMulti);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);

        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnLimpiar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {
            double datoUno = Double.parseDouble(etUno.getText().toString());
            double datoDos = Double.parseDouble(etDos.getText().toString());
            double res = 0;

                switch (v.getId()) {
                    case R.id.btnSumar:
                        res = datoUno + datoDos;
                        break;
                    case R.id.btnRestar:
                        res = datoUno - datoDos;
                        break;
                    case R.id.btnDividir:
                        res = datoUno / datoDos;
                        break;
                    case R.id.btnMulti:
                        res = datoUno * datoDos;
                        break;
                    case R.id.btnLimpiar:
                        etUno.setText("");
                        etDos.setText("");
                        etRes.setText("");
                        break;
                }

                etRes.setText("" + res);

                Toast.makeText(MainActivity.this,"Campos Vacios", Toast.LENGTH_SHORT).show();

            }catch (Exception e){
                Toast.makeText(MainActivity.this,"Campos Vacios", Toast.LENGTH_SHORT).show();
            }

        }
}
