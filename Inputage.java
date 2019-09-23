import java.util.Scanner;
//import java.util.*;
public class Inputage{
	public static void main((String[] args){
		final String youngsister="YOUNGER";
		final String oldersister="OLDER";
		final String sister="SECRET";
		Scanner scan=new Scanner(System.in);
		System.out.prinln("Please input the age of your sister:");
		int age=scan.nextIn();
		String nickname=sister;
		if(age<15){
			nickname=youngsister;
		}
		if(age>=15){
			nickname=oldersister;
		}
		switch(nickname){
			case youngsister:
			     System.out.println("you are young");
				 break;
			case oldersister:
			     System.out.println("you are old");
				 break;
			case sister:
			     System.out.println("it is a sercret");
				 break;
			default:
			     System.out.println("please try again");
		}
	}
}