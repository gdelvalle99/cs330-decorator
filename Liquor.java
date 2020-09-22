public abstract class Liquor{
    String description = "An unknown mix";
    public String getDescription() { 
        return description;
    }
    public abstract int calories();
}