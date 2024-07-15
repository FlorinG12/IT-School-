package session_10_oop_concepts.challenge.challenge3;

public class UserAccount {

    private String userName;
    private String accountId;
    private double accountBalance;
    private String email;

    public void depositFounds(double depositAmmount) {
        accountBalance += depositAmmount;
        System.out.println("Deposit $ " + depositAmmount + "New balance is $ " + accountBalance);
    }

    public void withdrawFunds(double withdrawFunds) {
        if (accountBalance - withdrawFunds < 0) {
            System.out.println("You don' t have enough money in your account !! \n");
            System.out.println("You have only " + accountBalance);
        } else accountBalance -= withdrawFunds;
        {
            System.out.println("Transaction Success " + -withdrawFunds + " Your balance now is : " + accountBalance);
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
