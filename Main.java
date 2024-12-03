public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingHistory history = new BookingHistory();
        LoyaltyProgram loyaltyProgram = new LoyaltyProgram();

        // Sign up process
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Repeat password: ");
        String repeatPassword = scanner.nextLine();

        SignUp user = new SignUp(username, password, repeatPassword);
        if (user.validatePassword()) {
            System.out.println("Proceed to login...");

            // Login process
            System.out.print("Enter username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();

            Login loginUser = new Login(loginUsername, loginPassword);
            if (loginUser.validatePassword()) {
                // Ticket booking process
                System.out.println("Proceed to ticket booking...");

                System.out.print("Enter flight number: ");
                String flightNumber = scanner.nextLine();

                System.out.print("Enter passenger name: ");
                String passengerName = scanner.nextLine();

                System.out.print("Enter passenger age: ");
                int passengerAge = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter passport number: ");
                String passportNumber = scanner.nextLine();

                System.out.print("Enter seat number: ");
                String seatNumber = scanner.nextLine();

                TicketBooking booking = new TicketBooking(flightNumber, passengerName, passengerAge, passportNumber, seatNumber);
                booking.makePayment();
                booking.confirmBooking();

                // Payment process
                System.out.println("Proceed to payment process...");

                System.out.print("Enter card number: ");
                String cardNumber = scanner.nextLine();

                System.out.print("Enter cardholder name: ");
                String cardName = scanner.nextLine();

                System.out.print("Enter expiry date (MM/YY): ");
                String expiryDate = scanner.nextLine();

                System.out.print("Enter CVV: ");
                String cvv = scanner.nextLine();

                PaymentProcess payment = new PaymentProcess(cardNumber, cardName, expiryDate, cvv);
                if (payment.validatePayment()) {
                    // Generate and send itinerary
                    String itinerary = booking.getItinerary();
                    System.out.println("Generated Itinerary:\n" + itinerary);

                    // Send email notification
                    EmailNotification.sendEmail("example@example.com", "Your Flight Booking Confirmation", itinerary);

                    // Add booking to history
                    history.addBooking(booking);

                    // Earn loyalty points
                    loyaltyProgram.earnPoints(10);

                    // View booking history
                    history.viewHistory();

                    // View loyalty points
                    loyaltyProgram.viewPoints();

                    // Cancel booking example
                    System.out.println("Do you want to cancel a booking? (yes/no)");
                    String cancelResponse = scanner.nextLine();
                    if (cancelResponse.equalsIgnoreCase("yes")) {
                        System.out.print("Enter flight number to cancel: ");
                        String cancelFlightNumber = scanner.nextLine();
                        System.out.print("Enter passenger name to cancel: ");
                        String cancelPassengerName = scanner.nextLine();
                        history.cancelBooking(cancelFlightNumber, cancelPassengerName);
                    }

                    // View booking history via ViewBookingHistory class
                    ViewBookingHistory viewHistory = new ViewBookingHistory(history);
                    viewHistory.displayHistory();
                }
            }
        }

        scanner.close();
    }
}
