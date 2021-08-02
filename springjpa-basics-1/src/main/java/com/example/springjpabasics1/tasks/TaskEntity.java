package com.example.springjpabasics1.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskEntity {

    @JsonProperty("name")
    String name;
    @JsonProperty("done")
    Boolean done;
}
