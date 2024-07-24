package service;

import model.Student;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesService {

    public static String[] read(String url) throws Exception {
        return Files.readAllLines(Path.of(url)).toArray(new String[0]);
    }

    public static void convert(String url, String content) throws Exception {
        Files.write(Path.of(url), content.getBytes());
    }

    public static void write(String url, String content) throws Exception {
        Files.write(Path.of(url), content.getBytes(), StandardOpenOption.APPEND);
    }

    public static void dell(String url1, String url2, Student[] data) throws Exception {
        String ss = "";
        for (Student s : data) {
            Files.delete(Path.of(url2 + s.getName() + ".txt"));
            ss += s.toString()+"\n";
        }
        convert(url1, ss);
    }

}
