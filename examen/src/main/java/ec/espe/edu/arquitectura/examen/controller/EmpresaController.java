package ec.espe.edu.arquitectura.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.espe.edu.arquitectura.examen.Dto.EmpresaDto;
import ec.espe.edu.arquitectura.examen.model.Empresa;

import ec.espe.edu.arquitectura.examen.services.EmpresaService;

@RestController
@RequestMapping("/empresa")

public class EmpresaController {
    
    @Autowired
    EmpresaService empresaService;

     @PostMapping
    public ResponseEntity<Empresa> crearEmpresa(@RequestBody EmpresaDto empresaDTO) {
        Empresa nuevaEmpresa = empresaService.crearEmpresaConEmpleados(empresaDTO);
        return ResponseEntity.ok(nuevaEmpresa);
    }
}
