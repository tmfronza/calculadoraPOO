package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculadora em POO");
        display = findViewById(R.id.tv_display);
    }

    public void onClickBotao1(View v) {
        atualizarNumeroDigitado("1");
        atualizarDisplay("1");
    }

    public void onClickBotao2(View v) {
        atualizarNumeroDigitado("2");
        atualizarDisplay("2");
    }

    public void onClickBotao3(View v) {
        atualizarNumeroDigitado("3");
        atualizarDisplay("3");
    }

    public void onClickBotao4(View v) {
        atualizarNumeroDigitado("4");
        atualizarDisplay("4");
    }

    public void onClickBotao5(View v) {
        atualizarNumeroDigitado("5");
        atualizarDisplay("5");
    }

    public void onClickBotao6(View v) {
        atualizarNumeroDigitado("6");
        atualizarDisplay("6");
    }

    public void onClickBotao7(View v) {
        atualizarNumeroDigitado("7");
        atualizarDisplay("7");
    }

    public void onClickBotao8(View v) {
        atualizarNumeroDigitado("8");
        atualizarDisplay("8");
    }

    public void onClickBotao9(View v) {
        atualizarNumeroDigitado("9");
        atualizarDisplay("9");
    }

    public void onClickBotao0(View v) {
        atualizarNumeroDigitado("0");
        atualizarDisplay("0");
    }

    public void onClickAdicao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "+";
            atualizarDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "Insira um número para seguir com a operação.", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickSubtracao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "-";
            atualizarDisplay("-");
        } else {
            Toast.makeText(MainActivity.this, "Insira um número para seguir com a operação.", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickMultiplicacao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "*";
            atualizarDisplay("*");
        } else {
            Toast.makeText(MainActivity.this, "Insira um número para seguir com a operação.", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickDivisao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "/";
            atualizarDisplay("/");
        } else {
            Toast.makeText(MainActivity.this, "Insira um número para seguir com a operação.", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickIgual(View v) {
        if (!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()) {
            int numero01 = Integer.parseInt(primeiroNumero);
            int numero02 = Integer.parseInt(segundoNumero);
            if (operacao.equals("+")) {
                int resultado = numero01 + numero02;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("-")) {
                int resultado = numero01 - numero02;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("*")) {
                int resultado = numero01 * numero02;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("/")) {
                if (!primeiroNumero.equals("0") && !segundoNumero.equals("0")) {
                    int resultado = numero01 / numero02;
                    display.setText(String.valueOf(resultado));
                } else {
                    Toast.makeText(MainActivity.this, "Não é possível realizar a divisão por zero. Selecione números diferentes de zero.", Toast.LENGTH_LONG).show();
                }
            }
        } else {
            Toast.makeText(MainActivity.this, "Nenhuma operação foi solicitada.", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickLimpar(View v) {
        primeiroNumero = "";
        segundoNumero = "";
        operacao = "";
        display.setText("");
    }

    private void atualizarDisplay(String entradaTexto) {
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + entradaTexto;
        display.setText(textoDisplay);
    }

    private void atualizarNumeroDigitado(String entradaNumero) {
        if (operacao.isEmpty()) {
            primeiroNumero = primeiroNumero + entradaNumero;
        } else {
            segundoNumero = segundoNumero + entradaNumero;
        }
    }
}