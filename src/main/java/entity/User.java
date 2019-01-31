package entity;

public class User {
    private long id;
    private String login;
    private String password;

    public User(long id, String login, String password){
        this.id=id;
        this.login=login;
        this.password=password;
    }
    public long getId(){
        return this.id;
    }
    public String getLogin(){
        return this.login;
    }
    public String getPassword(){
        return this.password;
    }
    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
