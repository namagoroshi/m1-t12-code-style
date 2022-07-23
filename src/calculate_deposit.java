import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent (double a, double y, int d ) {
        double pay = a * Math.pow((1 + y/ 12), 12 *d);
        return ronud(pay, 2);
    }
    double calculateSimplePercent (double doubleAmount, double doubleYearRate, int depositPeriod) {
        return ronud(doubleAmount+doubleAmount * doubleYearRate * depositPeriod, 2);
    }
    double ronud(double value, int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
    }
    void createDeposit () {
        Scanner scanner = new Scanner(System.in);
        int period;
        int action;

            System.out.println("Введите сумму вклада в рублях:") ;
        int amount = scanner.nextInt();
            System.out.println("Введите срок вклада в годах:") ;
        period = scanner.nextInt();
            System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double savings = 0;
        if (action ==1){
            savings = calculateComplexPercent (amount, 0.06, period);
        }else if (action == 2){
            savings = calculateSimplePercent (amount, 0.06, period);
        }
            System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + savings);
    }

    public static void main(String[] args) {
        new DepositCalculator().createDeposit();
    }
}
