/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yagami
 */
public class recibo {
    public int id;
    public String fecha;
    public String nombre;
    public String contacto;
    public String trabajador;
    public double efectivo;
    public double transferencia;
    public double saldo;
    public double total;
    public int estado;

    public recibo(int id, String fecha, String nombre, String contacto, String trabajador, double efectivo, double transferencia, double saldo, double total, int estado) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.contacto = contacto;
        this.trabajador = trabajador;
        this.efectivo = efectivo;
        this.transferencia = transferencia;
        this.saldo = saldo;
        this.total = total;
        this.estado = estado;
    }

    public recibo() {
    }
    
    
    
}
