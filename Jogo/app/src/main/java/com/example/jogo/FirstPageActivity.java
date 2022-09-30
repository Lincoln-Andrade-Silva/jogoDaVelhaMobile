package com.example.jogo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class FirstPageActivity extends AppCompatActivity {

    private Button startButton;
    private EditText player1;
    private EditText player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.start);


        startButton.setOnClickListener(
                v -> {

                    player1 = findViewById(R.id.player1);
                    player2 = findViewById(R.id.player2);
                    String player1Text = player1.getText().toString();
                    String player2Text = player2.getText().toString();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("player1", player1Text);
                    intent.putExtra("player2", player2Text);
                    startActivity(intent);

                }
        );

    }
}
