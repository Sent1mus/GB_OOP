package org.example;
import java.util.Iterator;
import java.util.List;

public class Container implements Comparable <Container>, Iterable<Box> {

    private List<Box> boxes;

    public  Container(List<Box> boxes){
        this.boxes = boxes;
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Box box: boxes){
            totalWeight += box.getWeight();
        }
        return totalWeight;
    }

    @Override
    public int compareTo(Container o) {
        return Integer.compare(this.getTotalWeight(), o.getTotalWeight());
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}