package domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement
@Entity
@NamedQueries({
        @NamedQuery(name = "person.all", query = "SELECT p FROM Person p"),
        @NamedQuery(name = "person.id", query = "SELECT p FROM Person p WHERE p.id = :personId")
})

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String gender;
    private String birtday;
    private String email;
    private int age;


    public String getBirtday() {
        return birtday;
    }

    public void setBirtday(String birtday) {
        this.birtday = birtday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
