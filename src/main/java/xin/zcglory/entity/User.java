package xin.zcglory.entity;


import javax.persistence.*;

@Entity
@Table(name = "ssh_user")
public class User extends IdEntity{
    @Column(unique = true)
    private String name;
    private String password;
    @Column(unique = true)
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
}
