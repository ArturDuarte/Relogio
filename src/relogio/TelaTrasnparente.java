/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relogio;

import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author guilherme
 */
public class TelaTrasnparente extends javax.swing.JPanel {

    private Robot robot;
    private BufferedImage fundo;

    public TelaTrasnparente(JDialog pai) {
        initComponents();

        try {
            robot = new Robot();

            setBounds(0, 0, pai.getWidth(), pai.getHeight());//faz o painel ficar do tamanho do Frame  

            //tira um print screen da tela, de acordo com as coordenadas do retângulo que foi passado como parâmetro  
            fundo = robot.createScreenCapture(new Rectangle(pai.getX(), pai.getY(), pai.getWidth(), pai.getHeight()));

        } catch (AWTException ex) {
        }

    }

    public TelaTrasnparente(JFrame pai) {
        initComponents();

        try {
            robot = new Robot();

            setBounds(0, 0, pai.getWidth(), pai.getHeight());//faz o painel ficar do tamanho do Frame  

            //tira um print screen da tela, de acordo com as coordenadas do retângulo que foi passado como parâmetro  
            fundo = robot.createScreenCapture(new Rectangle(pai.getX(), pai.getY(), pai.getWidth(), pai.getHeight()));

        } catch (AWTException ex) {
        }

    }

        TelaTrasnparente() {
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //sobrescreve o metodo paintComponent para poder tornar o printScreen o fundo do Painel  
        g.drawImage(fundo, 0, 0, null);
    }

    /**
     *
     * @author Art
     */
//public class TelaTrasnparente extends javax.swing.JPanel {
    /**
     * Creates new form TelaTrasnparente
     */
    //public TelaTrasnparente() {
    // initComponents();
    //}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
