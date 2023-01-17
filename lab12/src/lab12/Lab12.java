package lab12;
import java.util.Scanner;
/**
 *
 * @author HP 430 G5
 */
public class Lab12#1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
int a[] = new int[10], i, num;
for (i=0;i<10;i++) {
a[1] = 1+(int) + (Math. random()*100);
}
System.out.println("ENTER INDEX TO SEARCH: ");
Scanner m = new Scanner (System. in);
num = m.nextInt();
try{
System. out.println("VALUE FOUND IN: " + a[num]);
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("INDEX OUT OF BOUND!");  
} 
    }
}

    

