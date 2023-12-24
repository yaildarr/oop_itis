import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, я калькулятор твоего кредита.");
        menu();
        boolean men = true;
        while (men) {
            String ask = scanner.nextLine();
            if (ask.equals("1")) {
                System.out.println("Введите сумму ипотеки (в рублях)");
                int sum = scanner.nextInt();
                System.out.println("Введите на сколько лет вы хотите взять ипотеку");
                int year = scanner.nextInt();
                System.out.println("Введите процентную ставку");
                double percent = scanner.nextDouble();
                System.out.println("Введите первоначальный взнос (В случае отсутствия взноса введите 0)");
                int contribution = scanner.nextInt();
                Ipoteka ipoteka = new Ipoteka(sum, year, percent, contribution);
                ipoteka.payPerMonth();
                menu();
            } else if (ask.equals("2")){
                System.out.println("Введите сумму займа (в рублях)");
                int sum = scanner.nextInt();
                System.out.println("Введите на сколько дней вы хотите взять займ?");
                int time = scanner.nextInt();
                System.out.println("Введите процентную ставку(день)");
                double percent = scanner.nextDouble();
                Zaim zaim = new Zaim(sum, time, percent);
                zaim.payPerMonth();
                menu();
            }
        }
    }
    public static void menu(){
        System.out.println("Что ты хочешь сделать?\n" +
                "1 - Рассчитать Ипотеку\n" +
                "2 - Рассчитать займ");

    }

}