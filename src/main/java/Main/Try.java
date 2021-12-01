package Main;

import Controller.Controller;
import java.io.File;

public class Try {
    
    public static void main(String[] args) {
        String url = "C:\\Users\\crist\\OneDrive\\Imágenes";
        Controller c = new Controller();
        //doC(c, url);
    }

    private static void doC(Controller c, String url) {
            System.out.println("Pruebas de 'Controller...'");
            c.setDirectory(new File(url));
    }
    
}
