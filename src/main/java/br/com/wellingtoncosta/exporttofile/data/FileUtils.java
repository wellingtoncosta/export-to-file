package br.com.wellingtoncosta.exporttofile.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author wellingtoncosta on 19/04/18.
 */
final class FileUtils {

    private FileUtils() { }

    public static boolean createFile(String fileName) {
        try {
            if(!fileExists(fileName)) {
                Files.createFile(getFilePath(fileName));
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean fileExists(String fileName) {
        return Files.exists(getFilePath(fileName));
    }

    private static Path getFilePath(String fileName) {
        return Paths.get(System.getProperty("user.home"), fileName);
    }

}
