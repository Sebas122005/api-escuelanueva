/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.escuelaNueva.service;

import com.example.escuelaNueva.entity.DistritoEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Sebas
 */
public interface DistritoService {
    
    //funcion que va permitir mostrar los datos
     List<DistritoEntity> findAll();

    //funcion permita ver los datos habilitados
    
    List<DistritoEntity> findAllCustom();
    
    //funcion para buscar 
    Optional<DistritoEntity> finById(Long id);
    
    //funcion para agregar datos
    DistritoEntity add(DistritoEntity d);
    
    //funcion para actualizar
    DistritoEntity update(DistritoEntity d);
    
    //funcion para eliminar
    DistritoEntity delete(DistritoEntity d);
}
