public class ClothingItem {
    private String type;
    private String color;
    private String material;
    private String season;
    private boolean isClean;

    public ClothingItem(String type, String color, String material, String season) {
        this.type = type;
        this.color = color;
        this.material = material;
        this.season = season;
        this.isClean = true;
    }

    public ClothingItem() {
        //default constructor
    }

    //setters
    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String coloor) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void setSeason(String season) {
        this.season = season;
    }

    //getters
    public String getType() {
        return this.type;
    }
    public String getColor() {
        return this.color;
    }
    public String getMaterial() {return this.material;}
    public String getSeason() {
        return this.season;
    }
}
 