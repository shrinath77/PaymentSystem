import java.util.logging.Logger;

public class PaymentSystem {

    public static final Logger LOGGER= Logger.getLogger(PaymentSystem.class.getName());

    public static void main(String[] args) {

        Payable payment1 = new CreditCardPayment();
        payment1.Pay(100);
        LOGGER.info("Paying--------------");


        Payable payment3 = new UPIPayment();
        payment3.Pay(2000);
        LOGGER.info("Paying--------------");
    }
}