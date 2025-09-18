import java.io.File;
import java.util.ArrayList;
public class Wardrobe {
    //Goal: get the clothing items from the user into the file. and read them from file as needed.
    //Create an arraylist to store the clothing items
    ArrayList<String> listOfClothes = new ArrayList<>();
    //create a file to handle data
    public Wardrobe(){
        try{
            File storage = new File("Wardrobe.txt");
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
