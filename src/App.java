import java.util.Scanner;
public class App{
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to your personal wardrobe app");
        ClothingItem item1 = new ClothingItem();
        item1.setType("Shirt");
        item1.setColor("Black");
        item1.setMaterial("Cotton");
        item1.setSeason("Winter");

        System.out.println(item1.getType());
        Wardrobe myWardrobe = new Wardrobe();
        myWardrobe.listOfClothes.add(item1);


    }
}