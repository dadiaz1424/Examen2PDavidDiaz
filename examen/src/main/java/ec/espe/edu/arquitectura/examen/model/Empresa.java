package ec.espe.edu.arquitectura.examen.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import ec.espe.edu.arquitectura.examen.Dto.EmpleadoDto;

@Document(collection = "Empresa")
public class Empresa {
    @Id
    private String RUC;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<EmpleadoDto> empleados;
    
    public Empresa() {
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String rUC) {
        RUC = rUC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuentaPrincipal() {
        return cuentaPrincipal;
    }

    public void setCuentaPrincipal(String cuentaPrincipal) {
        this.cuentaPrincipal = cuentaPrincipal;
    }

    public List<EmpleadoDto> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<EmpleadoDto> list) {
        this.empleados = list;
    }

    public Empresa(String rUC, String razonSocial, String cuentaPrincipal, List<EmpleadoDto> empleados) {
        RUC = rUC;
        this.razonSocial = razonSocial;
        this.cuentaPrincipal = cuentaPrincipal;
        this.empleados = empleados;
    }

    
    
    
}