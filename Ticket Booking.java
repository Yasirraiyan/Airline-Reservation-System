class TicketBooking {
    private String flightNumber;
    private String passengerName;
    private int passengerAge;
    private String passportNumber;
    private String seatNumber;
    private boolean paymentStatus;

    public TicketBooking(String flightNumber, String passengerName, int passengerAge, String passportNumber, String seatNumber) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passportNumber = passportNumber;
        this.seatNumber = seatNumber;
        this.paymentStatus = false;
    }

    public void confirmBooking() {
        if (paymentStatus) {
            System.out.println("Booking confirmed for: " + passengerName + " on flight " + flightNumber + " seat no: " + seatNumber);
        } else {
            System.out.println("Please complete the payment to confirm booking.");
        }
    }

    public void makePayment() {
        this.paymentStatus = true;
        System.out.println("Payment successful.");
    }

    public String getItinerary() {
        return "Flight Number: " + flightNumber +
                "\nPassenger Name: " + passengerName +
                "\nPassenger Age: " + passengerAge +
                "\nPassport Number: " + passportNumber +
                "\nSeat Number: " + seatNumber +
                "\nBooking Status: Confirmed";
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }
}
