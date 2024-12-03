class ViewBookingHistory {
    private BookingHistory bookingHistory;

    public ViewBookingHistory(BookingHistory bookingHistory) {
        this.bookingHistory = bookingHistory;
    }

    public void displayHistory() {
        bookingHistory.viewHistory();
    }
}
