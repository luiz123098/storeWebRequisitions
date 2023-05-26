package com.example.storeWebRequisitions.controller;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cliente")
public class Client {
    @Id
    @Column(name = "id")
    public long id;

    @Column(name = "nome")
    public String name;

}
