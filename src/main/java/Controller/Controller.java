package Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import View.*;
import View.Themes.Themes;

public class Controller {

    private final View view;
    private FileChooser fc;
    private final String theme = Themes.iJAtomDark();
    private File directory;
    
    public Controller(){
        //String url = "C:\\Users\\crist\\OneDrive\\Imágenes";
        //setDirectory(new File(url));
        fc = new FileChooser(this, theme);
        view = new View(this, theme);
        setDirName(directory.getAbsolutePath());
    }

    private List<File> imageFiles;
    private int imageIndex = 0;

    public void setDirectory(){        
        List<File> aux = new ArrayList<>();

        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (!file.isDirectory() && file.getName().matches(".+jpg|.+jpeg|.+png")) {
                System.out.println(file.getAbsoluteFile());
                aux.add(file);
            }
        }
        imageFiles = new ArrayList<>(aux);
    }
    
    public void setDirectory(File dir){
        directory = dir;
        setDirectory();
    }
    
    public void newDirectory(){
        fc = new FileChooser(this, theme);
    }
    
    private void setDirName(String directory){
        view.updateDirName(directory);
        view.updateImage(imageFiles.get(0).getAbsolutePath());
    }
    
    public void prevImage() {
        imageIndex--;
        if(imageIndex < 0){imageIndex = imageFiles.size()-1;}
        view.updateImage(imageFiles.get(imageIndex).getAbsolutePath());
        view.updateFileName(imageFiles.get(imageIndex).getName());
    }

    public void nextImage() {
        imageIndex++;
        if(imageIndex > imageFiles.size()-1){imageIndex = 0;}
        view.updateImage(imageFiles.get(imageIndex).getAbsolutePath());
        view.updateFileName(imageFiles.get(imageIndex).getName());
    }
}
