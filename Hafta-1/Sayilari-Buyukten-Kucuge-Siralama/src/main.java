import java.util.Scanner;
public class main {
    public static void main(String[]args){

        int x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.print("x = " );
        x = input.nextInt();

        System.out.print("y = ");
        y = input.nextInt();

        System.out.print("z = ");
        z= input.nextInt();

        if(x < y && x < z ){
            if(y < z){
                System.out.println("x < y < z");
            }else{
                System.out.println("z < y < z");
            }
        }else if(y < x && y < z){
            if(x < z){
                System.out.println("y < x < z");
            }else{
                System.out.println("y < z < x");
            }
        }else{
            if(x < y){
                System.out.println("z < x < y");
            }else{
                System.out.println("z < y < x");
            }
        }

    }
}
