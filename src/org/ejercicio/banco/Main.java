 package org.ejercicio.banco;
public class Main 
{
    public static void main(String[] args) {
      Cliente Cliente1 = new Cliente ("cynthia",121424);
      CuentaBancaria cuenta1 = new CuentaBancaria(140806, Cliente1, 10000);
    }
}