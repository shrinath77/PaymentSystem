public class UPIPayment extends Payment implements Payable{
    public void validate(){
        System.out.println(" Validating upi id ");
    }

    @Override
    public void Pay(double amount) {
        System.out.println("Paid amount"+amount+" using upi");
    }
}