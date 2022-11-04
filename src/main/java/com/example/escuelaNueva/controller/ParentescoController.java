package com.example.escuelaNueva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.escuelaNueva.entity.ParentescoEntity;

import com.example.escuelaNueva.service.ParentescoService;

import java.util.*;

@RestController
@RequestMapping("/parentesco") 
public class ParentescoController {
    
    @Autowired 
    private  ParentescoService dService;
    
    @GetMapping
    public List<ParentescoEntity> findAll(){
        return dService.findAll();
    }
    @GetMapping("/custom")
    public List<ParentescoEntity> findAllCustom(){
        return dService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ParentescoEntity> findById(@PathVariable Long id){
        return dService.finById(id);
    }
    
    @PostMapping
    public ParentescoEntity add(@RequestBody ParentescoEntity c){
        return dService.add(c);
    }
    
    @PutMapping("/{id}")
    public ParentescoEntity update(@PathVariable long  id, @RequestBody ParentescoEntity c) {
        c.setCodigo(id);
        return dService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ParentescoEntity delete(@PathVariable long id){
        ParentescoEntity obj = new ParentescoEntity();
        obj.setEstpar(false);
        return dService.delete(ParentescoEntity.builder().codigo(id).build());
    }
}
