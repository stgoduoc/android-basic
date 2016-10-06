package cl.hardcybersoft.android.basicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SiguienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente);
        // recupera el mensaje enviado desde la actividad anterior
        String correo = getIntent().getStringExtra(MainActivity.CORREO);
        // Log VERBOSE - a logcat
        Log.v("Valor de correo:", correo);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(correo);
    }
}
