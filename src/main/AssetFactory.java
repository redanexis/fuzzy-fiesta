package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by redcriss
 */
public class AssetFactory {
    public Image constructImage(String path){
        try{
            return ImageIO.read(new File((getClass().getResource(path).toURI()))); //what
        } catch (IOException e){
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

}
