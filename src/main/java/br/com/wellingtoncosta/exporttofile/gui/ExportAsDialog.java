package br.com.wellingtoncosta.exporttofile.gui;

import javax.swing.*;

/**
 * @author wellingtoncosta on 19/04/18.
 */
final public class ExportAsDialog {

    private ExportAsDialog() { }

    public static String show() {
        String[] options = {"CSV","JSON"};
        return (String) JOptionPane.showInputDialog(
                null,
                "Choose an option",
                "Export Contacts As",
                JOptionPane.PLAIN_MESSAGE ,
                null,
                options,
                ""
        );
    }

}
