package com.example.practice2;
import javax.persistence.*;
import java.util.Set;

@Entity
// Adding the table name
@Table(name = "Student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String name;

    // Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL)
//    private Set<Address> ob;
    public int getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(int rollNo)
    {

        this.rollNo = rollNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
