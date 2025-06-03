package com.learning.simplecrud.model;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

@Entity

@Data

@AllArgsConstructor

@NoArgsConstructor

public class Customer {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;

    private String age;
}
