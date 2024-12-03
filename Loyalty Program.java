class LoyaltyProgram {
    private int points = 0;

    public void earnPoints(int amount) {
        points += amount;
        System.out.println("You have earned " + amount + " points.");
    }

    public void viewPoints() {
        System.out.println("You have " + points + " points.");
    }
}
