package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class AssetFactory {
    public Image constructImage(String path){
        try{
            return ImageIO.read(new File((getClass().getResource(path).toURI()))); //what
        } catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }
        return null; //maybe not tht best way to handle this?
    }

}
