package ec.espe.edu.arquitectura.examen.Dto;

import java.util.List;

public class EmpresaDto {
    private String RUC;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<EmpleadoDto> empleados;
    public EmpresaDto() {
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
    public void setEmpleados(List<EmpleadoDto> empleados) {
        this.empleados = empleados;
    }
    public EmpresaDto(String rUC, String razonSocial, String cuentaPrincipal, List<EmpleadoDto> empleados) {
        RUC = rUC;
        this.razonSocial = razonSocial;
        this.cuentaPrincipal = cuentaPrincipal;
        this.empleados = empleados;
    }
    
    
}
