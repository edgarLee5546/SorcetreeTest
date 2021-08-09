package enumpack;

enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }



public class Enum01 {

    public static void main(String[] args) {

        Rainbow[] arr = Rainbow.values();

        for (Rainbow rb : arr) {

            System.out.println(rb);

        }

    }

}