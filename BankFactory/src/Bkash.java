public class Bkash implements Bank {
    @Override
    public double paymentCharge() {
        return 1.5; // Assume 1.5% charge rate
    }
}