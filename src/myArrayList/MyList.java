package myArrayList;

import org.apache.commons.collections.ListUtils;

import java.util.*;

public class MyList {

    private List<String> listZero = new ArrayList<>();
    private List<String> listEd = new ArrayList<>();
    public static String[] text = {"нужно", "по", "первым", "символам", "найти", "все", "слова", "которые", "входят", "в", "строковый", "массив"};

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
        listZero.set(1, "Ed");
    }

    public void listValue() {

        print("listZero value of index [0]: " + listZero.get(0));
        print("listEd value of index [1]: " + listEd.get(1));
    }

    public void operationsNumList() {

        List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        listNum.set(0, 100);
//        listTwo.add(1);        // java.lang.UnsupportedOperationException
//        listTwo.remove(1);     // java.lang.UnsupportedOperationException
//        listTwo.clear();       // java.lang.UnsupportedOperationException

        print("\n" + "List<Integer> listNum:" + "\n" + listNum + "\n");
        Collections.shuffle(listNum);
        print("After SHUFFLING:" + "\n" + listNum);
        Collections.sort(listNum);
        print("After SORTING:" + "\n" + listNum);
        Collections.reverse(listNum);
        print("After REVERSE SORTING:" + "\n" + listNum);
        print("SIZE: " + listNum.size());
//double sum = listNum.
        double average = listNum.stream().mapToDouble(value -> value).average().getAsDouble();
        print("AVERAGE: " + average);
        print("MIN: " + Collections.min(listNum));
        print("MAX: " + Collections.max(listNum));
    }


    public void repeatedValue() {

        print("\n" + "listZero: " + "\n" + listZero);
        int duplicates = Collections.frequency(listZero, "Zero");
        print("\n" + "How frequently repeated Zero: " + "\n" + duplicates + "\n");
        print("listEd: " + "\n" + listEd);
        int duplicate = Collections.frequency(listEd, "Ed");
        print("\n" + "How frequently repeated Ed: " + "\n" + duplicate + "\n");
    }

    public void statusList() {

        print("listZero: " + "\n" + listZero);
        print("listZero: isEmpty?: " + listZero.isEmpty());
        print("listZero: size of List: " + listZero.size());
        print("listZero: contains word Ed or not?: " + listZero
                .contains("Ed"));
        print("listZero: index of word Ed is: " + listZero.indexOf("Ed") + "\n");

        print("listEd: " + "\n" + listEd);
        print("listEd: isEmpty?: " + listEd.isEmpty());
        print("listEd: size of List: " + listEd.size());
        print("listEd: contains word Ed or not?: " + listEd
                .contains("Ed"));
        print("listEd: index of word Ed is: " + listEd.indexOf("Ed") + "\n");
    }

    public void joinLists() {

        // http://commons.apache.org/proper/commons-collections/download_collections.cgi

        List<Integer> listZeroEd = ListUtils.union(listZero, listEd);
        print("\n" + "Result of UNION (listZero + listEd):" + "\n" + listZeroEd + "\n");


        Set<String> listHS = new LinkedHashSet<>();
        listHS.addAll(listZero);
        listHS.addAll(listEd);
        System.out.print("\n" + "Result of LinkedHashSet (listZero + listEd):" + "\n" + listHS + "\n");
    }

    public void convertToArray() {
        String[] myArray;
        myArray = listEd.toArray(new String[listEd.size()]);
        print("\n" + "List<String> listEd converted toArray: " + myArray);
        print(Arrays.toString(myArray));
    }

    public static ArrayList<String> searchText(String[] inputArray, String searchText) {

        ArrayList<String> outputArray = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (searchText.compareToIgnoreCase(inputArray[i].substring(0, searchText.length())) == 0) {
                outputArray.add(inputArray[i]);
            }
        }
        return outputArray;
    }

    public void print(String x) {
        System.out.println(x);
    }
}