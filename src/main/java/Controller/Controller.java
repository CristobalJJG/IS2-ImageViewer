package Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import View.View;
import View.Themes.Themes;

public class Controller {

    private final View view;
    private final String theme = Themes.iJAtomDark();
    
    public Controller(){
        String url = "C:\\Users\\crist\\OneDrive\\Imágenes";
        setDirectory(new File(url));
        view = new View(this, theme);
        setDirName(url);
    }

    private List<File> imageFiles;
    private int imageIndex = 0;

    public void setDirectory(File directory){        
        List<File> aux = new ArrayList<>();

        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (!file.isDirectory() && file.getName().matches(".+jpg|.+jpeg|.+png")) {
                System.out.println(file.getAbsoluteFile());
                aux.add(file);
            }
        }

        imageFiles = new ArrayList<>(aux);
        imageIndex = aux.size()-1;
    }
    
    private void setDirName(String directory){
        view.updateDirName(directory);
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
