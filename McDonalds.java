public class McDonalds extends FastFood 

{ 

    private boolean playLand; 

 

    public McDonalds(String n, String t, int s, String m, boolean p, boolean d){ 

        super(n, t, s, m, d); 

        playLand = p; 

    } 

 

    public boolean hasPlayland(){ 

        if (playLand==true){ 

            return true; 

        } 

        else{ 

            return false;    

        } 

 

    } 

} 