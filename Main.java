public class Main 

{ 

    public static void main(){ 

        BurgerKing bkBrockton = new BurgerKing("Burger King", "Brockton", 5, "Have it your way", true); 

        TexasRoadhouse trBrockton = new TexasRoadhouse("TexasRoadhouse", "Brockton", 8, "Legendary Food, Legendary Service"); 

        RedRobin rrFoxboro = new RedRobin("Red Robin", "Foxboro", 9, "Yummmm"); 

        BurgerKing bkEaston = new BurgerKing("Burger King", "Easton", 7, "Have it your way", true); 

        McDonalds mcdBrockton1 = new McDonalds("McDonald's", "Brockton", 2, "I'm Lovin' it", true, false); 

         

        System.out.println(bkBrockton.getName()); 

        System.out.println("Your BK burger costs " + bkBrockton.getMealPrice()); 

        System.out.println("Your RR meal costs " + rrFoxboro.getMealPrice()); 

        System.out.println("Your McD burger costs " + mcdBrockton1.getMealPrice()); 

        System.out.println("Playland here?: " + mcdBrockton1.hasPlayland()); 

         

    } 

} 

 