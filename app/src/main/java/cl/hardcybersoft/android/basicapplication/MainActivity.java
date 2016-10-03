package cl.hardcybersoft.android.basicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
                Intent intent = new Intent(MainActivity.this, SiguienteActivity.class);
                startActivity(intent);
            }
        });
    }
}
