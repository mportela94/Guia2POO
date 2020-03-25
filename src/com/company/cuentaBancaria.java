package com.company;

import java.util.Scanner;

public class cuentaBancaria {

    int id;
    String nombre;
    double balance;

    public cuentaBancaria(int id, String nombre, double balance){
        this.id=id;
        this.nombre=nombre;
        this.balance=balance;
    }

    protected void setID (int id){
        this.id=id;
    }

    protected int getID(){
        return id;
    }

    protected void setNombre(String nombre){
        this.nombre=nombre;
    }

    protected String getNombre (){
        return nombre;
    }

    protected void setBalance(double balance){
        this.balance=balance;
    }

    protected double getBalance(){
        return balance;
    }

    protected double credito (){
        double deposito;
        Scanner saldo= new Scanner(System.in);

        System.out.println("\nIngrese la cantidad de dinero que quiere ingresar a la cuenta:");
        deposito=saldo.nextDouble();

        balance=balance+deposito;
        return balance;
    }

    protected double debito (){
        double extraccion;
        Scanner saldo=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        extraccion=saldo.nextDouble();

        if (balance<extraccion){
            System.out.println("\nNo tiene saldo suficiente para la extraccion.");
        }else{
            balance=balance-extraccion;
        }
        return balance;
    }

    protected void mostrarCuenta (){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Balance: " + balance);
    }


}
