package com.example.mobmov;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText etSInicial;
    private EditText etFinal;
    private EditText etVeloc;
    private EditText etTempo;
    private Button btnCalc;
    private TextView tvRes;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        etSInicial = findViewById(R.id.edSInicial);
        etSInicial.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        etVeloc = findViewById(R.id.edVelocidade);
        etVeloc.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        etTempo = findViewById(R.id.edTempo);
        etTempo.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tvRes = findViewById(R.id.tvRes);
        tvRes.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCalc = findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(op -> calc());
    }

    private void calc(){
        float sInicial = Float.parseFloat(etSInicial.getText().toString());
        float veloc = Float.parseFloat(etVeloc.getText().toString());
        float tempo = Float.parseFloat(etTempo.getText().toString());
        float sFinal = sInicial + veloc * tempo;

        String res = getString(R.string.s_final) + " " + sFinal + " m";
        tvRes.setText(res);
    }
}