import java.util.logging.Logger;

public class PaymentSystem {



    public static void main(String[] args) {

        Payable payment1 = new CreditCardPayment();
        payment1.Pay(100);

        System.out.println("paying ------------------");


        Payable payment3 = new UPIPayment();
        payment3.Pay(2000);
        System.out.println("paying ------------------");
    }
}