package services;

import model.Plane;

import java.nio.file.*;
import java.io.IOException;


public class FileService {

    public static String[] readFiles(String url) throws Exception {
        return Files.readAllLines(Path.of(url)).toArray(new String[0]);
    }

    public static Path newFile(String fileName) throws IOException {
        Path path = Paths.get(FilesIMPL.FILES_LOCATION_URL+"\\"+fileName+ ".txt");
        Files.createFile(path);
        return path;
    }

    public static void CreateFileObj(Plane p) throws Exception {
        String content = p.toString() + "\n"
                +"model : " + p.getModel() + "\n"
                + "country : " + p.getCountry() + "\n"
                + "year : " + p.getYear() + "\n"
                + "hours : " + p.getHours() + "\n"
                + "military : " + p.isMilitary() + "\n"
                + "weight : " + p.getWeight() + "\n"
                + "wingspan : " + p.getWingspan() + "\n"
                + "topSpeed : " + p.getTopSpeed() + "\n"
                + "seats : " + p.getSeats() + "\n"
                + "cost : " + p.getCost() + "\n";
        try {
            Path path = newFile(p.getModel());
            Files.write(path, content.getBytes());
            System.out.println("File created and content written successfully!");
        } catch (IOException e) {
            System.err.println("Failed to create file or write content: " + e.getMessage());
        }

    }


    public static void writeIN(String name,String content) throws Exception{
        Path filePath = Paths.get(FilesIMPL.FILES_LOCATION_URL, (name+".txt"));
        Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);
    }

}
