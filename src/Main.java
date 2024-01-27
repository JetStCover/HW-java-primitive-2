public class Main {//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public static void main(String[] args) {
        int startBalance = 2000;
        int repAmount = 13548;
        boolean Correct = (repAmount > 1000);

        int bonus;
        int cent = (repAmount / 100);
        if (Correct) {
            bonus = cent;
        } else {
            bonus = 0;
        }
        
        int sumBalance = startBalance + repAmount + bonus;

        System.out.println("Общий баланс: " + sumBalance);
    }
}