package me.oopty.chapter7.identifyingrelation.case2.idclass;

import javax.persistence.*;

@Entity(name = "PARENT3")
@Table(name = "PARENT3")
public class Parent {
    @Id
    @Column(name = "PARENT_ID")
    private String parentId;

    private String name;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
