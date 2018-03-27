/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICB_Evolution;

/**
 *
 * @author jjene
 */
public class Dimension {

    // Calculamos el número de etiquetas utilizadas
    public static int dimension(String[] var) {
        int n = 0;
        for (int d = 0; d < 15; d++) {
            if (var[d].isEmpty()) {
                return n;
            } else {
                n++;
            }
        }
        return n;
    }

    // Redimensiona la matriz para adaptarse al número de etiquietas utilizadas
    public static String[] redimensiona(String[] arr, int n) {
        String[] temp;
        if (arr.length < n) {
            temp = new String[n];
            System.arraycopy(arr, 0, temp, 0, arr.length);
        } else {
            if (arr.length > n) {
                temp = new String[n];
                for (int i = 0; i > n; i++) {
                    temp[i] = arr[i];
                }
            } else {
                temp = arr;
            }
        }
        return temp;
    }
}
