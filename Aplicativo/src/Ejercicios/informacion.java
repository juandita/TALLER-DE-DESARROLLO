package Ejercicios;

import java.io.*;

public class informacion
{
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader bf = new  BufferedReader(new InputStreamReader(System.in));
        String nom,viv,hob,via,peli;
        System.out.print("Mi nombre es ");
        nom = bf.readLine();
        System.out.print("Vivo en ");
        viv = bf.readLine();
        System.out.print("Mi hobbie es ");
        hob = bf.readLine();
        System.out.print("Me gustaria viajar a ");
        via = bf.readLine();
        System.out.print("Mi pelicula favorita es ");
        peli = bf.readLine();
    }
}