/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos Hack
 */


public class Codigo {
    private String nombre;
    private int numeroCuenta;
    private int dia;
    private int mes;
    private final long saldoInicial;
    private long saldoN;
    private String mesaño;
   

    public Codigo(){
        nombre = "";
        numeroCuenta = 0;
        dia = 0;
        mes = 0;
        saldoInicial=0;
        saldoN=0;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int num) {
        numeroCuenta = num;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public long getSaldoN() {
        return saldoN;
    }

    public long setSaldoN() {
        saldoN = saldoInicial;
        return saldoInicial;
    }
    
    public long OperacionConsg(long valor){
    saldoN=saldoN+valor;//saldoN+=valor;
    return saldoN;
    }
    
    public String getMesaño() {
        return mesaño;
    }

  
    public void setMesaño(String mesaño) {
        this.mesaño = mesaño;
    }
    public long OperacionRet(long valor){
   if(saldoN==0){
     JOptionPane.showMessageDialog(null, "Saldo Insuficiente, para retirar debe tener en la cuenta un valor mayor a: $0");
   }else if(saldoN<valor){
      JOptionPane.showMessageDialog(null, "Saldo Insuficiente, para realizar esta operacion debe retirar un valor menor o igual a: "+saldoN);
   }else{
       saldoN=saldoN-valor;//saldoN-=valor;
   }
    return saldoN;
    } 
    
    public void CrearCuenta(String nom, int numC){
      
        nombre=nom;
        numeroCuenta=numC;
    }
    
    public String historialC(double valor,int fecha){
        String salida="";
        salida="El dia: "+fecha+"se consignaron: "+"$"+valor;
        return salida;
    }

   
   



}

