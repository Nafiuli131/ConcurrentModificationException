package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("orange");

        //iterator
//        Iterator<String> fruitsIterator = fruits.iterator();
//        while (fruitsIterator.hasNext()) {
//            String iterator = fruitsIterator.next();
//            System.out.println(iterator);
//        }
        //concurrentModificationException
//        for(String fruit:fruits){
//            fruits.remove(fruit);  //here occured concurrent modification exception
//        }

        //remove concurrentmodificationexception
        Iterator<String> fruitsIterator = fruits.iterator();
        while (fruitsIterator.hasNext()) {
            String iterator = fruitsIterator.next();
            System.out.println(iterator);
            fruitsIterator.remove();
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}