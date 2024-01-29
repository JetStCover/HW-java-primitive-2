public class Main {
    public static void main(String[] args) {
        int balance = 0;
        int amount = 1100;
        int bonus = amount > 1000 ? amount / 100 : 0;
        int summary = balance + amount + bonus;

        System.out.println("Общий баланс: " + summary);
    }
}
