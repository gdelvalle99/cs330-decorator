public class Bitters extends CocktailMixer{
    Liquor liquor;

    public String getDescription(){
        return liquor.getDescription() + ", Bitters";
    }
    public Bitters(Liquor liquor){
        this.liquor = liquor;
    }

    public int calories(){
        return 20 + liquor.calories();
    }
}