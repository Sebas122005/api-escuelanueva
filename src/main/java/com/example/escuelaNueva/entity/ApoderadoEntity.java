/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.escuelaNueva.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Sebas
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "ApoderadoEntity")
@Table(name = "apoderado")
public class ApoderadoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codapo;
    private String nomapo, apepapo, apemapo, dniapo, dirapo, telapo, celapo, corapo, sexapo;
    private Boolean estapo;
    @ManyToOne
    @JoinColumn(name = "coddis", nullable = false)
    private DistritoEntity coddis;
    @ManyToOne
    @JoinColumn(name = "codpar", nullable = false)
    private ParentescoEntity codpar;
}
