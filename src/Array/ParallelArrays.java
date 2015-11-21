package Array;

public class ParallelArrays {

    public void arrParallel() {

        String[] title = {"HTC", "iPhone", "Samsung"};
        int[] amount = {100, 320, 45};
        double[] price = {80.90, 210.49, 120.0};

        for (int index = 0; index < title.length; index++) {
            System.out.print(title[index] + ": ");
            System.out.print(amount[index] + " pcs., ");
            System.out.print(price[index] + " USD");
            System.out.println();
        }
    }
}
