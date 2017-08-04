package java8.maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TestHashMap {

    public static void main(String[] args) {
        HashMap<Dog, Integer> hashMap = new HashMap<>();
        Dog d1 = new Dog("red", 10);
        Dog d2 = new Dog("black", 15);
        Dog d3 = new Dog("blue", 20);
        Dog d4 = new Dog("white", 5);

        hashMap.put(d1, 1);
        hashMap.put(d2, 2);
        hashMap.put(d3, 3);
        hashMap.put(d3, 5); //2nd entry with same key - last one wins...
        hashMap.put(d4, 4);

        System.out.println("Size: " + hashMap.size());

        System.out.println("Unsorted:");
        hashMap.forEach((k,v)->System.out.println("Key : " + k + " - value: " + v));

        System.out.println("Sorted by key (= Dog.size value asc) using a TreeMap:");
        TreeMap<Dog,Integer> sortedMap = new TreeMap<>(hashMap);
        sortedMap.forEach((k,v)->System.out.println("Key : " + k + " - value: " + v));

        System.out.println("Sorted by by value using a TreeMap and ValueComparator:");
        ValueComparator vc =  new ValueComparator(hashMap);
        TreeMap<Dog,Integer> sortedMapByValue = new TreeMap<>(vc);
        sortedMapByValue.putAll(hashMap);
        sortedMapByValue.forEach((k,v)->System.out.println("Key : " + k + " - value: " + v));
    }
}
