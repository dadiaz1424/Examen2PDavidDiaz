package ec.espe.edu.arquitectura.examen.Dto;

import java.math.BigDecimal;

public class EmpleadoPagoDto {

    private String numeroCuenta;
    private BigDecimal valor;
    public EmpleadoPagoDto() {
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public EmpleadoPagoDto(String numeroCuenta, BigDecimal valor) {
        this.numeroCuenta = numeroCuenta;
        this.valor = valor;
    }
    
    
    
}
