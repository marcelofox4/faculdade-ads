package br.com.marceloraposo.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SensorUmidade extends Sensor {

    private String[][] medicaoUmidade;
    private List<Elemento> data;

    public SensorUmidade(){
        medicaoUmidade = new String[48][2];
        data = new ArrayList<>();
    }

    @Override
    public void inicializar() {
        for (int i = 0; i < 48; i++) {
            medicaoUmidade[i][0] = "" + getValores().nextInt(40, 70);
        }
        Sensor.geradorHoras(medicaoUmidade);

        for (int i = 0; i < 48; i++) {
            data.add(new Elemento(Integer.parseInt(medicaoUmidade[i][0]), medicaoUmidade[i][1]));
        }
    }

    public void imprimir() {
        System.out.println("MEDIÇÃO: UMIDADE RELATIVA DO AR EM % (Porcentagem)");
        System.out.println("__________________________________________________");
        message(medicaoUmidade);
        System.out.println("__________________________________________________");
    }

    @Override
    public void ordenarDados() {
        data.sort(new ElementoComparator());
        Collections.reverse(data);

        System.out.println("__________________________________________________");
        System.out.println("ORDENAÇÃO - (MEDIÇÃO UMIDADE)");
        System.out.println(data);
        System.out.println("__________________________________________________");
    }
}
