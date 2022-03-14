package com.yakut.oauth2demo.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Users {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "role")
    private String role;
    @Column(name = "given_name")
    private String givenName;
    @Column(name = "family_name")
    private String familyName;
    @Column(name = "email")
    private String email;
}
