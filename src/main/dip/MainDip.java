package dip;

public class MainDip {
    public static void main(String[] args) {
        PaymentProcessor creditProcessor = new PaymentProcessor(new CreditCardPayment());
        creditProcessor.makePayment(150.0);

        PaymentProcessor paypalProcessor = new PaymentProcessor(new PayPalPayment());
        paypalProcessor.makePayment(75.5);

        PaymentProcessor cryptoProcessor = new PaymentProcessor(new CryptoPayment());
        cryptoProcessor.makePayment(300.0);
    }
}
