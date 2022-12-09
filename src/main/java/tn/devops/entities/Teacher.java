package tn.devops.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;
    private String name;
    private int age;
    private String address;
    private String email;
    public  Teacher() {
    }
    public Teacher(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    @OneToMany(mappedBy = "teacher")
    private List<Research> researches;

    public int getId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        teacherId = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Research 
    /*
    @ManyToOne
    @JoinColumn(name="teacher_id") : à vérifier
    private Teacher teacher;
    */
}
