package java8.maps;

import java.util.Comparator;
import java.util.Map;

class ValueComparator implements Comparator<Dog> {

    Map<Dog, Integer> base;

    public ValueComparator(Map<Dog, Integer> base) {
        this.base = base;
    }

    public int compare(Dog a, Dog b) {
        if (base.get(a) >= base.get(b)) {
            return 1;
        } else {
            return -1;
        } // returning 0 would merge keys
    }
}