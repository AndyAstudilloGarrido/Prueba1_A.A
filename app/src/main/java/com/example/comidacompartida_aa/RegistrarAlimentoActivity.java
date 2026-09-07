package com.example.comidacompartida_aa;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrarAlimentoActivity extends AppCompatActivity {

    private EditText editTextText, editTextNumber;
    private RadioButton radioButton, radioButton2, radioButton3;
    private Switch switch1, switch3;
    private Button button3;
    private TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrar_alimento);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextText = findViewById(R.id.editTextText);
        editTextNumber = findViewById(R.id.editTextNumber);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        switch1 = findViewById(R.id.switch1);
        switch3 = findViewById(R.id.switch3);
        button3 = findViewById(R.id.button3);
        textView7 = findViewById(R.id.textView7);

        button3.setOnClickListener(v -> {
            String nombre = editTextText.getText().toString().trim();
            String cantidad = editTextNumber.getText().toString().trim();

            if (nombre.isEmpty() || nombre.equals("Nombre del alimento")) {
                Toast.makeText(this, "Por favor ingrese el nombre del alimento", Toast.LENGTH_SHORT).show();
                return;
            }

            if (cantidad.isEmpty()) {
                Toast.makeText(this, "Por favor ingrese la cantidad", Toast.LENGTH_SHORT).show();
                return;
            }

            String categoria = "";
            if (radioButton.isChecked()) {
                categoria = "Enlatados";
            } else if (radioButton2.isChecked()) {
                categoria = "Instantaneo";
            } else if (radioButton3.isChecked()) {
                categoria = "congelados";
            } else {
                categoria = "No especificada";
            }

            boolean proximoCaducidad = switch1.isChecked();
            String caducidadStr = proximoCaducidad ? "Sí" : "No";

            String resumen = "Registrado: " + nombre + " | Cant: " + cantidad + " | Cat: " + categoria + " | Próximo caducar: " + caducidadStr;
            textView7.setText(resumen);
            Toast.makeText(this, "¡Alimento registrado con éxito!", Toast.LENGTH_SHORT).show();
        });
    }
}
