package com.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {
    
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "student_id")
    private int id;
    
    @Column
    private String name;
    
    @Column
    private String rollno;

    public StudentEntity() {
        super();
    }
    
    public StudentEntity(String name, String rollno) {
        super();
        this.name = name;
        this.rollno = rollno;
    }
    public StudentEntity(int id,String name, String rollno) {
        super();
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "StudentEntity [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
    }
}
