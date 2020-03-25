package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        ejercicio1();

        ejercicio2();

        ejercicio3();
        */
        ejercicio4();
    }


    public static void ejercicio1 () {
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
        rectangulito.mostrarDimensiones();

        /*1.C*/
        area = rectangulito.area();
        perimetro = rectangulito.perimetro();

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
        rectangulito.mostrarDimensiones();

        /*1.E*/

        area = rectangulito.area();
        perimetro = rectangulito.perimetro();

        rectangulito.muestraAyP(area, perimetro);

        /*1.F*/
        rectangulito = new Rectangulo(1.0, 1.0);
        rectangulito.mostrarDimensiones();
    }

    public static void ejercicio2(){
        /*2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
            apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
            anual. A su vez se requiere otro método que permita aumentar el salario
            dependiendo del porcentaje que se le pase por parámetro. Considere crear un
            método que facilite imprimir por pantalla las características del objeto de la
            siguiente forma:
            Empleado[dni=?, nombre=?, apellido=?, salario=?]
                    a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
                    25000.
                    b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
                    27500.
                    c. Imprima ambos objetos por pantalla
                    d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
                    salario anual del mismo.*/

        /*1.A*/
        Empleado empleado1 = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        /*1.B*/
        Empleado empleado2 = new Empleado(34234123, "Ana", "Sanchez", 27500);
        /*1.C*/
        empleado1.mostrarEmpleado();
        empleado2.mostrarEmpleado();
        /*1.D*/
        float sueldoAnual;
        float nuevoSueldo;

        nuevoSueldo=empleado1.aumentoSueldo(15);
        empleado1.setSalario(nuevoSueldo);
        /*empleado1.mostrarEmpleado();*/

        sueldoAnual=empleado1.sueldoAnual();
        System.out.println("\nEl nuevo salario anual de " + empleado1.nombre + " " + empleado1.apellido +" es $" + sueldoAnual);

    }

    public static void  ejercicio3(){
        /*3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
            descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
            total teniendo en cuenta el precio unitario y cantidad. Un método que permita
            imprimir por pantalla los atributos del objeto de la siguiente forma:
                    ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
                    a. Inicialice el objeto con los atributos necesarios
                    b. Imprima por pantalla el objeto inicializado.*/

        float pTotal;
        /*1.A*/
        itemVenta unItem= new itemVenta(0,"/0",0,0);

        unItem.cargarItem();
        unItem.mostrarItem();

        pTotal=unItem.precioTotal();
        System.out.println("\nEl precio total es de:" + pTotal);
    }

    public static void ejercicio4(){
        /*4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
            y balance. Considere los getters, setters y constructores necesarios. Tenga en
            cuenta los siguientes métodos.
                    a. El método crédito que representa un depósito de dinero en la cuenta. Este
                    método debe devolver el balance luego de la operación.
                    b. El método débito que representa una sustracción de dinero de la cuenta.
                    Este método debe devolver el balance luego de la operación. Si el dinero en
                    la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
                    pantalla un aviso.
                    c. Un método que imprima por pantalla las características del objeto.*/

        cuentaBancaria nuevaCuenta = new cuentaBancaria(1, "Matias Portela", 25000);

        nuevaCuenta.balance=nuevaCuenta.credito();
        nuevaCuenta.mostrarCuenta();

        nuevaCuenta.balance=nuevaCuenta.debito();
        nuevaCuenta.mostrarCuenta();
    }

    public static void ejercicio5(){
        /*5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
            Tenga en cuenta el rango de valores aceptados para cada uno de estos.
                a. Hora: 0 … 23
                b. Minuto: 0 … 59
                c. Segundo: 0 … 59
            Considere el siguiente comportamiento:
                1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
                usando zero a la izquierda ejemplo 13:04:22 .
                2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
                3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
                4. Instanciar el objeto y probar los métodos creados.*/

        
    }
}



