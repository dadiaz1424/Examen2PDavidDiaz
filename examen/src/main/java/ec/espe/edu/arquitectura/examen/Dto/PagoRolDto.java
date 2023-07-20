package ec.espe.edu.arquitectura.examen.Dto;

import java.util.Date;
import java.util.List;

public class PagoRolDto {

    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private List<EmpleadoPagoDto> empleadosPago;
    public PagoRolDto() {
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public Date getFechaProceso() {
        return fechaProceso;
    }
    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }
    public String getRucEmpresa() {
        return rucEmpresa;
    }
    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }
    public String getCuentaPrincipal() {
        return cuentaPrincipal;
    }
    public void setCuentaPrincipal(String cuentaPrincipal) {
        this.cuentaPrincipal = cuentaPrincipal;
    }
    public List<EmpleadoPagoDto> getEmpleadosPago() {
        return empleadosPago;
    }
    public void setEmpleadosPago(List<EmpleadoPagoDto> empleadosPago) {
        this.empleadosPago = empleadosPago;
    }
    public PagoRolDto(String mes, Date fechaProceso, String rucEmpresa, String cuentaPrincipal,
            List<EmpleadoPagoDto> empleadosPago) {
        this.mes = mes;
        this.fechaProceso = fechaProceso;
        this.rucEmpresa = rucEmpresa;
        this.cuentaPrincipal = cuentaPrincipal;
        this.empleadosPago = empleadosPago;
    }

    
    
}
