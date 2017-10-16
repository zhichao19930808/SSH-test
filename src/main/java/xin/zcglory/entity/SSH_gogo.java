package xin.zcglory.entity;



import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "SSH_gogo777")
public class SSH_gogo extends IdEntity{

    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
