package com.company;

import java.util.Formatter;
import java.util.Scanner;

public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    public Hora (int hora, int minutos, int segundos){

        /*if (hora<0 || hora >23){
            throw IllegalArgumentException(hora + "Tiene que ser un valor entre 0 y 23");
        }
        if (minutos<0 || minutos >59){
            throw IllegalArgumentException(hora + "Tiene que ser un valor entre 0 y 59");
        }
        if (segundos<0 || segundos >59){
            throw IllegalArgumentException(hora + "Tiene que ser un valor entre 0 y 59");
        }
        */

        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void cargarHora(){
        Scanner scanner=new Scanner(System.in);
        int hora=24,minutos=100,segundos=100;


        while (hora<0 || hora >23){
            System.out.println("Ingrese un numero entre 0 y 23 para la Hora: ");
            hora=scanner.nextInt();
        }
        while (minutos<0 || minutos >59){
            System.out.println("Ingrese un numero entre 0 y 59 para los Minutos: ");
            minutos=scanner.nextInt();
        }
        while (segundos<0 || segundos >59){
            System.out.println("Ingrese un numero entre 0 y 59 para los segundos: ");
            segundos=scanner.nextInt();
        }
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void mostrarHora(){
        Formatter fmtHora = new Formatter();
        Formatter fmtMinuto = new Formatter();
        Formatter fmtSegundos = new Formatter();

        if (0<=hora || hora<10){
            fmtHora.format("%02d",hora);
        }

        if (0<=minutos || minutos<10){
            fmtMinuto.format("%02d",minutos);
        }

        if (0<=segundos || segundos<10){
            fmtSegundos.format("%02d",segundos);
        }

        System.out.println("\n" + fmtHora + ":" + fmtMinuto + ":" + fmtSegundos);

    }

    public void sumarSegundo (){

        segundos=(segundos+1);

        if (segundos==60){
            segundos=0;
            minutos=minutos+1;
            if (minutos==60){
                minutos=0;
                hora=hora+1;
                if (hora==24){
                    hora=0;
                }
            }
        }
    }

    public void restarSegundo (){

        segundos=(segundos-1);

        if (segundos<0){
            segundos=59;
            minutos=minutos-1;
            if (minutos<59){
                minutos=59;
                hora=hora-1;
                if (hora<0){
                    hora=23;
                }
            }
        }
    }



}
