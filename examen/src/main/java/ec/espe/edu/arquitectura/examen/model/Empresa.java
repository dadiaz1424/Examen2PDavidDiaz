package ec.espe.edu.arquitectura.examen.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Empresa")
public class Empresa {
    @Id
    private String RUC;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<Empleado> empleados;
    
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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empresa(String rUC, String razonSocial, String cuentaPrincipal, List<Empleado> empleados) {
        RUC = rUC;
        this.razonSocial = razonSocial;
        this.cuentaPrincipal = cuentaPrincipal;
        this.empleados = empleados;
    }

    
    
    
}