package org.example;
import java.util.Comparator;

class ContainerCountComparator implements Comparator <Container> {

    @Override
    public int compare(Container o1, Container o2) {
        return Integer.compare(o1.getTotalWeight(), o2.getTotalWeight());
    }
}