package br.com.wellingtoncosta.exporttofile.data;

/**
 * @author wellingtoncosta on 20/04/18.
 */
public class ContactCsvFiler extends ContactFiler {

    @Override
    public String parse(Contact[] contacts) {
        StringBuilder builder = new StringBuilder();
        builder.append("name,email,phone");
        builder.append("\n");

        for (Contact contact : contacts) {
            builder.append(contact.name);
            builder.append(",");
            builder.append(contact.email);
            builder.append(",");
            builder.append(contact.phone);
            builder.append("\n");
        }

        return builder.toString();
    }

    @Override
    String getFileExtension() {
        return ".csv";
    }
}
