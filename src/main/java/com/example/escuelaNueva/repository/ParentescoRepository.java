/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.escuelaNueva.repository;

import com.example.escuelaNueva.entity.ParentescoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Sebas
 */
public interface ParentescoRepository  extends JpaRepository<ParentescoEntity, Long>{
    @Query("select d from ParentescoEntity d where d.estpar=1")
    List<ParentescoEntity> findAllCustom(); 
}
