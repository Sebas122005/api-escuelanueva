/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.escuelaNueva.service;

import com.example.escuelaNueva.entity.ApoderadoEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Sebas
 */
public interface ApoderadoService {
    //funcion que va permitir mostrar los datos
    
    List<ApoderadoEntity> findAll();
    
    //funcion permita ver los datos habilitados
    
    List<ApoderadoEntity> findAllCustom();
    
    //funcion para buscar 
    Optional<ApoderadoEntity> finById(Long id);
    
    //funcion para agregar datos
    ApoderadoEntity add(ApoderadoEntity p);
    
    //funcion para actualizar
    ApoderadoEntity update(ApoderadoEntity p);
    
    //funcion para eliminar
    ApoderadoEntity delete(ApoderadoEntity p);
}
