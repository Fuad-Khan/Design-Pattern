public class Main {
    public static void main(String[] args) {
        Bank bkash = BankFactory.getBank("Bkash");
        Bank nagad = BankFactory.getBank("Nagad");
        Bank rocket = BankFactory.getBank("Rocket");

        System.out.println("Bkash payment charge: " + bkash.paymentCharge() + "%");
        System.out.println("Nagad payment charge: " + nagad.paymentCharge() + "%");
        System.out.println("Rocket payment charge: " + rocket.paymentCharge() + "%");
    }
}
