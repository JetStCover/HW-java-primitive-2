public class Main {//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public static void main(String[] args) {
        int balance = 0;
        int amount = 1100;
        boolean correct = (amount > 1000);

        int bonus;
        int cent = (amount / 100);
        if (correct) {
            bonus = cent;
        } else {
            bonus = 0;
        }
        
        int summary = balance + amount + bonus;

        System.out.println("Общий баланс: " + summary);
    }
}
