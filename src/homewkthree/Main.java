package homewkthree;


import java.util.Scanner;


public class Main {



			public static void main(String[] args) {
				Scanner inputInfo = new Scanner(System.in);
				System.out.println("Hey, beautiful dog!");
				System.out.println("What's his name?");
				String input = inputInfo.nextLine();
				System.out.printf("Hi %s! Do you like frisbee? (y/n)\n", input); 
				String newFriend = inputInfo.nextLine(); {
			
					if(newFriend.equalsIgnoreCase("yes")) {
					System.out.printf("Awesome! Let's play frisbee!\n"); 				
				
				
			} else { 
				
			    System.out.printf("Darn, maybe some other time.\n"); 	
				inputInfo.close();
				System.exit(0);
				
				}
				
			}
			
			}
			
				
			}
				
			
			
			
	


