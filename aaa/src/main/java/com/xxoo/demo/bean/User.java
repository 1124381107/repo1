package com.xxoo.demo.bean;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)s
    private Integer id;
    private String username;
    private String password;

}

//dsfjaflkasjflokajsslfkndsglnkfgnlkasdo jfg
//fgknsdl;gmdl; 
