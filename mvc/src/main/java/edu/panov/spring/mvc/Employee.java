package edu.panov.spring.mvc;

import edu.panov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Map;

public class Employee {

    @Size(min = 2, max = 20, message = "Длина имени должна быть от 2 символов!")
    private String name;
    @NotBlank(message = "The surname is required")
    private String surname;
    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int salary;

    private String department;

    private String carBrand;

    private String[] languages;
    //    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Please use pattern XXX-XX-XX")
    @Pattern(regexp = "[0-9]{3}-[0-9]{2}-[0-9]{2}", message = "Please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;

    private static final Map<String, String> DEPARTMENS = Map.of(
            "IT", "Information Technology",
            "Human Resources", "HR",
            "Sales", "Sales"
    );

    private static final Map<String, String> CAR_BRANDS = Map.of(
            "Mersedes", "MERS",
            "Bmv", "BMV"
    );

    private static final Map<String, String> LANGUAGE_LIST = Map.of(
            "EN", "English",
            "TUR", "Turckish",
            "JPN", "Japan"
    );

    public Employee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public Map<String, String> getDepartments() {
        return DEPARTMENS;
    }

    public Map<String, String> getCarBrands() {
        return CAR_BRANDS;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getLanguageList() {
        return LANGUAGE_LIST;
    }

}

