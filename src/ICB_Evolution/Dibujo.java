/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICB_Evolution;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.io.File;
import java.math.BigDecimal;
import javax.imageio.ImageIO;

/**
 *
 * @author jjene
 */
public class Dibujo {
    

    /**
     *
     * @param g
     * @param x
     * @param y
     * @param x1
     * @param y1
     */
    public static void hacerLinea(Graphics g, int x, int y, int x1, int y1) {
        g.drawLine(x, y, x1, y1);
    }

    /**
     *
     * @param dato
     * @return
     */
    public static String[] ordena(String[] dato) {
        int ordenx, ordeny;
        String[] cDistinto = {"255", "0", "255"};
        String[] cPeor = {"255", "0", "0"};
        String[] cIgual = {"0", "0", "255"};
        String[] cMejor = {"0", "255", "0"};
        String[] cNoValorable = {"0", "255", "255"};

        for (int x = 0; x < dato.length; x = x + 4) {
            for (int y = x + 4; y < dato.length; y = y + 4) {
                if ((cDistinto[0].equals(dato[x + 1].toString())) & (cDistinto[1].equals(dato[x + 2].toString())) & (cDistinto[2].equals(dato[x + 3].toString()))) {
                    ordenx = 4;
                } else {
                    if ((cPeor[0].equals(dato[x + 1].toString())) & (cPeor[1].equals(dato[x + 2].toString())) & (cPeor[2].equals(dato[x + 3].toString()))) {
                        ordenx = 3;
                    } else {
                        if ((cIgual[0].equals(dato[x + 1].toString())) & (cIgual[1].equals(dato[x + 2].toString())) & (cIgual[2].equals(dato[x + 3].toString()))) {
                            ordenx = 2;
                        } else {
                            if ((cMejor[0].equals(dato[x + 1].toString())) & (cMejor[1].equals(dato[x + 2].toString())) & (cMejor[2].equals(dato[x + 3].toString()))) {
                                ordenx = 1;
                            } else {
                                if ((cNoValorable[0].equals(dato[x + 1].toString())) & (cNoValorable[1].equals(dato[x + 2].toString())) & (cNoValorable[2].equals(dato[x + 3].toString()))) {
                                    ordenx = 5;
                                } else {
                                    ordenx = 6;
                                }
                            }
                        }
                    }
                }
                if ((cDistinto[0].equals(dato[y + 1].toString())) & (cDistinto[1].equals(dato[y + 2].toString())) & (cDistinto[2].equals(dato[y + 3].toString()))) {
                    ordeny = 4;
                } else {
                    if ((cPeor[0].equals(dato[y + 1].toString())) & (cPeor[1].equals(dato[y + 2].toString())) & (cPeor[2].equals(dato[y + 3].toString()))) {
                        ordeny = 3;
                    } else {
                        if ((cIgual[0].equals(dato[y + 1].toString())) & (cIgual[1].equals(dato[y + 2].toString())) & (cIgual[2].equals(dato[y + 3].toString()))) {
                            ordeny = 2;
                        } else {
                            if ((cMejor[0].equals(dato[y + 1].toString())) & (cMejor[1].equals(dato[y + 2].toString())) & (cMejor[2].equals(dato[y + 3].toString()))) {
                                ordeny = 1;
                            } else {
                                if ((cNoValorable[0].equals(dato[y + 1].toString())) & (cNoValorable[1].equals(dato[y + 2].toString())) & (cNoValorable[2].equals(dato[y + 3].toString()))) {
                                    ordeny = 5;
                                } else {
                                    ordeny = 6;
                                }
                            }
                        }
                    }
                }
                if (ordenx > ordeny) {
                    String[] temp = new String[4];
                    temp[0] = dato[x];
                    temp[1] = dato[x + 1];
                    temp[2] = dato[x + 2];
                    temp[3] = dato[x + 3];
                    dato[x] = dato[y];
                    dato[x + 1] = dato[y + 1];
                    dato[x + 2] = dato[y + 2];
                    dato[x + 3] = dato[y + 3];
                    dato[y] = temp[0];
                    dato[y + 1] = temp[1];
                    dato[y + 2] = temp[2];
                    dato[y + 3] = temp[3];
                }
            }
        }
        return dato;
    }

    /**
     *
     * @param dato
     * @return
     */
    public static String[] orden(String[] dato) {
        int ordenx, ordeny;
        String[] cDistinto = {"255", "0", "255"};
        String[] cPeor = {"255", "0", "0"};
        String[] cIgual = {"0", "0", "255"};
        String[] cMejor = {"0", "255", "0"};
        String[] cNoValorable = {"0", "255", "255"};

        for (int x = 0; x < dato.length; x = x + 4) {
            for (int y = x + 4; y < dato.length; y = y + 4) {
                if ((cDistinto[0].equals(dato[x + 1].toString())) & (cDistinto[1].equals(dato[x + 2].toString())) & (cDistinto[2].equals(dato[x + 3].toString()))) {
                    ordenx = 4;
                } else {
                    if ((cPeor[0].equals(dato[x + 1].toString())) & (cPeor[1].equals(dato[x + 2].toString())) & (cPeor[2].equals(dato[x + 3].toString()))) {
                        ordenx = 3;
                    } else {
                        if ((cIgual[0].equals(dato[x + 1].toString())) & (cIgual[1].equals(dato[x + 2].toString())) & (cIgual[2].equals(dato[x + 3].toString()))) {
                            ordenx = 2;
                        } else {
                            if ((cMejor[0].equals(dato[x + 1].toString())) & (cMejor[1].equals(dato[x + 2].toString())) & (cMejor[2].equals(dato[x + 3].toString()))) {
                                ordenx = 1;
                            } else {
                                if ((cNoValorable[0].equals(dato[x + 1].toString())) & (cNoValorable[1].equals(dato[x + 2].toString())) & (cNoValorable[2].equals(dato[x + 3].toString()))) {
                                    ordenx = 5;
                                } else {
                                    ordenx = 6;
                                }
                            }
                        }
                    }
                }
                if ((cDistinto[0].equals(dato[y + 1].toString())) & (cDistinto[1].equals(dato[y + 2].toString())) & (cDistinto[2].equals(dato[y + 3].toString()))) {
                    ordeny = 4;
                } else {
                    if ((cPeor[0].equals(dato[y + 1].toString())) & (cPeor[1].equals(dato[y + 2].toString())) & (cPeor[2].equals(dato[y + 3].toString()))) {
                        ordeny = 3;
                    } else {
                        if ((cIgual[0].equals(dato[y + 1].toString())) & (cIgual[1].equals(dato[y + 2].toString())) & (cIgual[2].equals(dato[y + 3].toString()))) {
                            ordeny = 2;
                        } else {
                            if ((cMejor[0].equals(dato[y + 1].toString())) & (cMejor[1].equals(dato[y + 2].toString())) & (cMejor[2].equals(dato[y + 3].toString()))) {
                                ordeny = 1;
                            } else {
                                if ((cNoValorable[0].equals(dato[y + 1].toString())) & (cNoValorable[1].equals(dato[y + 2].toString())) & (cNoValorable[2].equals(dato[y + 3].toString()))) {
                                    ordeny = 5;
                                } else {
                                    ordeny = 6;
                                }
                            }
                        }
                    }
                }
                if (ordenx < ordeny) {
                    String[] temp = new String[4];
                    temp[0] = dato[x];
                    temp[1] = dato[x + 1];
                    temp[2] = dato[x + 2];
                    temp[3] = dato[x + 3];
                    dato[x] = dato[y];
                    dato[x + 1] = dato[y + 1];
                    dato[x + 2] = dato[y + 2];
                    dato[x + 3] = dato[y + 3];
                    dato[y] = temp[0];
                    dato[y + 1] = temp[1];
                    dato[y + 2] = temp[2];
                    dato[y + 3] = temp[3];
            }
        }
        return dato;
    }

    public static Float precision(int decimalPlace, Float d) {

        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

    /**
     *
     * @param g
     * @param dato
     */
    public static void paint(Graphics g, String[] dato, String[] dato2) {
        
        // Indicamos el tipo de letra
        Font stringFont = new Font( "SansSerif", Font.BOLD, 13 );
        g.setFont( stringFont );

        // Creación del índice para la posterior ordenación de los campos
        dato = Dibujo.ordena(dato);,

        // El inicio 0 señala el Este del gráfico
        g.clearRect(0, 0, 660, 560); // Borra el rectangulo antes de volver a repintar - clearRect(int x, int y, int width, int height)

        // Calculamos cuantas partes hemos de dividir el semicirculo, segun los datos que recibimos.
        int partes = dato.length / 4;
        int w = 90, z = 145, y = 0, red = 180 / partes;
        float p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        float t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0;

        // Calculamos %s
        String[] cDistinto = {"255", "0", "255"};
        String[] cPeor = {"255", "0", "0"};
        String[] cIgual = {"0", "0", "255"};
        String[] cMejor = {"0", "255", "0"};
        String[] cNoValorable = {"0", "255", "255"};

        for (int x = 0; x < (dato.length / 4); x++) {
            if ((cDistinto[0].equals(dato[x * 4 + 1].toString())) & (cDistinto[1].equals(dato[x * 4 + 2].toString())) & (cDistinto[2].equals(dato[x * 4 + 3].toString()))) {
                p1 = ++p1;
            } else {
                if ((cPeor[0].equals(dato[x * 4 + 1].toString())) & (cPeor[1].equals(dato[x * 4 + 2].toString())) & (cPeor[2].equals(dato[x * 4 + 3].toString()))) {
                    p2 = ++p2;
                } else {
                    if ((cIgual[0].equals(dato[x * 4 + 1].toString())) & (cIgual[1].equals(dato[x * 4 + 2].toString())) & (cIgual[2].equals(dato[x * 4 + 3].toString()))) {
                        p3 = ++p3;
                    } else {
                        if ((cMejor[0].equals(dato[x * 4 + 1].toString())) & (cMejor[1].equals(dato[x * 4 + 2].toString())) & (cMejor[2].equals(dato[x * 4 + 3].toString()))) {
                            p4 = ++p4;
                        } else {
                            if ((cNoValorable[0].equals(dato[x * 4 + 1].toString())) & (cNoValorable[1].equals(dato[x * 4 + 2].toString())) & (cNoValorable[2].equals(dato[x * 4 + 3].toString()))) {
                                p5 = ++p5;
                            }
                        }
                    }
                }
            }
        }
        t1 = (100 / (float) partes) * p1;
        g.setColor(new Color(0, 0, 0));
        g.drawString(Float.toString(Dibujo.precision(2, t1)) + "% Distinto", 31, 401); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cDistinto[0]), Integer.parseInt(cDistinto[1]), Integer.parseInt(cDistinto[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t1)) + "% Distinto", 30, 400); // Escribe el nombre - drawString(String str, int x, int y)
        t2 = (100 / (float) partes) * p2;
        g.setColor(new Color(0, 0, 0));
        g.drawString(Float.toString(Dibujo.precision(2, t2)) + "% Empeora", 31, 416); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cPeor[0]), Integer.parseInt(cPeor[1]), Integer.parseInt(cPeor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t2)) + "% Empeora", 30, 415); // Escribe el nombre - drawString(String str, int x, int y)
        t3 = (100 / (float) partes) * p3;
        g.setColor(new Color(0, 0, 0));
        g.drawString(Float.toString(Dibujo.precision(2, t3)) + "% Igual", 31, 431); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cIgual[0]), Integer.parseInt(cIgual[1]), Integer.parseInt(cIgual[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t3)) + "% Igual", 30, 430); // Escribe el nombre - drawString(String str, int x, int y)
        t4 = (100 / (float) partes) * p4;
        g.setColor(new Color(0, 0, 0));
        g.drawString(Float.toString(Dibujo.precision(2, t4)) + "% Mejora", 31, 446); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cMejor[0]), Integer.parseInt(cMejor[1]), Integer.parseInt(cMejor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t4)) + "% Mejora", 30, 445); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(0, 0, 0));
        t5 = (100 / (float) partes) * p5;
        g.setColor(new Color(0, 0, 0));
        g.drawString(Float.toString(Dibujo.precision(2, t5)) + "% No valorable", 31, 461); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cNoValorable[0]), Integer.parseInt(cNoValorable[1]), Integer.parseInt(cNoValorable[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t5)) + "% No valorable", 30, 460); // Escribe el nombre - drawString(String str, int x, int y)
        // g.drawString(partes + " partes", 30, 475); // Escribe el nombre - drawString(String str, int x, int y)

        if ((partes < 15) & (partes > 12)) {
            red = 180 / partes + 1;
        } // Ajuste para que los decimales resultantes de 180/partes, no desvirtúen la imagen.
        for (int x = 0; x < (dato.length / 4); x++) {
            // Seleccionamos el color del pincel - setColor(Color c) / setColor(int R, int G, int B)
            g.setColor(new Color(Integer.parseInt(dato[x * 4 + 1].toString()), Integer.parseInt(dato[x * 4 + 2].toString()), Integer.parseInt(dato[x * 4 + 3].toString())));
            if ((w + red) > 270) {
                red = 270 - w;
            } // Ajuste para que los decimales resultantes de 180/partes, no desvirtúen la imagen.
            g.fillArc(140, 70, 350, 350, w, red); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawArc(140, 70, 350, 350, w, red); // Dibuja el arco - drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawString(dato[x * 4].toString(), 0, z); // Escribe el nombre - drawString(String str, int x, int y)
            g.setColor(Color.gray);
            g.fillArc(140, 70, 350, 350, w, 1); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            w = w + (red);
            z = z + 15;
            y = x;
        }

        // Pintamos en el último sector, lo que falte para llegar a 180
        if (w < 270) {
            g.setColor(new Color(Integer.parseInt(dato[y * 4 + 1].toString()), Integer.parseInt(dato[y * 4 + 2].toString()), Integer.parseInt(dato[y * 4 + 3].toString())));
            g.fillArc(140, 70, 350, 350, w, 270 - w); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawArc(140, 70, 350, 350, w, 270 - w); // Dibuja el arco - drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        }
        /*
         g.setColor(new Color(100, 100, 100));
         g.fillArc(30, 60, 380, 380, 125, 10);
         g.drawString("Test tool: 12%", 420, 75);

         g.setColor(Color.red);
         g.fillArc(30, 60, 380, 380, 135, 120);
         g.drawString("Power Tool Sales: 33%", 420, 90);

         g.setColor(Color.blue);
         g.fillArc(30, 60, 380, 380, 255, 75);
         g.drawString("Lawn Mower Sales: 22%", 420, 105);

         g.setColor(Color.green);
         g.fillArc(30, 60, 380, 380, 330, 80);
         g.drawString("Bench Tools Sales: 22%", 420, 120);

         g.setColor(Color.white);
         g.fillArc(30, 60, 380, 380, 50, 40);
         g.drawString("Tool Accessories Sales: 12%", 420, 135);
         */
        // g.setColor(Color.black);
        // g.drawArc(30, 60, 380, 380, 90, 360);

// ---------------------------------------------------------------
        // Creación del índice para la posterior ordenación de los campos
        dato2 = Dibujo.orden(dato2);

        // El inicio 0 señala el Este del gráfico
        // g.clearRect(0, 0, 660, 520); // Borra el rectangulo antes de volver a repintar - clearRect(int x, int y, int width, int height)
        // Calculamos cuantas partes hemos de dividir el semicirculo, segun los datos que recibimos.
        int partes2 = dato2.length / 4;
        w = 270;
        z = 145;
        y = 0;
        red = 180 / partes2;
        float pp1 = 0, pp2 = 0, pp3 = 0, pp4 = 0, pp5 = 0;
        float tt1 = 0, tt2 = 0, tt3 = 0, tt4 = 0, tt5 = 0;

        // Calculamos %s
        for (int x = 0; x < (dato2.length / 4); x++) {
            if ((cDistinto[0].equals(dato2[x * 4 + 1].toString())) & (cDistinto[1].equals(dato2[x * 4 + 2].toString())) & (cDistinto[2].equals(dato2[x * 4 + 3].toString()))) {
                pp1 = ++pp1;
            } else {
                if ((cPeor[0].equals(dato2[x * 4 + 1].toString())) & (cPeor[1].equals(dato2[x * 4 + 2].toString())) & (cPeor[2].equals(dato2[x * 4 + 3].toString()))) {
                    pp2 = ++pp2;
                } else {
                    if ((cIgual[0].equals(dato2[x * 4 + 1].toString())) & (cIgual[1].equals(dato2[x * 4 + 2].toString())) & (cIgual[2].equals(dato2[x * 4 + 3].toString()))) {
                        pp3 = ++pp3;
                    } else {
                        if ((cMejor[0].equals(dato2[x * 4 + 1].toString())) & (cMejor[1].equals(dato2[x * 4 + 2].toString())) & (cMejor[2].equals(dato2[x * 4 + 3].toString()))) {
                            pp4 = ++pp4;
                        } else {
                            if ((cNoValorable[0].equals(dato2[x * 4 + 1].toString())) & (cNoValorable[1].equals(dato2[x * 4 + 2].toString())) & (cNoValorable[2].equals(dato2[x * 4 + 3].toString()))) {
                                pp5 = ++pp5;
                            }
                        }
                    }
                }
            }
        }
        tt1 = (100 / (float) partes2) * pp1;
        g.setColor(new Color(Integer.parseInt(cDistinto[0]), Integer.parseInt(cDistinto[1]), Integer.parseInt(cDistinto[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt1)) + "% Distinto", 530, 400); // Escribe el nombre - drawString(String str, int x, int y)
        tt2 = (100 / (float) partes2) * pp2;
        g.setColor(new Color(Integer.parseInt(cPeor[0]), Integer.parseInt(cPeor[1]), Integer.parseInt(cPeor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt2)) + "% Empeora", 530, 415); // Escribe el nombre - drawString(String str, int x, int y)
        tt3 = (100 / (float) partes2) * pp3;
        g.setColor(new Color(Integer.parseInt(cIgual[0]), Integer.parseInt(cIgual[1]), Integer.parseInt(cIgual[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt3)) + "% Igual", 530, 430); // Escribe el nombre - drawString(String str, int x, int y)
        tt4 = (100 / (float) partes2) * pp4;
        g.setColor(new Color(Integer.parseInt(cMejor[0]), Integer.parseInt(cMejor[1]), Integer.parseInt(cMejor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt4)) + "% Mejora", 530, 445); // Escribe el nombre - drawString(String str, int x, int y)
        tt5 = (100 / (float) partes2) * pp5;
        g.setColor(new Color(Integer.parseInt(cNoValorable[0]), Integer.parseInt(cNoValorable[1]), Integer.parseInt(cNoValorable[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt5)) + "% No valorable", 530, 460); // Escribe el nombre - drawString(String str, int x, int y)

        if ((partes2 < 15) & (partes2 > 12)) {
            red = 180 / partes2 + 1;
        } // Ajuste para que los decimales resultantes de 180/partes, no desvirtúen la imagen.
        for (int x = 0; x < (dato2.length / 4); x++) {
            if (w < 270) {
                w = w + 180;
            }
            // Seleccionamos el color del pincel - setColor(Color c) / setColor(int R, int G, int B)
            g.setColor(new Color(Integer.parseInt(dato2[x * 4 + 1].toString()), Integer.parseInt(dato2[x * 4 + 2].toString()), Integer.parseInt(dato2[x * 4 + 3].toString())));
            if ((w + red) > 450) {
                red = 450 - w;
            } // Ajuste para que los decimales resultantes de 180/partes, no desvirtúen la imagen.
            g.fillArc(140, 70, 350, 350, w, red); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawArc(140, 70, 350, 350, w, red); // Dibuja el arco - drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            // g.drawString(temp[x * 4].toString() + " " + partes + " " + " w=" + w + " Ang=" + red, 500, z); // Escribe el nombre - drawString(String str, int x, int y)
            g.setColor(Color.gray);
            g.fillArc(140, 70, 350, 350, w, 1); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            w = w + red;
            y = x;
        }

        // Pintamos en el último sector, lo que falte para llegar a 360 + 90
        if (w < 450) {
            g.setColor(new Color(Integer.parseInt(dato2[y * 4 + 1].toString()), Integer.parseInt(dato2[y * 4 + 2].toString()), Integer.parseInt(dato2[y * 4 + 3].toString())));
            g.fillArc(140, 70, 350, 350, w, 450 - w); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawArc(140, 70, 350, 350, w, 450 - w); // Dibuja el arco - drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        }

        dato2 = Dibujo.ordena(dato2);

        for (int x = 0; x < (dato2.length / 4); x++) {
            g.setColor(new Color(Integer.parseInt(dato2[x * 4 + 1].toString()), Integer.parseInt(dato2[x * 4 + 2].toString()), Integer.parseInt(dato2[x * 4 + 3].toString())));
            g.drawString(dato2[x * 4].toString(), 500, z); // Escribe el nombre - drawString(String str, int x, int y)
            z = z + 15;
        }

        // Calculamos % TOTAL
        partes = partes + partes2;

        g.setColor(Color.black);
        g.drawString("TOTAL:", 295, 500); // Escribe el nombre - drawString(String str, int x, int y)
        g.drawLine(40, 505, 625, 505);
        g.drawLine(315, 20, 315, 470);
        // p1 = (100 / (float) partes) * (p1 + pp1);
        p1 = (t1 / 2) + (tt1 / 2);
        g.setColor(new Color(Integer.parseInt(cDistinto[0]), Integer.parseInt(cDistinto[1]), Integer.parseInt(cDistinto[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p1)) + "% Distinto", 40, 520); // Escribe el nombre - drawString(String str, int x, int y)
        // p2 = (100 / (float) partes) * (p2 + pp2);
        p2 = (t2 / 2) + (tt2 / 2);
        g.setColor(new Color(Integer.parseInt(cPeor[0]), Integer.parseInt(cPeor[1]), Integer.parseInt(cPeor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p2)) + "% Empeora", 160, 520); // Escribe el nombre - drawString(String str, int x, int y)
        // p3 = (100 / (float) partes) * (p3 + pp3);
        p3 = (t3 / 2) + (tt3 / 2);
        g.setColor(new Color(Integer.parseInt(cIgual[0]), Integer.parseInt(cIgual[1]), Integer.parseInt(cIgual[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p3)) + "% Igual", 280, 520); // Escribe el nombre - drawString(String str, int x, int y)
        // p4 = (100 / (float) partes) * (p4 + pp4);
        p4 = (t4 / 2) + (tt4 / 2);
        g.setColor(new Color(Integer.parseInt(cMejor[0]), Integer.parseInt(cMejor[1]), Integer.parseInt(cMejor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p4)) + "% Mejor", 400, 520); // Escribe el nombre - drawString(String str, int x, int y)
        // p5 = (100 / (float) partes) * (p5 + pp5);
        p5 = (t5 / 2) + (tt5 / 2);
        g.setColor(new Color(Integer.parseInt(cNoValorable[0]), Integer.parseInt(cNoValorable[1]), Integer.parseInt(cNoValorable[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p5)) + "% No valorable", 520, 520); // Escribe el nombre - drawString(String str, int x, int y)

    }

    public static void pinta(String[] dato, String[] dato2, String numero, String nombre, String fecha,String nota) {
        
        String[] cDistinto = {"255", "0", "255"};
        String[] cPeor = {"255", "0", "0"};
        String[] cIgual = {"0", "0", "255"};
        String[] cMejor = {"0", "255", "0"};
        String[] cNoValorable = {"0", "255", "255"};


        // Creamos la imagen para dibujar en ella.
        BufferedImage imagen = new BufferedImage(660, 585,
                BufferedImage.TYPE_INT_RGB);

        // Hacemos el dibujo
        Graphics g = imagen.getGraphics();

        // El inicio 0 señala el Este del gráfico
        g.clearRect(0, 0, 660, 585); // Borra el rectangulo antes de volver a repintar - clearRect(int x, int y, int width, int height)

        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, 660, 585); // Pinta el fondo ya que por defecto sadría Negro

        // Encabezamiento
        g.setColor(Color.black);
        g.drawString(numero, 20, 30); // Escribe el nombre - drawString(String str, int x, int y)
        g.drawString(nombre, 120, 30); // Escribe el nombre - drawString(String str, int x, int y)
        g.drawString(fecha, 400, 30); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(238, 238, 238));
        g.fillRect(525, 35, 100, 80);
        g.setColor(new Color(Integer.parseInt(cDistinto[0]), Integer.parseInt(cDistinto[1]), Integer.parseInt(cDistinto[2])));
        g.fillRect(530, 40, 10, 10);
        g.drawString("Distinto", 545, 50); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cPeor[0]), Integer.parseInt(cPeor[1]), Integer.parseInt(cPeor[2])));
        g.fillRect(530, 55, 10, 10);
        g.drawString("Peor", 545, 65); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cIgual[0]), Integer.parseInt(cIgual[1]), Integer.parseInt(cIgual[2])));
        g.fillRect(530, 70, 10, 10);
        g.drawString("Igual", 545, 80); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cMejor[0]), Integer.parseInt(cMejor[1]), Integer.parseInt(cMejor[2])));
        g.fillRect(530, 85, 10, 10);
        g.drawString("Mejor", 545, 95); // Escribe el nombre - drawString(String str, int x, int y)
        g.setColor(new Color(Integer.parseInt(cNoValorable[0]), Integer.parseInt(cNoValorable[1]), Integer.parseInt(cNoValorable[2])));
        g.fillRect(530, 100, 10, 10);
        g.drawString("No valorable", 545, 110); // Escribe el nombre - drawString(String str, int x, int y)

        // Creación del índice para la posterior ordenación de los campos
        dato = Dibujo.ordena(dato);

        // Calculamos cuantas partes hemos de dividir el semicirculo, segun los datos que recibimos.
        int partes = dato.length / 4;
        int w = 90, z = 145, y = 0, red = 180 / partes;
        float p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        float t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0;

        // Calculamos %s
        for (int x = 0; x < (dato.length / 4); x++) {
            if ((cDistinto[0].equals(dato[x * 4 + 1].toString())) & (cDistinto[1].equals(dato[x * 4 + 2].toString())) & (cDistinto[2].equals(dato[x * 4 + 3].toString()))) {
                p1 = ++p1;
            } else {
                if ((cPeor[0].equals(dato[x * 4 + 1].toString())) & (cPeor[1].equals(dato[x * 4 + 2].toString())) & (cPeor[2].equals(dato[x * 4 + 3].toString()))) {
                    p2 = ++p2;
                } else {
                    if ((cIgual[0].equals(dato[x * 4 + 1].toString())) & (cIgual[1].equals(dato[x * 4 + 2].toString())) & (cIgual[2].equals(dato[x * 4 + 3].toString()))) {
                        p3 = ++p3;
                    } else {
                        if ((cMejor[0].equals(dato[x * 4 + 1].toString())) & (cMejor[1].equals(dato[x * 4 + 2].toString())) & (cMejor[2].equals(dato[x * 4 + 3].toString()))) {
                            p4 = ++p4;
                        } else {
                            if ((cNoValorable[0].equals(dato[x * 4 + 1].toString())) & (cNoValorable[1].equals(dato[x * 4 + 2].toString())) & (cNoValorable[2].equals(dato[x * 4 + 3].toString()))) {
                                p5 = ++p5;
                            }
                        }
                    }
                }
            }
        }
        g.setColor(Color.black);
        g.drawString("SINTOMAS", 30, 385); // Escribe el nombre - drawString(String str, int x, int y)
        g.drawLine(30, 387, 140, 387);
        t1 = (100 / (float) partes) * p1;
        g.setColor(new Color(Integer.parseInt(cDistinto[0]), Integer.parseInt(cDistinto[1]), Integer.parseInt(cDistinto[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t1)) + "% Distinto", 30, 400); // Escribe el nombre - drawString(String str, int x, int y)
        t2 = (100 / (float) partes) * p2;
        g.setColor(new Color(Integer.parseInt(cPeor[0]), Integer.parseInt(cPeor[1]), Integer.parseInt(cPeor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t2)) + "% Empeora", 30, 415); // Escribe el nombre - drawString(String str, int x, int y)
        t3 = (100 / (float) partes) * p3;
        g.setColor(new Color(Integer.parseInt(cIgual[0]), Integer.parseInt(cIgual[1]), Integer.parseInt(cIgual[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t3)) + "% Igual", 30, 430); // Escribe el nombre - drawString(String str, int x, int y)
        t4 = (100 / (float) partes) * p4;
        g.setColor(new Color(Integer.parseInt(cMejor[0]), Integer.parseInt(cMejor[1]), Integer.parseInt(cMejor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t4)) + "% Mejora", 30, 445); // Escribe el nombre - drawString(String str, int x, int y)
        t5 = (100 / (float) partes) * p5;
        g.setColor(new Color(Integer.parseInt(cNoValorable[0]), Integer.parseInt(cNoValorable[1]), Integer.parseInt(cNoValorable[2])));
        g.drawString(Float.toString(Dibujo.precision(2, t5)) + "% No valorable", 30, 460); // Escribe el nombre - drawString(String str, int x, int y)

        if ((partes < 15) & (partes > 12)) {
            red = 180 / partes + 1;
        } // Ajuste para que los decimales resultantes de 180/partes, no desvirtúen la imagen.
        for (int x = 0; x < (dato.length / 4); x++) {
            // Seleccionamos el color del pincel - setColor(Color c) / setColor(int R, int G, int B)
            g.setColor(new Color(Integer.parseInt(dato[x * 4 + 1].toString()), Integer.parseInt(dato[x * 4 + 2].toString()), Integer.parseInt(dato[x * 4 + 3].toString())));
            if ((w + red) > 270) {
                red = 270 - w;
            } // Ajuste para que los decimales resultantes de 180/partes, no desvirtúen la imagen.
            g.fillArc(140, 70, 350, 350, w, red); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawArc(140, 70, 350, 350, w, red); // Dibuja el arco - drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawString(dato[x * 4].toString(), 20, z); // Escribe el nombre - drawString(String str, int x, int y)
            g.setColor(Color.gray);
            g.fillArc(140, 70, 350, 350, w, 1); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            w = w + (red);
            z = z + 15;
            y = x;
        }

        // Pintamos en el último sector, lo que falte para llegar a 180
        if (w < 270) {
            g.setColor(new Color(Integer.parseInt(dato[y * 4 + 1].toString()), Integer.parseInt(dato[y * 4 + 2].toString()), Integer.parseInt(dato[y * 4 + 3].toString())));
            g.fillArc(140, 70, 350, 350, w, 270 - w); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawArc(140, 70, 350, 350, w, 270 - w); // Dibuja el arco - drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        }

        dato2 = Dibujo.orden(dato2);

        // El inicio 0 señala el Este del gráfico
        // g.clearRect(0, 0, 660, 520); // Borra el rectangulo antes de volver a repintar - clearRect(int x, int y, int width, int height)
        // Calculamos cuantas partes hemos de dividir el semicirculo, segun los datos que recibimos.
        int partes2 = dato2.length / 4;
        w = 270;
        z = 145;
        y = 0;
        red = 180 / partes2;
        float pp1 = 0, pp2 = 0, pp3 = 0, pp4 = 0, pp5 = 0;
        float tt1 = 0, tt2 = 0, tt3 = 0, tt4 = 0, tt5 = 0;

        // Calculamos %s
        for (int x = 0; x < (dato2.length / 4); x++) {
            if ((cDistinto[0].equals(dato2[x * 4 + 1].toString())) & (cDistinto[1].equals(dato2[x * 4 + 2].toString())) & (cDistinto[2].equals(dato2[x * 4 + 3].toString()))) {
                pp1 = ++pp1;
            } else {
                if ((cPeor[0].equals(dato2[x * 4 + 1].toString())) & (cPeor[1].equals(dato2[x * 4 + 2].toString())) & (cPeor[2].equals(dato2[x * 4 + 3].toString()))) {
                    pp2 = ++pp2;
                } else {
                    if ((cIgual[0].equals(dato2[x * 4 + 1].toString())) & (cIgual[1].equals(dato2[x * 4 + 2].toString())) & (cIgual[2].equals(dato2[x * 4 + 3].toString()))) {
                        pp3 = ++pp3;
                    } else {
                        if ((cMejor[0].equals(dato2[x * 4 + 1].toString())) & (cMejor[1].equals(dato2[x * 4 + 2].toString())) & (cMejor[2].equals(dato2[x * 4 + 3].toString()))) {
                            pp4 = ++pp4;
                        } else {
                            if ((cNoValorable[0].equals(dato2[x * 4 + 1].toString())) & (cNoValorable[1].equals(dato2[x * 4 + 2].toString())) & (cNoValorable[2].equals(dato2[x * 4 + 3].toString()))) {
                                pp5 = ++pp5;
                            }
                        }
                    }
                }
            }
        }
        g.setColor(Color.black);
        g.drawString("EXPLORACION FISICA", 520, 385); // Escribe el nombre - drawString(String str, int x, int y)
        g.drawLine(520, 387, 640, 387);
        tt1 = (100 / (float) partes2) * pp1;
        g.setColor(new Color(Integer.parseInt(cDistinto[0]), Integer.parseInt(cDistinto[1]), Integer.parseInt(cDistinto[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt1)) + "% Distinto", 520, 400); // Escribe el nombre - drawString(String str, int x, int y)
        tt2 = (100 / (float) partes2) * pp2;
        g.setColor(new Color(Integer.parseInt(cPeor[0]), Integer.parseInt(cPeor[1]), Integer.parseInt(cPeor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt2)) + "% Empeora", 520, 415); // Escribe el nombre - drawString(String str, int x, int y)
        tt3 = (100 / (float) partes2) * pp3;
        g.setColor(new Color(Integer.parseInt(cIgual[0]), Integer.parseInt(cIgual[1]), Integer.parseInt(cPeor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt3)) + "% Igual", 520, 430); // Escribe el nombre - drawString(String str, int x, int y)
        tt4 = (100 / (float) partes2) * pp4;
        g.setColor(new Color(Integer.parseInt(cMejor[0]), Integer.parseInt(cMejor[1]), Integer.parseInt(cMejor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt4)) + "% Mejora", 520, 445); // Escribe el nombre - drawString(String str, int x, int y)
        tt5 = (100 / (float) partes2) * pp5;
        g.setColor(new Color(Integer.parseInt(cNoValorable[0]), Integer.parseInt(cNoValorable[1]), Integer.parseInt(cNoValorable[2])));
        g.drawString(Float.toString(Dibujo.precision(2, tt5)) + "% No valorable", 520, 460); // Escribe el nombre - drawString(String str, int x, int y)

        if ((partes2 < 15) & (partes2 > 12)) {
            red = 180 / partes2 + 1;
        } // Ajuste para que los decimales resultantes de 180/partes, no desvirtúen la imagen.
        for (int x = 0; x < (dato2.length / 4); x++) {
            if (w < 270) {
                w = w + 180;
            }
            // Seleccionamos el color del pincel - setColor(Color c) / setColor(int R, int G, int B)
            g.setColor(new Color(Integer.parseInt(dato2[x * 4 + 1].toString()), Integer.parseInt(dato2[x * 4 + 2].toString()), Integer.parseInt(dato2[x * 4 + 3].toString())));
            if ((w + red) > 450) {
                red = 450 - w;
            } // Ajuste para que los decimales resultantes de 180/partes, no desvirtúen la imagen.
            g.fillArc(140, 70, 350, 350, w, red); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawArc(140, 70, 350, 350, w, red); // Dibuja el arco - drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            // g.drawString(temp[x * 4].toString() + " " + partes + " " + " w=" + w + " Ang=" + red, 500, z); // Escribe el nombre - drawString(String str, int x, int y)
            g.setColor(Color.gray);
            g.fillArc(140, 70, 350, 350, w, 1); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            w = w + red;
            y = x;
        }

        // Pintamos en el último sector, lo que falte para llegar a 360 + 90
        if (w < 450) {
            g.setColor(new Color(Integer.parseInt(dato2[y * 4 + 1].toString()), Integer.parseInt(dato2[y * 4 + 2].toString()), Integer.parseInt(dato2[y * 4 + 3].toString())));
            g.fillArc(140, 70, 350, 350, w, 450 - w); // Pinta el sector - fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
            g.drawArc(140, 70, 350, 350, w, 450 - w); // Dibuja el arco - drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        }

        dato2 = Dibujo.ordena(dato2);

        for (int x = 0; x < (dato2.length / 4); x++) {
            g.setColor(new Color(Integer.parseInt(dato2[x * 4 + 1].toString()), Integer.parseInt(dato2[x * 4 + 2].toString()), Integer.parseInt(dato2[x * 4 + 3].toString())));
            g.drawString(dato2[x * 4].toString(), 510, z); // Escribe el nombre - drawString(String str, int x, int y)
            z = z + 15;
        }

        // Calculamos % TOTAL
        partes = partes + partes2;

        g.setColor(Color.black);
        g.drawString("TOTAL:", 295, 500); // Escribe el nombre - drawString(String str, int x, int y)
        g.drawLine(40, 505, 625, 505);
        g.drawLine(315, 20, 315, 470);
        // p1 = (100 / (float) partes) * (p1 + pp1);
        p1 = (t1 / 2) + (tt1 / 2);
        g.setColor(new Color(Integer.parseInt(cDistinto[0]), Integer.parseInt(cDistinto[1]), Integer.parseInt(cDistinto[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p1)) + "% Distinto", 40, 520); // Escribe el nombre - drawString(String str, int x, int y)
        // p2 = (100 / (float) partes) * (p2 + pp2);
        p2 = (t2 / 2) + (tt2 / 2);
        g.setColor(new Color(Integer.parseInt(cPeor[0]), Integer.parseInt(cPeor[1]), Integer.parseInt(cPeor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p2)) + "% Empeora", 160, 520); // Escribe el nombre - drawString(String str, int x, int y)
        // p3 = (100 / (float) partes) * (p3 + pp3);
        p3 = (t3 / 2) + (tt3 / 2);
        g.setColor(new Color(Integer.parseInt(cPeor[0]), Integer.parseInt(cPeor[1]), Integer.parseInt(cPeor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p3)) + "% Igual", 280, 520); // Escribe el nombre - drawString(String str, int x, int y)
        // p4 = (100 / (float) partes) * (p4 + pp4);
        p4 = (t4 / 2) + (tt4 / 2);
        g.setColor(new Color(Integer.parseInt(cMejor[0]), Integer.parseInt(cMejor[1]), Integer.parseInt(cMejor[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p4)) + "% Mejora", 400, 520); // Escribe el nombre - drawString(String str, int x, int y)
        // p5 = (100 / (float) partes) * (p5 + pp5);
        p5 = (t5 / 2) + (tt5 / 2);
        g.setColor(new Color(Integer.parseInt(cNoValorable[0]), Integer.parseInt(cNoValorable[1]), Integer.parseInt(cNoValorable[2])));
        g.drawString(Float.toString(Dibujo.precision(2, p5)) + "% No valorable", 520, 520); // Escribe el nombre - drawString(String str, int x, int y)

        g.setColor(new Color(0,0,0));
        g.drawString("Nota:", 30, 540); // Escribe el nombre - drawString(String str, int x, int y)
        g.drawString("Nota:", 31, 540); // Escribe el nombre - drawString(String str, int x, int y)
        
        String nnota = "";
        String nnnota = "";
        int x = 0;
        int a = 0;
        for (int i = 0; i < nota.length(); i++) {
            ++x;
            nnnota += nota.charAt(i);
            nnota += nota.charAt(i);
            if (nnnota.equals("\n")) {
                if (x > 1) {
                    g.drawString(nnota, 40, 553+(a*10)); // Escribe el nombre - drawString(String str, int x, int y)
                    nnnota = "";
                    nnota = "";
                    ++a;
                    x = 0;
                } else { nnnota = "";
                            nnota = "";
                                x = 0;}
            } else { 
                nnnota = "";
                if (x > 15) { 
                        g.drawString(nnota, 40, 553+(a*10)); // Escribe el nombre - drawString(String str, int x, int y)
                        x = 0;
                        nnnota = "";
                        nnota = "";
                        ++a;
                } else { nnnota = ""; }
            }
        }
        g.drawString(nnota, 40, 553+(a*10)); // Escribe el nombre - drawString(String str, int x, int y)
        
        // Guardamos el gráfico en un fichero
        File fichero = new File("imagenes/pac" + numero + "_" + Dibujo.removeCar(fecha) + ".jpg");
        String formato = "jpg";

        // Escribimos la imagen en el archivo.
        try {
            ImageIO.write(imagen, formato, fichero);
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
    }

    /**
     * Función que elimina acentos y caracteres especiales de una cadena de
     * texto.
     *
     * @param input
     * @return cadena de texto limpia de acentos y caracteres especiales.
     */
    public static String removeCar(String input) {
        // Cadena de caracteres original a sustituir.
        String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ/";
        // Cadena de caracteres ASCII que reemplazarán los originales.
        String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC-";
        String output = input;
        for (int i = 0; i < original.length(); i++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(i), ascii.charAt(i));
        }//for i
        return output;
    }//remove1
}
