class EmailNotification {
    public static void sendEmail(String email, String subject, String body) {
        System.out.println("Sending email to " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Body:\n" + body);
    }
}
