/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.escuelaNueva.service;

import com.example.escuelaNueva.entity.ApoderadoEntity;
import com.example.escuelaNueva.repository.ApoderadoRespository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApoderadoServiceImpl implements ApoderadoService{
    
    //Permite inyectar dependencias
    @Autowired
    private ApoderadoRespository ApoRep;
    
    @Override
    public List<ApoderadoEntity> findAll() {
        return ApoRep.findAll();
    }

    @Override
    public List<ApoderadoEntity> findAllCustom() {
        return ApoRep.findAllCustom();
    }

    @Override
    public Optional<ApoderadoEntity> finById(Long id) {
        return ApoRep.findById(id);
    }

    @Override
    public ApoderadoEntity add(ApoderadoEntity p) {
        return ApoRep.save(p);
    }

    @Override
    public ApoderadoEntity update(ApoderadoEntity p) {
        ApoderadoEntity obj = ApoRep.getById(p.getCodapo());
        BeanUtils.copyProperties(p,obj);
        return ApoRep.save(obj);
    }

    @Override
    public ApoderadoEntity delete(ApoderadoEntity p) {
        ApoderadoEntity obj = ApoRep.getById(p.getCodapo());
        obj.setEstapo(false);
        return ApoRep.save(obj);
    }
    
}
