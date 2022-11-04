/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.escuelaNueva.repository;

import com.example.escuelaNueva.entity.ApoderadoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Sebas
 */
public interface ApoderadoRespository extends JpaRepository<ApoderadoEntity, Long>{
    @Query("select d from ApoderadoEntity d where d.estapo=1")
    List<ApoderadoEntity> findAllCustom(); 
}
