package ru.mtuci.labwork1.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student extends BaseEntity {
    private String lastname;
    private String firstname;
    private String patronym;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_group",
            nullable = false)
    private Group group;

    public Student() {
    }

    public Student(Long id, String lastname, String firstname, String patronym) {
        super(id);
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronym = patronym;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (lastname != null ? !lastname.equals(student.lastname) : student.lastname != null) return false;
        if (firstname != null ? !firstname.equals(student.firstname) : student.firstname != null) return false;
        return patronym != null ? patronym.equals(student.patronym) : student.patronym == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (patronym != null ? patronym.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + getId() + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronym='" + patronym + '\'' +
                '}';
    }
}
