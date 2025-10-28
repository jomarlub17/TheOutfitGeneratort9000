import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class Wardrobe {
    //Goal: get the clothing items from the user into the file. and read them from file as needed.
    //Create an arraylist to store the clothing items
    ArrayList<ClothingItem> listOfClothes = new ArrayList<>();
    //create a file to handle data
    public Wardrobe(){
        try{
            File closet = new File("Closet.txt");
            boolean isCreated = closet.createNewFile();
        }catch(IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
