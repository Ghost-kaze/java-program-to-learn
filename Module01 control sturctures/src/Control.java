/*
    author: Sameer saini
    String matching!!
 */

public class Control {
    public static void main(String args[]){
        String var = "ball";
        if(var.equals("ball")){
            System.out.println("strings matched!!");
            System.out.println(var.equals("ball"));
        }
        if(var.startsWith("ba")){
            System.out.println("strings starting matched!!");
            System.out.println(var.startsWith("ba"));
        }
        if(var.contains("l")){
            System.out.println("strings contains!!");
            System.out.println(var.contains("l"));
        }
        if(!var.endsWith("x")){
            System.out.println("strings does not ends with x !!");
            System.out.println(var.endsWith("x"));
        }
    }
}
