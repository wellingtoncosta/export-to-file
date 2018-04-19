package br.com.wellingtoncosta.exporttofile;

import br.com.wellingtoncosta.exporttofile.gui.MainJFrame;

import javax.swing.*;

/**
 * @author wellingtoncosta on 19/04/18.
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainJFrame frame = new MainJFrame();
                frame.setVisible(true);
            }
        });
    }
}
