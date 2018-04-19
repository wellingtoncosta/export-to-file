package br.com.wellingtoncosta.exporttofile.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author wellingtoncosta on 19/04/18.
 */
public class MainJFrame extends JFrame {

    private ContactsTable contactsTable;

    public MainJFrame() {
        setTitle("Main");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,400);
        setLayout(null);
        setResizable(false);

        contactsTable = new ContactsTable();

        add(contactsTable);
        add(createAddContactButton());
        add(createExportButton());
    }

    private JButton createAddContactButton() {
        JButton button = new JButton("Add Contact");
        button.setBounds(10, 300, 120, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contactsTable.addEmtpyRow();
            }
        });
        return button;
    }

    private JButton createExportButton() {
        JButton button = new JButton("ExportAs As");
        button.setBounds(160, 300, 120, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = ExportAsDialog.show();
                if(selected.equals("CSV")) {
                    System.out.println("Export contacts as CSV file.");
                } else {
                    System.out.println("Export contacts as JSON file.");
                }
            }
        });
        return button;
    }

}
