package com.company;

import java.util.Scanner;

public class Main {

    public static class Rectangulo {

        private double ancho;
        private double alto;

        public Rectangulo(double ancho, double alto) {
            this.ancho = ancho;
            this.alto = alto;
        }

        public double getAncho() {
            return ancho;
        }

        public void setAncho(double ancho) {
            this.ancho = ancho;
        }

        public double getAlto() {
            return alto;
        }

        public void setAlto(double alto) {
            this.alto = alto;
        }

        public double area (double alto, double ancho){
            return (alto*ancho);
        }

        public double perimetro (double alto, double ancho){
            return ((alto+ancho)*2);
        }

        public void mostrarDimensiones (double alto, double ancho){
            System.out.println("\nAlto:" + alto + "\nAncho:" + ancho);
        }
        public void muestraAyP (double area, double perimetro){
            System.out.println("\nArea:" + area + "\nPerimetro:" + perimetro);
        }
    }


    public static void main(String[] args) {

        ejercicio1();
        

    }

    public static  void ejercicio1 () {
        /*1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
            1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
            debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
            siguientes pruebas:
                    a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
                    b. Imprimir por pantalla el alto y ancho.
                    c. Imprimir por pantalla el área y perímetro.
                    d. Modificar el alto y el ancho de la instancia.
                    e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
                    f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.*/

        double area, perimetro;

        /*1.A*/
        Rectangulo rectangulito = new Rectangulo(1.0, 1.0);

        /*1.B*/
        rectangulito.mostrarDimensiones(rectangulito.alto, rectangulito.ancho);

        /*1.C*/
        area = rectangulito.area(rectangulito.alto, rectangulito.ancho);
        perimetro = rectangulito.perimetro(rectangulito.alto, rectangulito.ancho);

        rectangulito.muestraAyP(area, perimetro);

        /*1.D*/
        Scanner aux;
        double alto, ancho;

        System.out.println("\nIngrese el alto del rectangulo:\t");
        aux = new Scanner(System.in);
        alto = aux.nextDouble();
        System.out.println("\nIngrese el ancho del rectangulo:\t");
        aux = new Scanner(System.in);
        ancho = aux.nextDouble();

        rectangulito.setAlto(alto);
        rectangulito.setAncho(ancho);
        rectangulito.mostrarDimensiones(rectangulito.alto, rectangulito.ancho);

        /*1.E*/

        area = rectangulito.area(rectangulito.alto, rectangulito.ancho);
        perimetro = rectangulito.perimetro(rectangulito.alto, rectangulito.ancho);

        rectangulito.muestraAyP(area, perimetro);

        /*1.F*/
        rectangulito = new Rectangulo(1.0, 1.0);
        rectangulito.mostrarDimensiones(rectangulito.alto, rectangulito.ancho);
    }

}



