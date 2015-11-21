package Array;

public class Banner {

    public static void banner() throws InterruptedException {

        String message = "JAVA Array Examples";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i) + " ");
            Thread.sleep(220);
        }
    }
}
