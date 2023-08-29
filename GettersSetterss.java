
package getters.setterss;

import java.util.Scanner;

public class GettersSetterss {

    
    public static void main(String[] args) {
       Bike bk = new Bike();
        System.out.print("Enter Bike color:");
        Scanner sc = new Scanner(System.in);
        String bgt = sc.next();
        bk.setColo(bgt);
        
        System.out.println("The Bike is "+bk.getColo()+" in color.");
    }
    
}
