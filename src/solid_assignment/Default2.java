/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_assignment;

/**
 *
 * @author Asus
 */
public class Default2 extends Common_class2 implements Characteristic_interface{
    String s1="Scientific name : ",s2=" Class : ",s3=" Sound : ",finalString;
    String s4=" Order : ";

    public Default2(String Name, String Class, String Sound, String order) {
        super(Name, Class, Sound, order);
    }
    
    @Override
    public String Characteristic() {
        s1+=super.Name;
        s2+=super.Class;
        s3+=super.Sound;
        s4+=super.order;
        finalString=s1+s2+s3+s4;
        return finalString;
    }
}
