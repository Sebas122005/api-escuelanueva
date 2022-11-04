package com.example.escuelaNueva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.escuelaNueva.entity.ApoderadoEntity;
import com.example.escuelaNueva.service.ApoderadoService;

@RestController
@RequestMapping("/apoderado") 
public class ApoderadoController {
    
    @Autowired 
    private  ApoderadoService dService;
    
    @GetMapping
    public List<ApoderadoEntity> findAll(){
        return dService.findAll();
    }
    @GetMapping("/custom")
    public List<ApoderadoEntity> findAllCustom(){
        return dService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ApoderadoEntity> findById(@PathVariable Long id){
        return dService.finById(id);
    }
    
    @PostMapping
    public ApoderadoEntity add(@RequestBody ApoderadoEntity c){
        return dService.add(c);
    }
    
    @PutMapping("/{id}")
    public ApoderadoEntity update(@PathVariable long  id, @RequestBody ApoderadoEntity c) {
        c.setCodapo(id);
        return dService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ApoderadoEntity delete(@PathVariable long id){
        ApoderadoEntity obj = new ApoderadoEntity();
        obj.setEstapo(false);
        return dService.delete(ApoderadoEntity.builder().codapo(id).build());
    }
}
