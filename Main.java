import java.util.*;
public class Main{
    public static void main(String[] args) {
        String [] names  = new String[20];
        
        ArrayList<String> names = new ArrayList<String>();
        names.add("Mudimba");
        names.add("Lang");
        names.add("Tech");
        // names.add(21);

        ArrayList<String> view = new ArrayList<String>();
        for(String na:names){
            System.out.println("[+] " + na);
        }
    }
}