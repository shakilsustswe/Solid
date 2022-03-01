
package solid_assignment;


public class Default extends Common_class implements Characteristic_interface{
    
    String s1="Scientific name : ",s2=" Class : ",s3=" Sound : ",finalString;
    
    public Default(String Name, String Class, String Sound) {
        
        super(Name, Class, Sound);
        
    }

   
    @Override
    public String Characteristic() {
        
        s1+=super.Name;
        s2+=super.Class;
        s3+=super.Sound;
        
        finalString=s1+s2+s3;
        return finalString;
    }

   public String SciName()
    {
        return s1;
    }
    public String ClaName()
    {
        return s2;
    }
    public String Sou()
    {
       return s3;
    }

    
}
