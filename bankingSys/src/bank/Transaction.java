package bank;
import java.util.Date;
public class Transaction {
	Date date;
    String type; 
    double amount;

    public Transaction(String type, double amount) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " - " + type + ": " + amount;
    }
}

