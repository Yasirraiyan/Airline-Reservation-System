class Login {
    public String username;
    public String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validatePassword() {
        if (username.equals("yasirraiyan") && password.equals("Yasyan480")) {
            System.out.println("Login Successful.");
            return true;
        } else if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Please fill up all fields first!");
            return false;
        } else {
            System.out.println("Login Failed!");
            return false;
        }
    }
}
