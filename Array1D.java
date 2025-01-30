import java.util.*;
public class Array1D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter"+size+"elements");
        for(int i=0;i<size;i++){
            System.out.println("Element"+(i+1)+":");
            array[i]=sc.nextInt();
        }
        System.out.println("The elements in the array are:");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        sc.close();
       }
    }
}
