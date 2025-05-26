import java.util.logging.Logger;

public class UPIPayment extends Payment implements Payable {


    private static final Logger logger = Logger.getLogger(UPIPayment.class.getName());

    public void validate() {
        logger.info("Validating upi id");
    }

    @Override
    public void Pay(double amount) {
        System.out.println("Paid amount" + amount + " using upi");
    }
}