public class Main {
    public static void main(String[] args) {
        int AccountBalance = 12750;
        int payment = 4333;
        int Bonus;
        int bonus = payment > 1000 ? payment / 100 : 0;
        int FinalBalance = AccountBalance + payment + bonus;
        System.out.println("Баланс счета: " + FinalBalance);
        System.out.println(" Бонус рубли: " + bonus);
    }
}