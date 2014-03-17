import java.util.Scanner;

public class Assign {
	
	public static void main(String[] args) {
		System.out.println("Please enter your commands here.");
		System.out.println("Type 'help' for a list of commands and 'end' to finish.");
		
		GraphicsScreen graphics = new GraphicsScreen();
		
		int position1 =0;
		int position2 =0;
		int size =0;
		int line1 =0;
		int line2 =0;
		boolean help;
		 
		Scanner var6 = new Scanner(System.in);
        Scanner var1 = new Scanner(System.in);
		Scanner var2 = new Scanner(System.in);
        Scanner var3 = new Scanner(System.in);
        Scanner var4 = new Scanner(System.in);
        Scanner var5 = new Scanner(System.in);
        
        
        System.out.print("Need help ?(True[yes] ot False[no] ");
        help = var6.nextBoolean();
        
        if (help = true ) {
        	
            System.out.println("Position: Positioning the circle");
			System.out.println("Circle size");
			System.out.println("Line: positioning the line");
			System.out.println("End: Stop the programm");
         }
		
        else  {
        	System.out.println("Give your commands");
        }
        
        System.out.print("Enter the circle position x: ");
        position1 = var1.nextInt();
        
        System.out.print("Enter the circle position y: ");
        position2 = var2.nextInt();
        
        System.out.print("Enter the circle size: ");
        size = var3.nextInt();
        
        System.out.print("Enter the line1: ");
        line1 = var4.nextInt();
        
        System.out.print("Enter the line2: ");
        line2 = var5.nextInt();
        
        
        
        
  
        System.out.print("Circle position:");
        System.out.print(position1);
        System.out.println(position2);
        
        System.out.print("Circle size:");
        System.out.println(size);
        
        System.out.print("Line position:");
        System.out.print(line1);
        System.out.println(line2);
       
        
    
        
        graphics.moveTo(position1, position2);
        graphics.circle(size);
        graphics.lineTo(line1, line2);
        
	}
}
