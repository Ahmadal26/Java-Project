import java.time.LocalDateTime;

public class Transaction {

    private LocalDateTime date;
    private String type;
    private double amount;

    public Transaction(String date, String type, double amount) {
        this.date = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
