package br.com.marceloraposo.domain;

import java.util.*;

public class SensorGasCarbonico extends Sensor {

    private String[][] medicaoGasCarbonico;
    private List<Elemento> data;

    public SensorGasCarbonico() {
        medicaoGasCarbonico = new String[48][2];
        data = new ArrayList<>();
    }

    @Override
    public void inicializar() {
        for (int i = 0; i < 48; i++) {
            medicaoGasCarbonico[i][0] = "" + getValores().nextInt(900, 1200);
        }
        Sensor.geradorHoras(medicaoGasCarbonico);

        for (int i = 0; i < 48; i++) {
            data.add(new Elemento(Integer.parseInt(medicaoGasCarbonico[i][0]), medicaoGasCarbonico[i][1]));
        }
    }

    public void imprimir() {
        System.out.println("MEDIÇÃO GÁS CARBÔNICO EM PPM (Parte por milhão)");
        System.out.println("_______________________________________________");
        message(medicaoGasCarbonico);
        System.out.println("_______________________________________________");
    }

    @Override
    public void ordenarDados() {
        data.sort(new ElementoComparator());

        System.out.println("ORDENAÇÃO - (MEDIÇÃO GÁS CARBÔNICO)");
        System.out.println(data);
    }
}