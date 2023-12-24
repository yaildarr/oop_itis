
public class Ipoteka extends creditDetails {

    int contribution;
    public Ipoteka(int sum, int time, double percent, int contribution) {
        super(sum, time, percent);
        this.contribution = contribution;
    }
    public void payPerMonth(){
        double r = percent/1200;
        double ak = ((r*Math.pow(1+r,12*time)) / ((Math.pow(1+r,12*time))-1));
        double mp = (sum-contribution)*ak;
        System.out.println("Выплата за ипотеку каждый месяц составит " + (int)mp + " рублей");
    }
}