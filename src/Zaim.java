public class Zaim extends creditDetails{
    public Zaim(int sum, int time, double percent) {
        super(sum, time, percent);
    }

    public void payPerMonth(){
        double result = (sum*(percent*365/100*time/365));
        System.out.println("Выплата за займ каждый месяц составит " + (int)((sum+result)/10) + " рублей");
    }
}
