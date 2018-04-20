package br.com.wellingtoncosta.exporttofile.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author wellingtoncosta on 19/04/18.
 */
final class FileUtils {

    private FileUtils() { }

    public static Path createFile(String fileName) {
        try {
            return Files.createFile(getFilePath(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeToFile(File file, String text) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Path getFilePath(String fileName) {
        return Paths.get(System.getProperty("user.home"), fileName);
    }

}
