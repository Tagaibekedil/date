
public class Users {
    private  int id;
    private  String login;
    private String fulname;
    private String email;
    private  int age;
    private  String gender;
    private  String created_dt;
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFulname() {
        return fulname;
    }

    public void setFulname(String fulname) {
        this.fulname = fulname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", fulname='" + fulname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", created_dt=" + created_dt + '\'' +account+
                '}';
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCreated_dt() {
        return created_dt;
    }

    public void setCreated_dt(String created_dt) {
        this.created_dt = created_dt;
    }
}
