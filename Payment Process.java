class PaymentProcess {
    private String cardNumber;
    private String cardName;
    private String expiryDate;
    private String cvv;

    public PaymentProcess(String cardNumber, String cardName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public boolean validatePayment() {
        if (cardNumber.equals("1234567890123456") && cardName.equals("Yasir Raiyan") && expiryDate.equals("12/24") && cvv.equals("123")) {
            System.out.println("Payment Successful.");
            return true;
        } else if (cardNumber.isEmpty() || cardName.isEmpty() || expiryDate.isEmpty() || cvv.isEmpty()) {
            System.out.println("Please fill up all fields first!");
            return false;
        } else {
            System.out.println("Payment Failed!");
            return false;
        }
    }
}
