/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.escuelaNueva.service;

import com.example.escuelaNueva.entity.DistritoEntity;
import com.example.escuelaNueva.entity.ParentescoEntity;
import com.example.escuelaNueva.repository.DistritoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    private DistritoRepository disRep;
    
    @Override
    public List<DistritoEntity> findAll() {
       return disRep.findAll();
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return disRep.findAllCustom();
    }

    @Override
    public Optional<DistritoEntity> finById(Long id) {
        return disRep.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return disRep.save(d);
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity obj = disRep.getById(d.getCodigo());
        BeanUtils.copyProperties(d, obj);
        return disRep.save(obj);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity obj = disRep.getById(d.getCodigo());
        obj.setEstdis(false);
        return disRep.save(obj);
    }
    
}
