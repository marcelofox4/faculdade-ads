package br.com.marceloraposo.domain;

import java.util.Random;

public abstract class Sensor {

    private final Random valores = new Random();

    public abstract void inicializar();

    public abstract void ordenarDados();

    protected static void geradorHoras(String[][] dadosMedicao){
        int hora = 0;

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 2; j++) {
                if (i < 10) {
                    if (j % 2 == 0) {
                        dadosMedicao[hora][1] = "0" + i + ":00";
                    } else {
                        dadosMedicao[hora][1] = "0" + i + ":30";
                    }
                } else {
                    if (j % 2 == 0) {
                        dadosMedicao[hora][1] = i + ":00";
                    } else {
                        dadosMedicao[hora][1] = i + ":30";
                    }
                }
                hora++;
            }
        }
    }

    protected static void message(String[][] dadosMedicao) {
        String message = "";
        int count = -1;

        while (count != 47) {
            count++;
            message = String.format("%s - %s ", dadosMedicao[count][0], dadosMedicao[count][1]);
            System.out.println(message);
        }
    }

    public Random getValores() {
        return valores;
    }
}
