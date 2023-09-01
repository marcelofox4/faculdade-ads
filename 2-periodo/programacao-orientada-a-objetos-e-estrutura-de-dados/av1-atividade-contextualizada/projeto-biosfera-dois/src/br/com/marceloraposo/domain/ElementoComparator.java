package br.com.marceloraposo.domain;

import java.util.Comparator;

public class ElementoComparator implements Comparator<Elemento> {

    @Override
    public int compare(Elemento o1, Elemento o2) {
        return Integer.compare(o1.getMedicao(), o2.getMedicao());
    }
}
