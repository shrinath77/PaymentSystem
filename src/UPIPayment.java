import java.util.logging.Logger;

public class UPIPayment extends Payment implements Payable {



    public void validate() {
        System.out.println("Validating UPi ID");
    }

    @Override
    public void Pay(double amount) {
        System.out.println("Paid amount" + amount + " using upi");
    }
}