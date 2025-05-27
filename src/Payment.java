abstract class Payment {
    abstract void validate();

    void transactionMessage()
    {
        System.out.println(" Processing payment");
    }
}