import java.util.Scanner;
public class App{
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to your personal wardrobe app");
        Wardrobe myWardrobe = new Wardrobe();
        myWardrobe.listOfClothes.add(new ClothingItem("Shirt", "black", "Cotton", "Summer")); // #1
        myWardrobe.listOfClothes.add(new ClothingItem("Pants","BLK","Jeans","Summer"));

        System.out.println(myWardrobe.listOfClothes.get(0).getColor() + " " +
                           myWardrobe.listOfClothes.get(0).getMaterial() + " " +
                           myWardrobe.listOfClothes.get(0).getType());


    }
}