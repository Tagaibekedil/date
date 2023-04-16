import java.sql.*;
import java.time.format.DateTimeFormatter;


public class Main {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "postgres";
    static final String QUERY = "select ua.id,ua.account_number,ua.currency,ua.created_dt,u.id,u.login,u.fulname," +
            "u.email,u.age,u.gender,u.created_dt from users u join users_account ua on u.id=ua.id";

    public static void main(String[] args) {
        Users users = new Users();
        Account account = new Account();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            //Extract data from result
            while (rs.next()) {

                Timestamp timestamp=rs.getTimestamp("created_dt");
                account.setId(rs.getInt("id"));
                account.setAccount_number(rs.getString("account_number"));
                account.setCurrency(rs.getDouble("currency"));
                account.setCreated_dt(timestamp.toLocalDateTime().format(dateTimeFormatter));

                users.setAccount(account);
                users.setId(rs.getInt("id"));
                users.setLogin(rs.getString("login"));
                users.setFulname(rs.getString("fulname"));
                users.setEmail(rs.getString("email"));
                users.setAge(rs.getInt("age"));
                users.setGender(rs.getString("gender"));
                Timestamp timestamp1=rs.getTimestamp("created_dt");
                users.setCreated_dt(timestamp1.toLocalDateTime().format(dateTimeFormatter));
                System.out.println(users.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
