package br.com.marceloraposo.domain;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura extends Sensor {

    private String[][] medicaoTemperatura;
    private List<Elemento> data;

    public SensorTemperatura(){
        medicaoTemperatura = new String[48][2];
        data = new ArrayList<>();
    }

    @Override
    public void inicializar() {
        for (int i = 0; i < 48; i++) {
            medicaoTemperatura[i][0] = "" + getValores().nextInt(20, 26);
        }
        Sensor.geradorHoras(medicaoTemperatura);

        for (int i = 0; i < 48; i++) {
            data.add(new Elemento(Integer.parseInt(medicaoTemperatura[i][0]), medicaoTemperatura[i][1]));
        }
    }

    public void imprimir() {
        System.out.println("MEDIÇÃO: TEMPERATURA °C (GRAUS CELCIUS)");
        System.out.println("_______________________________________");
        message(medicaoTemperatura);
        System.out.println("_______________________________________");
    }

    @Override
    public void ordenarDados() {
        data.sort(new ElementoComparator());

        System.out.println("_______________________________________");
        System.out.println("ORDENAÇÃO - (MEDIÇÃO TEMPERATURA)");
        System.out.println(data);
        System.out.println("_______________________________________");
    }
}
