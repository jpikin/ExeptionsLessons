package Task3;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException(){
        System.out.println("File not found");
    }
}
