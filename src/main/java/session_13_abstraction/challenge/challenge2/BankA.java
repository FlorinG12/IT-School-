package session_13_abstraction.challenge.challenge2;

public class BankA extends Bank {

    @Override
    public void getBalance(double deposit) {
        deposit = 100;
    }
}
