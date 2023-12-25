public class CreditPaymentService {


    public double calculate(double amountOfCredit, double annualInterestRate, double numberOfMonths) {

        annualInterestRate = annualInterestRate / 100;
        numberOfMonths = numberOfMonths * 12;

        double annuityPayments = amountOfCredit * annualInterestRate / 12 * Math.pow(1 + annualInterestRate / 12, numberOfMonths) / (Math.pow(1 + annualInterestRate / 12, numberOfMonths) - 1);

        return (int) annuityPayments;

    }
}
