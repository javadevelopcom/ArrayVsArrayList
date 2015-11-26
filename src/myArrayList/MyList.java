package myArrayList;

import org.apache.commons.collections.ListUtils;

import java.util.*;

public class MyList {

    private List<String> listZero = new ArrayList<>();
    private List<String> listEd = new ArrayList<>();

    public void initializationZeroEd() {

        listZero.add("Zero");
        listZero.add("Zero");
        listZero.add("Zero");
        listZero.add("Zero");
        listZero.add("Zero");
        listZero.add("Zero");
        listEd.add("Ed");
        listEd.add("Ed");
        listEd.add("Ed");
        listEd.add("Ed");
        listEd.add("Ed");
        listEd.add("Ed");
        listEd.remove(1);
        listZero.remove("Zero");
        listZero.add("Ed");
    }

    public void initializationNum() {

        List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        listNum.set(0, 100);
//        listTwo.add(1);        // java.lang.UnsupportedOperationException
//        listTwo.remove(1);     // java.lang.UnsupportedOperationException
//        listTwo.clear();       // java.lang.UnsupportedOperationException

        System.out.println("List<Integer> listNum:" + "\n" + listNum + "\n");
    }

    public void repeatedValue() {

        System.out.println("listZero: " + "\n" + listZero);
        int duplicates = Collections.frequency(listZero, "Zero");
        System.out.println("\n" + "How frequently repeated Zero: " + "\n" + duplicates + "\n");
        System.out.println("listEd: " + "\n" + listEd);
        int duplicate = Collections.frequency(listEd, "Ed");
        System.out.println("\n" + "How frequently repeated Ed: " + "\n" + duplicate + "\n");
    }


    public void statusList() {

        System.out.println("listZero: " + "\n" + listZero);
        System.out.println("listZero: isEmpty?: " + listZero.isEmpty());
        System.out.println("listZero: size of List: " + listZero.size());
        System.out.println("listZero: contains word Ed or not?: " + listZero
                .contains("Ed"));
        System.out.println("listZero: index of word Ed is: " + listZero.indexOf("Ed") + "\n");

        System.out.println("listEd: " + "\n" + listEd);
        System.out.println("listEd: isEmpty?: " + listEd.isEmpty());
        System.out.println("listEd: size of List: " + listEd.size());
        System.out.println("listEd: contains word Ed or not?: " + listEd
                .contains("Ed"));
        System.out.println("listEd: index of word Ed is: " + listEd.indexOf("Ed") + "\n");
    }

    public void joinArrays() {

        // http://commons.apache.org/proper/commons-collections/download_collections.cgi

        List<Integer> listZeroEd = ListUtils.union(listZero, listEd);
        System.out.println("\n" + "Result of UNION (listZero + listEd):" + "\n" + listZeroEd + "\n");


        Set<String> listHS = new LinkedHashSet<>();
        listHS.addAll(listZero);
        listHS.addAll(listEd);
        System.out.println("\n" + "Result of LinkedHashSet (listZero + listEd):" + "\n" + listHS + "\n");

    }
}