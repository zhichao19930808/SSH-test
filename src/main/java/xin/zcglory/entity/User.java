package xin.zcglory.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ssh_user")
public class User {
    @Id
    @GenericGenerator(name = "uuid", strategy="uuid")
    @GeneratedValue(generator = "uuid")
    private String id;
    private String name;
    private String password;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
