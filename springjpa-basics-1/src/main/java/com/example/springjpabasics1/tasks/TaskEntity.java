package com.example.springjpabasics1.tasks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class TaskEntity {

    public TaskEntity(String name, Boolean done) {
        this.name = name;
        this.done = done;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column()
    private Integer id;

    @JsonProperty("name")
    @Column(nullable = false)
    String name;

    @JsonProperty("done")
    @Column()
    Boolean done = false;
}
