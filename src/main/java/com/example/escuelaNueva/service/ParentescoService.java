/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.escuelaNueva.service;

import com.example.escuelaNueva.entity.ParentescoEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Sebas
 */
public interface ParentescoService {
        //funcion que va permitir mostrar los datos
    
    List<ParentescoEntity> findAll();
    
    //funcion permita ver los datos habilitados
    
    List<ParentescoEntity> findAllCustom();
    
    //funcion para buscar 
    Optional<ParentescoEntity> finById(Long id);
    
    //funcion para agregar datos
    ParentescoEntity add(ParentescoEntity p);
    
    //funcion para actualizar
    ParentescoEntity update(ParentescoEntity p);
    
    //funcion para eliminar
    ParentescoEntity delete(ParentescoEntity p);
}
