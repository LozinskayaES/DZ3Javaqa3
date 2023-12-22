public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double S = 1_000_000;
        double P = 9.99;
        double N = 2;

        double Se = service.calculate(S, P, N);

        System.out.println("Ваш ежемесячный платёж: " + Se);
    }
}