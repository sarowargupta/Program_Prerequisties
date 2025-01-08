import java.util.*;
public class SimpleInterest{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
float principal = sc.nextFloat();
float Rate = sc.nextFloat();
float time = sc.nextFloat();
float SI = (principal*Rate*time)/100 ;
System.out.println(SI);
}
}