package cl.hardcybersoft.android.basicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String CORREO = "correo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvSaludo = (TextView) findViewById(R.id.txtSaludo);
        tvSaludo.setText(tvSaludo.getText() + " Juan!!!");

        Button btnSiguienteActividad = (Button) findViewById(R.id.btnSgteActividad);
        btnSiguienteActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etCorreo = (EditText) MainActivity.this.findViewById(R.id.etCorreo);
                Intent intent = new Intent(MainActivity.this, SiguienteActivity.class);
                // envía un mensaje a la siguiente actividad
                intent.putExtra(CORREO, etCorreo.getText().toString());
                startActivity(intent);
            }
        });
    }
}
