public class RedRobin extends SitDown 

{ 

    public RedRobin(String n, String t, int s, String m){ 

        super(n, t, s, m); 

    } 

     

    public double getMealPrice(){ 

        double premiumMeat = .50; 

        double friesUpcharge = 1.00; 

        double goodLookingWaitStaff = 2.00; 

        return super.getMealPrice() + premiumMeat + friesUpcharge + goodLookingWaitStaff; 

    }  
