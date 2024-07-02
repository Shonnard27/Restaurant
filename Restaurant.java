Restaurant Class 

 

public abstract class Restaurant 

{ 

    private String name; 

    private String town; 

    private int studentRating; 

    private String motto; 

     

    public Restaurant (String n, String t, int s, String m){ 

        name = n; 

        town = t; 

        studentRating = s; 

        motto = m; 

    } 

     

    public String getName(){ 

        return name; 

    } 

     

    public double getMealPrice(){ 

        double stdEntree = 1.19; 

        double stdDrink = 2.00; 

        double stdSide = 2.00; 

        double cookFee = .29; 

        double serverFee = .19; 

        return stdEntree + stdDrink + stdSide + cookFee + serverFee; 

    } 

     

} 
