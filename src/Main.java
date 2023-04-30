public class Main {
    public static void main(String[] args) {

        int accountValue = 100; // текущее значение клиентского счета
        int topUpValue = 1100; // сумма пополнения
        int topUpStep = 100; // шаг расчета (за каждую дополнительную сумму topUpStep свыше 1000 дается бонусный рубль)
        int bonus = 0;

        if (topUpValue > 1000) {
            bonus = bonus + topUpValue / topUpStep;
        }
        accountValue = accountValue + topUpValue + bonus;

        System.out.println("Вы пополнили счет на " + topUpValue + "р.");
        System.out.println("Дополнительный бонус = " + bonus + "р.");
        System.out.println("Итоговое значение счета = " + accountValue + "р.");
    }

}
