package com.company;

public class Empleado {

        int documento;
        String nombre;
        String apellido;
        float salario;

        public Empleado (int documento, String nombre, String apellido, float salario){
            this.documento=documento;
            this.nombre=nombre;
            this.apellido=apellido;
            this.salario=salario;
        }

        private void setDocumento(int documento){
            this.documento=documento;
        }
        private int getDocumento(){
            return documento;
        }

        private void setNombre (String nombre){
            this.nombre=nombre;
        }
        private String getNombre (){
            return nombre;
        }

        private void setApellido (String apellido){
            this.apellido=apellido;
        }
        private String getApellido (){
            return apellido;
        }

        protected void setSalario(float salario){
            this.salario=salario;
        }
        private float getSalario (){
            return salario;
        }

        protected void mostrarEmpleado (){
            System.out.println("\nNombre y Apellido: " + nombre + " " + apellido);
            System.out.println("DNI: " + documento);
            System.out.println("Salario: "+ salario);
        }

        protected float sueldoAnual (){
            return (salario*12);
        }

        protected float aumentoSueldo (int porcentaje){
            float aumento= salario * (1+((float)porcentaje/100));
            return  aumento;
        }



}
