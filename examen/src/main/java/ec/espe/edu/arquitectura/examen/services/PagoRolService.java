package ec.espe.edu.arquitectura.examen.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.espe.edu.arquitectura.examen.Dto.PagoRolDto;
import ec.espe.edu.arquitectura.examen.model.PagoRol;
import ec.espe.edu.arquitectura.examen.repository.PagoRolRepository;

@Service
public class PagoRolService {


    @Autowired
    private final PagoRolRepository pagoRolRepository;

    
    public PagoRolService(PagoRolRepository pagoRolRepository) {
        this.pagoRolRepository = pagoRolRepository;
    }

    public PagoRol crearPagoRol(PagoRolDto pagoRolDTO) {
        PagoRol pagoRol = mapPagoRolDTOToPagoRol(pagoRolDTO);
        return pagoRolRepository.save(pagoRol);
    }

    public List<PagoRolDto> obtenerPagosPorMesYEmpresa(String rucEmpresa, String mes) {
        List<PagoRol> pagos = pagoRolRepository.findByRucEmpresaAndMes(rucEmpresa, mes);
        return pagos.stream().map(this::mapPagoRolToPagoRolDTO).collect(Collectors.toList());
    }

    private PagoRol mapPagoRolDTOToPagoRol(PagoRolDto pagoRolDTO) {
        PagoRol pagoRol = new PagoRol();
        pagoRol.setMes(pagoRolDTO.getMes());
        pagoRol.setFechaProceso(pagoRolDTO.getFechaProceso());
        pagoRol.setRucEmpresa(pagoRolDTO.getRucEmpresa());
        pagoRol.setCuentaPrincipal(pagoRolDTO.getCuentaPrincipal());
        pagoRol.setValorTotal(BigDecimal.ZERO);
        pagoRol.setValorReal(BigDecimal.ZERO);
        pagoRol.setEmpleadosPago(pagoRolDTO.getEmpleadosPago());
        return pagoRol;
    }

    private PagoRolDto mapPagoRolToPagoRolDTO(PagoRol pagoRol) {
        PagoRolDto pagoRolDTO = new PagoRolDto();
        pagoRolDTO.setMes(pagoRol.getMes());
        pagoRolDTO.setFechaProceso(pagoRol.getFechaProceso());
        pagoRolDTO.setRucEmpresa(pagoRol.getRucEmpresa());
        pagoRolDTO.setCuentaPrincipal(pagoRol.getCuentaPrincipal());
        pagoRolDTO.setEmpleadosPago(pagoRol.getEmpleadosPago());
        return pagoRolDTO;
    }
    
}
