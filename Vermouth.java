public class Vermouth extends CocktailMixer {
    Liquor liquor;
    public Vermouth(Liquor liquor){
        this.liquor = liquor;
    }
    public String getDescription(){
        return liquor.getDescription() + ", Vermouth";
    }
    public int calories(){
        return 40 + liquor.calories();
    }
}