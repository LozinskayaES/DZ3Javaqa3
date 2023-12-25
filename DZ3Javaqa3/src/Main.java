public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amountOfCredit = 1_000_000;
        double annualInterestRate = 9.99;
        double numberOfMonths = 2;

        double annuityPayments = service.calculate(amountOfCredit, annualInterestRate, numberOfMonths);

        System.out.println("Ваш ежемесячный платёж: " + annuityPayments);
    }
}
