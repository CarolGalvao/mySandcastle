package com.carol.mySandcastle.entities;

import com.carol.mySandcastle.enums.ProfileEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="password", nullable = false)
    private String password;
    @Column(name="cpf", nullable = false)
    private String cpf;
    @Column(name="valueHour")
    private BigDecimal valueHour;
    @Column(name="hour_worked_day")
    private Float hoursWorkedDay;
    @Column(name="amount_hours_lunch")
    private Float amountHoursLunch;
    @Enumerated(EnumType.STRING)
    @Column(name="profile", nullable = false)
    private ProfileEnum profile;
    @Column(name="creation_date", nullable = false)
    private Date creationDate;
    @Column(name="update_date", nullable = false)
    private Date updateDate;
    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private transient List<Timetable>  timetables;


}
