public class Transaction {

    private String date;
    private double deposit;
    private double amount;

    public Transaction(String date, double deposit, double amount) {
        this.date = date;
        this.deposit = deposit;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
