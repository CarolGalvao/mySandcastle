package com.carol.mySandcastle.entities;

import com.carol.mySandcastle.enums.TypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "timetable")
public class Timetable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data", nullable = false)
    private Date data;
    @Column(name="description",nullable = false)
    private String description;
    @Column(name="location",nullable = false)
    private String location;
    @Column(name="creation_date", nullable = false)
    private Date creationDate;
    @Column(name="update_date", nullable = false)
    private Date updateDate;
    @Enumerated(EnumType.STRING)
    @Column(name="type", nullable = false)
    private TypeEnum type;
    @ManyToOne(fetch = FetchType.EAGER)
    private Employee employee;

    @PreUpdate
    public void preUpdate(){
        updateDate = new Date();
    }

    @PrePersist
    public void prePersist(){
        final Date current = new Date();
        creationDate = current;
        updateDate = current;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "id=" + id +
                ", data=" + data +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                ", type=" + type +
                ", employee=" + employee +
                '}';
    }
}
