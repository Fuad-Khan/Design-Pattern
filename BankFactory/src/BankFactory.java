public class BankFactory {
    public static Bank getBank(String bankType) {
        if (bankType == null) {
            return null;
        }
        if (bankType.equalsIgnoreCase("BKASH")) {
            return new Bkash();
        } else if (bankType.equalsIgnoreCase("NAGAD")) {
            return new Nagad();
        } else if (bankType.equalsIgnoreCase("ROCKET")) {
            return new Rocket();
        }
        return null;
    }
}
