package myArrayList;

public class Banr {

    public static void banr() throws InterruptedException {

        String message = "JAVA ArrayList Examples:";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i) + " ");
            Thread.sleep(220);
        }
    }
}

