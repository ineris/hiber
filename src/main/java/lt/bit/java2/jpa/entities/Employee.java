package lt.bit.java2.jpa.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "emp_no")
    private Integer empNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", columnDefinition="ENUM('M','S')" ,nullable = false)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "hire_date")
    private Date hireDate;


    public Date getBirthDate() { return birthDate; }

    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public Date getHireDate() { return hireDate; }

    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
