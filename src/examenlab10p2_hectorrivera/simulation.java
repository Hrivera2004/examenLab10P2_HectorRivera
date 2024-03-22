/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab10p2_hectorrivera;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author hriverav
 */
public class simulation extends Thread{
    private int tiempo=0;
    private JProgressBar p1;
    private JProgressBar p2;
    private JLabel timer;
    private int vel1, vel2;
    private boolean victory = false;
    private JDialog window;
    
    public simulation(JProgressBar p1, JProgressBar p2, JLabel timer,JDialog window) {
        this.p1 = p1;
        this.p2 = p2;
        this.timer = timer;
        this.window = window;
    }

    public int getVel1() {
        return vel1;
    }

    public void setVel1(int vel1) {
        this.vel1 = vel1;
    }

    public int getVel2() {
        return vel2;
    }

    public void setVel2(int vel2) {
        this.vel2 = vel2;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public JProgressBar getP1() {
        return p1;
    }

    public void setP1(JProgressBar p1) {
        this.p1 = p1;
    }

    public JProgressBar getP2() {
        return p2;
    }

    public void setP2(JProgressBar p2) {
        this.p2 = p2;
    }

    public JLabel getTimer() {
        return timer;
    }

    public void setTimer(JLabel timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        try {
            int min=0;
            String ganador ="";
            while (victory!=true) { 
                
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //progress
                p1.setValue(p1.getValue()+(vel1));
                p2.setValue(p2.getValue()+(vel2));
                //timer
                tiempo++;
                if (tiempo>=60) {
                    tiempo-=60;
                    min++;
                }
                timer.setText(min+":"+tiempo);
                
                if (p1.getValue()>=1000) {
                    victory = true;
                    ganador = "carro 1";
                }else if(p2.getValue()>=1000){
                    victory = true;
                    ganador = "carro 2";
                }
                
            }
            JOptionPane.showMessageDialog(null, "a ganado "+ ganador+" en "+min+":"+tiempo);
        } catch (Exception e) {
        }
        window.setVisible(false);
    }
    
    
}
