package myArrayList;

import org.apache.commons.collections.ListUtils;

import java.util.*;

public class MyList {

    public void myListOperations() {

        List<Object> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(1);
        listOne.add(1);
        listOne.add(1);
        listOne.add(1);
        listOne.add(10);
        int duplicate = Collections.frequency(listOne, 1);
        System.out.println("Result of operations with List<Integer> listOne:" + "\n" + listOne + "\n");
        System.out.println("Result of Collections.frequency(listOne, 1):" + "\n" + duplicate + "\n");

        List<Integer> listTwo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        listTwo.set(0, 100);
//        listTwo.add(1);  // java.lang.UnsupportedOperationException
//        listTwo.clear();  // java.lang.UnsupportedOperationException


        System.out.println("Result of operations with List<Integer> listTwo:" + "\n" + listTwo + "\n");
        System.out.println("contains number 5 or not: " + listTwo.contains(5));
        System.out.println("index of number 9 is: " + listTwo.indexOf(9));
        System.out.println("status of isEmpty: " + listTwo.isEmpty());


        List<String> listThree = new ArrayList<>();
        listThree.add("A");
        listThree.add("B");
        listThree.add("C");
        listThree.add("D");
        listThree.add("E");
        listThree.add("F");
        listThree.add("J");
        listThree.remove("D");
        listThree.remove(5);


        System.out.println("\n" + "Result of operations with List<String> listThree:" + "\n" + listThree + "\n");
        System.out.println("size of array: " + listThree.size());
        System.out.println("index of A: " + listThree.indexOf("A"));
        System.out.println("index of B: " + listThree.indexOf("B"));
        System.out.println("index of C: " + listThree.indexOf("C"));
        System.out.println("index of D: " + listThree.indexOf("D"));
        System.out.println("index of E: " + listThree.indexOf("E"));
        System.out.println("index of F: " + listThree.indexOf("F"));
        System.out.println("index of J: " + listThree.indexOf("J"));

        // http://commons.apache.org/proper/commons-collections/download_collections.cgi
        List<Integer> listOneTwo = ListUtils.union(listOne, listTwo);
        System.out.println("\n" + "Result of UNION (listOne + listTwo):" + "\n" + listOneTwo + "\n");
        Set<Object> listHS = new LinkedHashSet<>();
        listHS.addAll(listOne);
        listHS.addAll(listTwo);
        System.out.println("\n" + "Result of LinkedHashSet (listOne + listTwo):" + "\n" + listHS + "\n");


    }
}
