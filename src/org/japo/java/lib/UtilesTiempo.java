/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raúl Granel Blasco - raul.granel@gmail.com
 */
public class UtilesTiempo {

    // Obtiene el TIEMPO UNIX.
    public static long getTiempoUnix() {
        long x = System.currentTimeMillis();
        return x;
    }

    // Obtiene TIEMPO RESTANTE.
    public static String getRestanteTiempo(int h, int m, int s) {
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        long hora = gc.get(java.util.Calendar.HOUR_OF_DAY);
        long minuto = gc.get(java.util.Calendar.MINUTE);
        long segundo = gc.get(java.util.Calendar.SECOND);
        long rHora = h - hora;
        long rMinuto = m - minuto;
        long rSegundo = s - segundo;
        while (rMinuto < 0) {
            rMinuto = rMinuto + 60;
            rHora--;
        }

        while (rMinuto > 60) {
            rMinuto = rMinuto - 60;
            rHora++;
        }

        while (rSegundo < 0) {
            rSegundo = rSegundo + 60;
            rMinuto--;
        }

        while (rSegundo > 60) {
            rSegundo = rSegundo - 60;
            rMinuto++;
        }
        return String.format("Tiempo restante : %02d:%02d:%02d\n", rHora, rMinuto, rSegundo);
    }

    // Obtiene TIEMPO EXTRA.
    public static String getTiempoExtra(int h, int m, int s) {
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        long hora = gc.get(java.util.Calendar.HOUR_OF_DAY);
        long minuto = gc.get(java.util.Calendar.MINUTE);
        long segundo = gc.get(java.util.Calendar.SECOND);
        return String.format("Hora de mas: %02d:%02d:%02d\n", hora - 10, minuto - 5, segundo);
    }

}
