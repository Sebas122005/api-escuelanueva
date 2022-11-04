/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.escuelaNueva.service;

import com.example.escuelaNueva.entity.ParentescoEntity;
import com.example.escuelaNueva.repository.ParentescoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ParentescoServiceImpl implements ParentescoService {

    @Autowired
    private ParentescoRepository prRe;
    
    @Override
    public List<ParentescoEntity> findAll() {
        return prRe.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return prRe.findAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> finById(Long id) {
        return prRe.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity p) {
        return prRe.save(p);
    }

    @Override
    public ParentescoEntity update(ParentescoEntity p) {
        ParentescoEntity obj = prRe.getById(p.getCodigo());
        BeanUtils.copyProperties(p,obj);
        return prRe.save(obj);
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity p) {
        ParentescoEntity obj = prRe.getById(p.getCodigo());
        obj.setEstpar(false);
        return prRe.save(obj);
    }
    
}
