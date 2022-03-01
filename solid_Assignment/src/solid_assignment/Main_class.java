
package solid_assignment;

public class Main_class {

    
    public static void main(String[] args) {
        
        Default def =new Default("Panthera leo persica", "Mammals", "roar or growl");
        String s = def.Characteristic();
        System.out.println(s);
        System.out.println(def.ClaName());
        Move2 m2 = new Move2();
        String f=m2.Run();
        System.out.println(f);
       
        
        Default2 default2 = new Default2("Panthera leo persica", "Mammals", "roar or growl", "	Carnivora");
        s = default2.Characteristic();
        System.out.println(s);   
        f= m2.Run();
        System.out.println(f);
        
        
        default2 = new Default2("Corvus", "Birds", "caw", " Passeriformes");
        s = default2.Characteristic();
        System.out.println(s); 
        Move m = new Move();
        f= m.Fly();
        System.out.println(f);
        
        
        
    }
    
}
