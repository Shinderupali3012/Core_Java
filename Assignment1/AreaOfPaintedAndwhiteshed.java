// p-11
import java.util.Scanner;
public class AreaOfPaintedAndwhiteshed{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float roomWidth,roomHeight,length,doorWidth,doorHeight,windowWidth,windowHeight;
		double doorArea,windowArea,totalWindowArea,wallArea;
		System.out.println("enter dimession of room");
		System.out.println("enter room length");
		length=sc.nextFloat();
		System.out.println("enter room width");	
		roomWidth=sc.nextFloat();
		System.out.println("enter room roomHeight");
		roomHeight=sc.nextFloat();

		System.out.println("enter dimession of door");
		System.out.println("enter door width");	
		doorWidth=sc.nextFloat();
		System.out.println("enter door roomHeight");
		doorHeight=sc.nextFloat();
		doorArea=doorHeight*doorWidth;
		System.out.println("enter dimession of window");
		System.out.println("enter window width");	
		windowWidth=sc.nextFloat();
		System.out.println("enter window roomHeight");
		windowHeight=sc.nextFloat();
		windowArea=doorHeight*doorWidth;
		totalWindowArea=windowArea*2;
		wallArea=2*roomHeight*(length+roomWidth);
		double paintArea=wallArea-(doorArea+totalWindowArea);
		double roofArea=length*roomWidth;
		System.out.println("Room Painted Area is" +paintArea);
		System.out.println("Room roof area is " +roofArea);

	}
}