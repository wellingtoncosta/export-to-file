package br.com.wellingtoncosta.exporttofile.data;

/**
 * @author wellingtoncosta on 20/04/18.
 */
public class ContactJsonFiler extends ContactFiler {

    @Override
    public String parse(Contact[] contacts) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for(int i = 0; i < contacts.length; i++) {
            builder.append("{");
            builder.append("\"name\":")
                    .append("\"")
                    .append(contacts[i].name)
                    .append("\"")
                    .append(",");
            builder.append("\"email\":")
                    .append("\"")
                    .append(contacts[i].email)
                    .append("\"")
                    .append(",");
            builder.append("\"phone\":")
                    .append("\"")
                    .append(contacts[i].phone)
                    .append("\"");
            builder.append("}");

            if((i+1) != contacts.length) builder.append(",");
        }

        builder.append("]");
        return builder.toString();
    }

    @Override
    String getFileExtension() {
        return ".json";
    }
}