/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.escuelaNueva.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Sebas
 */
@Builder //Permite generar la construccion de la clase 
@AllArgsConstructor //Permite crear el metodo constructor con parametros
@NoArgsConstructor //Permite generar constructor sin parametros
@Data //Permite generar los metedod get y set
@Entity(name = "DistritoEntity")//
@Table(name = "distrito")
public class DistritoEntity implements Serializable {
    
    private static final long serialVersionUID=1L; 
    @Id
    @Column(name = "coddis")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nomdis")
    private String nombre;
    
    private Boolean estdis;
}
