public class Cherry extends CocktailMixer {
    Liquor liquor;
    public Cherry(Liquor liquor){
        this.liquor = liquor;
    }
    public String getDescription(){
        return liquor.getDescription() + ", Cherry";
    }
    public int calories(){
        return 40 + liquor.calories();
    }
}