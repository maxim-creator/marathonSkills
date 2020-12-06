package ru.marathonSkills.Models;

import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Runner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Min(0)
    private int id;
    @Size(min = 1, max = 40, message = "вы нас обманываете, не бывает таких имен")
    private String name;
    @NotNull
    @Size(max = 40, message = "вы нас обманываете, не бывает таких фамилий")
    private String secondName;
    @Email
    private String email;

    private String birthday;
    @NotNull
    private String password;

    public Runner() {
    }

    public Runner(int id,
                  @Size(min = 1, max = 40, message = "вы нас обманываете, не бывает таких имен") String name,
                  @NotNull @Size(max = 40, message = "вы нас обманываете, не бывает таких фамилий") String secondName,
                  @Email String email,
                  String birthday,
                  @NotNull String password) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.email = email;
        this.birthday = birthday;
        this.password = password;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
