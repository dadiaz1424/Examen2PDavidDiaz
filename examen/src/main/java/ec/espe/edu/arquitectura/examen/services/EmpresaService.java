package ec.espe.edu.arquitectura.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.espe.edu.arquitectura.examen.Dto.EmpresaDto;
import ec.espe.edu.arquitectura.examen.model.Empresa;
import ec.espe.edu.arquitectura.examen.repository.EmpresaRepository;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa crearEmpresaConEmpleados(EmpresaDto empresaDTO) {
        Empresa empresa = EmpresaDtoToEmpresa(empresaDTO);
        return empresaRepository.save(empresa);
    }

    private Empresa EmpresaDtoToEmpresa(EmpresaDto empresaDTO) {
        Empresa empresa = new Empresa();
        empresa.setRUC(empresaDTO.getRUC());
        empresa.setRazonSocial(empresaDTO.getRazonSocial());
        empresa.setCuentaPrincipal(empresaDTO.getCuentaPrincipal());
        empresa.setEmpleados(empresaDTO.getEmpleados());
        return empresa;
    }
}
