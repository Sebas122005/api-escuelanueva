
package com.example.escuelaNueva.controller;

import com.example.escuelaNueva.entity.DistritoEntity;
import com.example.escuelaNueva.service.DistritoService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // Indica que es un conroller tipo REST , aparece en la version 4 de spring, esto es igual a = @Controller + @ResponseBody
@RequestMapping("/distrito") //permite definir el nombre del ENDPOINT
public class DistritoController {
    
    @Autowired 
    private  DistritoService dService;
    
    @GetMapping
    public List<DistritoEntity> listar(){
        return dService.findAll();
    }
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return dService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<DistritoEntity> findById(@PathVariable Long id){
        return dService.finById(id);
    }
    
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity c){
        return dService.add(c);
    }
    
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long  id, @RequestBody DistritoEntity c) {
        c.setCodigo(id);
        return dService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable long id){
        DistritoEntity obj = new DistritoEntity();
        obj.setEstdis(false);
        return dService.delete(DistritoEntity.builder().codigo(id).build());
    }
    
}
