package br.com.wellingtoncosta.exporttofile.data;

import java.io.File;
import java.nio.file.Path;
import java.util.UUID;

/**
 * @author wellingtoncosta on 19/04/18.
 */
public abstract class ContactFiler {

    abstract String parse(Contact[] contacts);

    abstract String getFileExtension();

    public boolean exportAll(Contact[] contacts) {
        String uuid = UUID.randomUUID().toString().substring(0, 5);
        String fileName = "contacts-" + uuid + getFileExtension();
        Path filePath = FileUtils.createFile(fileName);

        if(filePath != null) {
            String csv = parse(contacts);
            File file = filePath.toFile();
            FileUtils.writeToFile(file, csv);
            return true;
        }

        return false;
    }

}
