package com.vinicius.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txt_name;
    private EditText txt_email;
    private EditText txt_phone;
    private Button btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_name = findViewById(R.id.txt_name);
        txt_email = findViewById(R.id.txt_email);
        txt_phone = findViewById(R.id.txt_phone);
        btn_enviar = findViewById(R.id.btn_enviar);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,telaDados.class);

                String text_name = txt_name.getText().toString();
                String text_email = txt_email.getText().toString();
                String text_phone = txt_phone.getText().toString();

                intent.putExtra("chaveNome", text_name);
                intent.putExtra("chaveEmail", text_email);
                intent.putExtra("chavePhone", text_phone);

                startActivity(intent);

            }
        });
    }
}
