package com.vinicius.cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class telaDados extends AppCompatActivity {

    private TextView txt_recebido;
    private TextView txt_emailRecebido;
    private TextView txt_phoneRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dados);

        txt_recebido = findViewById(R.id.txt_recebido);
        txt_emailRecebido = findViewById(R.id.txt_emailRecebido);
        txt_phoneRecebido = findViewById(R.id.txt_phoneRecebido);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String nome = bundle.getString("chaveNome").toString();
            String email = bundle.getString("chaveEmail").toString();
            String phone = bundle.getString("chavePhone").toString();


            txt_recebido.setText(nome);
            txt_emailRecebido.setText(email);
            txt_phoneRecebido.setText(phone);
        }
    }
}
