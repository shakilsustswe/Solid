
package solid_assignment;

public class Main_class {

    
    public static void main(String[] args) {
        
        Default def =new Default("Panthera leo persica", "Mammals", "roar or growl");
        String s = def.Characteristic();
        System.out.println(s);
        Default2 default2 = new Default2("Panthera leo persica", "Mammals", "roar or growl", "	Carnivora");
        s = default2.Characteristic();
        System.out.println(s);
    }
    
}
