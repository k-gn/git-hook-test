package com.example.hooktest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class User {
    private Long userid;
    private String username;
    private Integer age;
}
