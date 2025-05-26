public class CreditCardPayment extends  Payment implements Payable {

    public void validate()
    {
        System.out.println(" Validating credit card details...");
    }
    public void Pay(double amount)
    {
        validate();
        transactionMessage();
        System.out.println("Paid"+amount+"using cc ");
    }
}