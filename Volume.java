import java.util.*;
public class Volume{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
double radius = sc.nextFloat();
double height = sc.nextFloat();
double Volume = 3.14*radius*radius*height;
System.out.println(Volume);
}
}