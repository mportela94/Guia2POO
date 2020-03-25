package com.company;

public class Rectangulo {

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

        public double area (){
            return (alto*ancho);
        }

        public double perimetro (){
            return ((alto+ancho)*2);
        }

        public void mostrarDimensiones (){
            System.out.println("\nAlto:" + alto + "\nAncho:" + ancho);
        }
        public void muestraAyP (double area, double perimetro){
            System.out.println("\nArea:" + area + "\nPerimetro:" + perimetro);
        }
    }

