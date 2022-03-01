package solid_assignment;

public class Default2 extends Common_class2 implements Characteristic_interface {

    String s1 = "Scientific name : ", s2 = " Class : ", s3 = " Sound : ", finalString;
    String s4 = " Order : ";

    public Default2(String Name, String Class, String Sound, String order) {
        super(Name, Class, Sound, order);
    }

    @Override
    public String Characteristic() {
        s1 += super.Name;
        s2 += super.Class;
        s3 += super.Sound;
        s4 += super.order;
        finalString = s1 + s2 + s4 + s3;
        return finalString;
    }

    public String SciName() {
        return s1;
    }

    public String ClaName() {
        return s2;
    }

    public String Sou() {
        return s3;
    }
     public String Or() {
        return s4;
    }

}
