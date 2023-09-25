public class Main {
    public static void main(String[] args) {
        int amount = 350; // Начальный счёт
        int summ = 1299; // Сумма пополнения
        int bonus;
        if (summ > 1000) {
            bonus = summ / 100;
            amount = summ + bonus + amount;
            System.out.println("Сумма бонусов: " + bonus);
            System.out.println("Итоговый счёт: " + amount);
        } else {
            bonus = 0;
            amount = summ + amount;
            System.out.println("Сумма бонусов: " + bonus);
            System.out.println("Итоговый счёт: " + amount);
        }
    }
}