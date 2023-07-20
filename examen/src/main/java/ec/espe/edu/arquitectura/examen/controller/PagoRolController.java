package ec.espe.edu.arquitectura.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.espe.edu.arquitectura.examen.Dto.PagoRolDto;
import ec.espe.edu.arquitectura.examen.model.PagoRol;
import ec.espe.edu.arquitectura.examen.services.PagoRolService;

@RestController
@RequestMapping("/pagorol")
public class PagoRolController {
    @Autowired
    PagoRolService pagoRolService;

    
    public PagoRolController(PagoRolService pagoRolService) {
        this.pagoRolService = pagoRolService;
    }

    @PostMapping
    public ResponseEntity<PagoRol> crearPagoRol(@RequestBody PagoRolDto pagoRolDTO) {
        PagoRol nuevoPagoRol = pagoRolService.crearPagoRol(pagoRolDTO);
        return ResponseEntity.ok(nuevoPagoRol);
    }

    @GetMapping("/{rucEmpresa}/{mes}")
    public ResponseEntity<List<PagoRolDto>> obtenerPagosPorMesYEmpresa(
            @PathVariable String rucEmpresa, @PathVariable String mes) {
        List<PagoRolDto> pagos = pagoRolService.obtenerPagosPorMesYEmpresa(rucEmpresa, mes);
        return new ResponseEntity<>(pagos, HttpStatus.OK);
    }
}
