

public class BurgerKing extends FastFood 

{ 

    public BurgerKing(String n, String t, int s, String m, boolean d){ 

         super(n, t, s, m, d); 

    } 

     

    public double getMealPrice(){ 

        double premiumMeat = .20; 

        return super.getMealPrice() + premiumMeat; 

    } 

}  