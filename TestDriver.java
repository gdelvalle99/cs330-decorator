public class TestDriver {
    
public static void main(String args[]){
        Liquor liquor1 = new Bourbon();
        liquor1 = new Bitters(liquor1);
        liquor1 = new Bitters(liquor1);
        liquor1 = new Cherry(liquor1);
        liquor1 = new Lime(liquor1);

        Liquor liquor2 = new Vodka();
        liquor2 = new LimeJuice(liquor2);
        liquor2 = new Lime(liquor2);

        Liquor liquor3 = new Bourbon();
        liquor3 = new Vermouth(liquor3);
        liquor3 = new Vermouth(liquor3);
        liquor3 = new Cherry(liquor3);
        liquor3 = new Bitters(liquor3);

        Liquor liquor4 = new Gin();
        liquor4 = new LimeJuice(liquor4);
        liquor4 = new LimeJuice(liquor4);
        liquor4 = new Sugar(liquor4);
        liquor4 = new Sugar(liquor4);
        liquor4 = new Lime(liquor4);

        System.out.println("Old Fashioned: " + liquor1.getDescription() + " is " + liquor1.calories() + " calories.");
        System.out.println("Vodka Gimlet: " + liquor2.getDescription() + " is " + liquor2.calories() + " calories.");
        System.out.println("Manhattan: " + liquor3.getDescription() + " is " + liquor3.calories() + " calories.");
        System.out.println("Tom Collins: " + liquor4.getDescription() + " is " + liquor4.calories() + " calories.");
    }
}