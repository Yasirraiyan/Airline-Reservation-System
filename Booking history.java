class BookingHistory {
    private List<TicketBooking> bookings = new ArrayList<>();

    public void addBooking(TicketBooking booking) {
        bookings.add(booking);
        System.out.println("Booking added to history.");
    }

    public void viewHistory() {
        if (bookings.isEmpty()) {
            System.out.println("No booking history found.");
        } else {
            for (TicketBooking booking : bookings) {
                System.out.println(booking.getItinerary());
            }
        }
    }

    public boolean cancelBooking(String flightNumber, String passengerName) {
        for (TicketBooking booking : bookings) {
            if (booking.getFlightNumber().equals(flightNumber) && booking.getPassengerName().equals(passengerName) && booking.isPaymentStatus()) {
                bookings.remove(booking);
                System.out.println("Booking cancelled for flight number: " + flightNumber + " for passenger: " + passengerName);
                return true;
            }
        }
        System.out.println("Booking not found or payment not made.");
        return false;
    }
}
