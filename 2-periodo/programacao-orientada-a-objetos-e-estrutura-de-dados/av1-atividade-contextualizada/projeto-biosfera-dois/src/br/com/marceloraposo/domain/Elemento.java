package br.com.marceloraposo.domain;

public class Elemento implements Comparable<Elemento>{

    private int medicao;
    private String hora;

    public Elemento(int medicao, String hora) {
        this.medicao = medicao;
        this.hora = hora;
    }

    public int getMedicao() {
        return medicao;
    }

    public void setMedicao(int medicao) {
        this.medicao = medicao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public int compareTo(Elemento o) {
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                "Medição = '" + medicao + '\'' +
                ", Hora = " + hora +
                '}' + "\n";
    }
}
