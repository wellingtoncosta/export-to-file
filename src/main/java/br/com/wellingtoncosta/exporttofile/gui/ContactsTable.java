package br.com.wellingtoncosta.exporttofile.gui;

import br.com.wellingtoncosta.exporttofile.data.Contact;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author wellingtoncosta on 19/04/18.
 */
class ContactsTable extends JPanel {

    private DefaultTableModel tableModel;

    ContactsTable() {
        setBounds(0,0,600,200);

        JTable table = new JTable();
        String[] header = {"Name", "E-mail", "Phone"};

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(header);

        table.setModel(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(575, 160));

        add(new JScrollPane(table));
    }

    public void addEmtpyRow() {
        tableModel.addRow(new Object[]{"","",""});
    }

    public Contact[] getContacts() {
        Contact[] contacts = new Contact[tableModel.getRowCount()];
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            String name = (String) tableModel.getValueAt(i, 0);
            String email = (String) tableModel.getValueAt(i, 1);
            String phone = (String) tableModel.getValueAt(i, 2);
            Contact contact = new Contact(name, email, phone);
            contacts[i] = contact;
        }
        return contacts;
    }

}