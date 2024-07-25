import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;

public class ImageReader {
    public static void main(String[] args) {
        try{
        
            BufferedImage image=ImageIO.read(new File("dhoni.jpg"));
            if(image!=null) System.out.println("Image loaded successfully");
            else System.out.println("Image not loaded");
        }
        catch(IOException e){
            System.out.println("hehe"+e.getMessage());
        }
    }
}
