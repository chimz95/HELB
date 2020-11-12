public class Main{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add(1,"Mudimba");

        for(String na:names){
            System.out.println("[+] " + na);
        }
    }
}