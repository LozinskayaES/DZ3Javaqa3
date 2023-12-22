public class CreditPaymentService {


    public double calculate(double S, double P, double N) {
        // S – сумма кредита
        // P – размер годовой процентной ставки
        // N – количество месяцев, в течение которых производятся выплаты
        // Sе - аннуитетные платежи по кредитам производятся ежемесячно

        P = P / 100;
        N = N * 12;

        double Se = S * P / 12 * Math.pow(1 + P / 12, N) / (Math.pow(1 + P / 12, N) - 1);

        return (int) Se;

    }
}
