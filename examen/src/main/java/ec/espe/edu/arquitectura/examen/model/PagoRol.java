package ec.espe.edu.arquitectura.examen.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import ec.espe.edu.arquitectura.examen.Dto.EmpleadoPagoDto;

@Document(collection = "PagoRol")
public class PagoRol {
    @Id
    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private BigDecimal valorTotal;
    private BigDecimal valorReal;
    private List<EmpleadoPagoDto> empleadosPago;
    public PagoRol() {
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
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public BigDecimal getValorReal() {
        return valorReal;
    }
    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }
    public List<EmpleadoPagoDto> getEmpleadosPago() {
        return empleadosPago;
    }
    public void setEmpleadosPago(List<EmpleadoPagoDto> list) {
        this.empleadosPago = list;
    }
    public PagoRol(String mes, Date fechaProceso, String rucEmpresa, String cuentaPrincipal, BigDecimal valorTotal,
            BigDecimal valorReal, List<EmpleadoPagoDto> empleadosPago) {
        this.mes = mes;
        this.fechaProceso = fechaProceso;
        this.rucEmpresa = rucEmpresa;
        this.cuentaPrincipal = cuentaPrincipal;
        this.valorTotal = valorTotal;
        this.valorReal = valorReal;
        this.empleadosPago = empleadosPago;
    }
    
    
    
}