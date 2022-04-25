package com.example.practice2;
import javax.persistence.*;

@Entity
// Adding the table name
@Table(name = "Address")

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cityName;

    // Mapping the column of this table
    @ManyToOne
    //Adding the name
    @JoinColumn(name = "Student_id")
    private Student student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
