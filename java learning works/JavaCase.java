package JavaCase;
import java.util.*;
public class JavaCase{
public static void main(String [] args){
int sel = 4;
switch (sel) {
case 1:
System.out.println("the first block");
break;
case 2: 
System.out.println("Second block");
break;
case 3:
System.out.println("the third block");
break;
case 4 :
System.out.println("fourth block");
	byte y;
	byte t;
	Scanner o = new Scanner(System.in);
	System.out.print("give a number ");
	int take = o.nextInt();
	System.out.println("the number you entered is " + take);
	if (take > 100) {
	System.out.println("the number you entered is above 100");
	}else {
	System.out.println("the number you entered is below 100");
	}

break;
default:
System.out.println("end of switch case");

}
}
}