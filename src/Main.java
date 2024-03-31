public class Main {
    public static void main(String[] args) {
        int price = 25689;
        System.out.println("Начисленно миль:");

        int mile;
        if (price >= 20) {
            mile = price / 20;
            System.out.println(mile);
        } else {
            System.out.println("0");
        }
    }
}



