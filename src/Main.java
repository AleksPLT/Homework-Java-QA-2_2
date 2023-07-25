public class Main {
    public static void main(String[] args) {
        int balance = 238;
        int refill = 1230;
        int bonus;
        int finalBalance;


        if (refill > 1000) {
            bonus = refill / 100;
            finalBalance = balance + refill + bonus;
        } else {
            bonus = 0;
            finalBalance = balance + refill;
        }
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Начисленно бонусов: " + bonus);
    }
}