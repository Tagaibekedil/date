import java.sql.Timestamp;

public class Account {
    private int id;
    private String account_number;
    private double currency;
    private String created_dt;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public String getCreated_dt() {
        return created_dt;
    }

    public void setCreated_dt(String created_dt) {
        this.created_dt = created_dt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account_number='" + account_number + '\'' +
                ", currency=" + currency +
                ", created_dt='" + created_dt + '\'' +
                '}';
    }

}

