package com.company;

import java.util.Scanner;

public class itemVenta {

    int id;
    String descripcion;
    int cantidad;
    float pUnitario;

    public itemVenta(int id, String descripcion, int cantidad, float pUnitario){
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.pUnitario=pUnitario;
    }

    private void setId (int id){
        this.id=id;
    }
    private int getId (){
        return id;
    }
    private void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    private String getDescripcion(){
        return descripcion;
    }
    private void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    private int getCantidad(){
        return cantidad;
    }
    private void setPunitario(float pUnitario){
        this.pUnitario=pUnitario;
    }
    private float getPunitario(){
        return pUnitario;
    }

    protected void cargarItem(){

        Scanner aux=new Scanner(System.in);
        Scanner texto=new Scanner(System.in);

        System.out.println("\nIngrese el id del item: ");
        id=aux.nextInt();
        System.out.println("Ingrese la descripcion del producto:");
        descripcion=texto.nextLine();
        System.out.println("Ingrese la cantidad:");
        cantidad=aux.nextInt();
        System.out.println("Ingrese el precio unitario:");
        pUnitario=aux.nextFloat();

    }

    protected void mostrarItem(){
        System.out.println("\nID: " + id);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + pUnitario);
    }

    protected float precioTotal (){
        float pTotal=cantidad*pUnitario;
        return pTotal;
    }
}
