import java.io.IOException;
import java.util.Scanner;

public class Reservation_Main {
   public static  customerData firstCustomer = new customerData("Gyunay", "Kadirov", 0);
   public static String chosenDestination = "";
    

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)){

            


            while(true){
                    clrscr();
                    System.out.println("==================================");
                    System.out.println("Welcome to Scandinavian airlines");
                    System.out.println("----------------------------------\n");


                System.out.println("Please enter your first name");
                String customerFirstName = input.nextLine();
                System.out.println("Please enter your last name");
                String customerLastName = input.nextLine();


                if(customerFirstName.equalsIgnoreCase(firstCustomer.getCustomerFirstName()) && customerLastName.equalsIgnoreCase(firstCustomer.getCustomerLastName())){
                    System.out.println("Welcome, " + firstCustomer.getCustomerFirstName());
                    showMenu1();
                    input.close();
                    break;
                }

            

                if(input.nextLine().toLowerCase().equals("q")){
                    System.out.println("Thank you for flying with us!");
                    System.exit(0);
                }
                


            }
        

        }


    }
    



    static void showMenu1 (){
        
         char option; 
         try (Scanner input = new Scanner(System.in)){

            do{

                    System.out.println(
                    "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n"+
                    "welcome: " + 
                    "Select an option from the menu\n"+
                    "A: See destination\n"+
                    "B: Check flight ticket\n"+
                    "C: Buy flight ticket\n"+
                    "D: Balance: $" + 
                    "\nE: Quit\n"+
                    "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

                    option = input.next().charAt(0);
                    

                    switch (Character.toLowerCase(option)) {
                        case 'a':
                            System.out.println("-------------------------------");
                            System.out.println("See destinations ");
                            System.out.println("-------------------------------");
                            
                            System.out.println( "Paris: $200 \n" +
                            "Amsterdam: $250 \n" + 
                            "Moscow: $500 \n"+
                            "Kopenhagen $340 \n" +
                            "Berlin $200 \n"+
                            "Enter [Q] to return");
                             char option4322 = input.next().charAt(0);
                                    switch (Character.toLowerCase(option4322)){
                                        case 'q':
                                        Reservation_Main.showMenu1();
                                        break;}
                           
                            break;
                        case 'b':
                            System.out.println("-------------------------------");
                            System.out.println("Check flight ticket " );
                            System.out.println("-------------------------------");
                            firstCustomer.getData();
                            String g1 ="";
                            System.out.println("Enter any key to go back to the main menu ");
                            String g2= input.next();
                            if(!g2.equalsIgnoreCase(g1)){
                                showMenu1 ();
                            }



                           
                            break;
                        case 'c':
                        System.out.println("-------------------------------");
                        System.out.println("Buy flight ticket " );
                        System.out.println("-------------------------------");
                        char option4;
                        System.out.println("Buying a ticket\n " + 
                         "A: Select destination \n" +
                         "B: Return to main menu \n" 
                         );
                         option4 = input.next().charAt(0);
                                    switch (Character.toLowerCase(option4)) {
                                             case 'a':
                                                System.out.println("-------------------------------");             
                                                System.out.println("-------------------------------");
                                                System.out.println("Select your destination: \n " +                  
                                                "A: Paris: $200 \n" +
                                                "B: Amsterdam: $250 \n" + 
                                                "C: Moscow: $500 \n"+
                                                "D: Kopenhagen $340 \n" +
                                                "E: Berlin $200\n" +
                                                "F: To go back");
                                                char option400 = input.next().charAt(0);
                                                         switch (Character.toLowerCase(option400)) {
                                                                case 'a':
                                                                    System.out.println("-------------------------------");
                                                                    System.out.println("Your have selected Paris: ");
                                                                    firstCustomer.adddestinations("Paris");
                                                                    System.out.println("-------------------------------");
                                                                    if(!firstCustomer.withdraw2(200)){
                                                                        System.out.println("Sorry sir your balance of "+ firstCustomer.getCustomerBalance() +
                                                                        "  is not enought" +" \n  Enter any ket to go back to the main menu");
                                                                        String t = input.next();
                                                                        if(!t.equalsIgnoreCase("")){
                                                                            showMenu1 ();
                                                                        }
                                                                        
                                                                    }
                                                                    firstCustomer.withdraw(200);
                                                                    
                                    
                                                                 break;
                                                             case 'b':
                                                                    System.out.println("-------------------------------");
                                                                    System.out.println("Your have selected Amsterdam: ");
                                                                    firstCustomer.adddestinations("Amsterdam");
                                                                    System.out.println("-------------------------------");
                                                                    if(!firstCustomer.withdraw2(250)){
                                                                        System.out.println("Sorry sir your balance of "+ firstCustomer.getCustomerBalance() +
                                                                        "  is not enought" +" \n  Enter any ket to go back to the main menu");
                                                                        String t2 = input.next();
                                                                        if(!t2.equalsIgnoreCase("")){
                                                                            showMenu1 ();
                                                                        }
                                                                        
                                                                    }
                                                                    
                                                                    firstCustomer.withdraw(250);

                                    
                                                                    break;
                                                            case 'c':
                                                                    System.out.println("-------------------------------");
                                                                    System.out.println("Your have selected Moscow: ");
                                                                    firstCustomer.adddestinations("Moscow");
                                                                 System.out.println("-------------------------------");
                                                                 if(!firstCustomer.withdraw2(500)){
                                                                    System.out.println("Sorry sir your balance of "+ firstCustomer.getCustomerBalance() +
                                                                    "  is not enought" +" \n  Enter any ket to go back to the main menu");
                                                                    String t3 = input.next();
                                                                    if(!t3.equalsIgnoreCase("")){
                                                                        showMenu1 ();
                                                                    }
                                                                    
                                                                }
                                                                 firstCustomer.withdraw(500);

                                                                    break;
                                    
                                                             case 'd':
                                                                    System.out.println("-------------------------------");
                                                                    System.out.println("Your have selected Kopenhagen: ");
                                                                    firstCustomer.adddestinations("Kopenhagen");
                                                                 System.out.println("-------------------------------");
                                                                 if(!firstCustomer.withdraw2(340)){
                                                                    System.out.println("Sorry sir your balance of "+ firstCustomer.getCustomerBalance() +
                                                                    "  is not enought" +" \n  Enter any ket to go back to the main menu");
                                                                    String t4 = input.next();
                                                                    if(!t4.equalsIgnoreCase("")){
                                                                        showMenu1 ();
                                                                    }
                                                                    
                                                                }
                                                                 firstCustomer.withdraw(340);

                                    
                                                                 break;
                                                             case 'e':
                                                                 System.out.println("-------------------------------");
                                                                    System.out.println("Your have selected Berlin: ");
                                                                    firstCustomer.adddestinations("Berlin");
                                                                    System.out.println("-------------------------------");
                                                                    if(!firstCustomer.withdraw2(200)){
                                                                        System.out.println("Sorry sir your balance of "+ firstCustomer.getCustomerBalance() +
                                                                        "  is not enought" +" \n  Enter any ket to go back to the main menu");
                                                                        String t4 = input.next();
                                                                        if(!t4.equalsIgnoreCase("")){
                                                                            showMenu1 ();
                                                                        }
                                                                        
                                                                    }
                                                                    firstCustomer.withdraw(200);
                                    
                                                                    break;
                                                             default:
                                                                    break;
                                    
                                                }

                                                System.out.println("-------------------------------");
                                                            
                                                System.out.println("-------------------------------");
                                                System.out.println("======================");
                                                System.out.println("Choose your plane\n" +
                                                        "A: Boing \n" +
                                                        "B: Airbus");
                                                System.out.println("======================");
                                                String chosenPlane = input.next();
                                                ActualAirplane plane1 =new ActualAirplane(chosenPlane);
                                                if(chosenPlane.equalsIgnoreCase("A")){
                                                    System.out.println("Thank you for choosing Boing");
                                                    firstCustomer.addPlane("Boing");
                                                } else if (chosenPlane.equalsIgnoreCase("B")){
                                                    System.out.println("Thank you for choosing Airbus");
                                                    firstCustomer.addPlane("Airbus");

                                                }
                                                System.out.println("This are the current seats that are avliable");

                                                plane1.ShowSeats();
                                                System.out.println("Please enter your row number");

                                                int row = input.nextShort();
                                                System.out.println("Please enter your column character");


                                                String col = input.next();

                                                
                                                    while(plane1.isSeatTaken(row, col)){
                                                        System.out.println("The seat is already taken please try again");
                                                        System.out.println("Please enter your row number");
                                                         int rown2 = input.nextInt();
                                                         System.out.println("Please enter your collumn letter");
                                                        String col2 = input.next();
                                                        col = col2;
                                                        row = rown2;
                                                }
                                                
                                                System.out.println("Your seat has been reserved");
                                                firstCustomer.increasers();
                                                firstCustomer.seatsreserved(row, col);
                                                plane1.reserveSeat(row, col);
                                                plane1.ShowSeats();
                                                System.out.println("Thank you very much for your purchase");
                                                System.out.println("Please press any key to continue");
                                                String option5673= input.next();
                                                if (!option5673.equalsIgnoreCase("")){
                                                    showMenu1();
                                                }

                                                break;
                                            case 'b':
                                            System.out.println("-------------------------------");
                                                    System.out.println("RETURN: ");
                                                    System.out.println("-------------------------------");
                                                    showMenu1();
                                            
                                            break;
                                                            
                                            default:
                                                 break;}

                        case 'd':
                                                    System.out.println("-------------------------------");
                                                    do{
                                                    char option1;
                                                    
                                                
                                                    Reservation_Main.clrscr();
                                                    System.out.println( "A: Check Balance \n" +
                                                                        "B: Deposit \n" + 
                                                                        "C: Withdraw\n"+
                                                                        "D: Return to main menu");
                                                    
                                                        option1 = input.next().charAt(0);
                                                

                                                    switch (Character.toLowerCase(option1)){

                                                        case'a':
                                                       String a1="";
                                                      
                                                        while(a1.equalsIgnoreCase("")){
                                                            try{
                                                            System.out.println("-------------------------------");
                                                            System.out.println("Your balance is: " + firstCustomer.getCustomerBalance());
                                                            System.out.println("-------------------------------");
                                                            System.out.println("Press any key to go back");
                                                                String h2 = input.next();
                                                                a1 = h2;
                                                        }catch(Exception e){
                                                            customerData.errorMessage("Wrong Input! Only integers please");
                                                            }
                                                        }
                                                                
                                                            break;
                                                        case'b':
                                                            System.out.println("-------------------------------");
                                                            System.out.println("Enter amount to deposit" );
                                                            System.out.println("-------------------------------");

                                                            String  u = "";
                                                            while(u.equalsIgnoreCase("")){
                                                                
                                                            try{
                                                                int amount = input.nextInt();
                                                                firstCustomer.deposit(amount);
                                                                System.out.println("You deposited: " + amount);
                                                                System.out.println("Press any key to go back");
                                                                String h = input.next();
                                                                u = h;
                                                            }catch(Exception e){
                                                                customerData.errorMessage("Wrong Input! Only integers please");
                                                                }
                                                            }

                                                            break;

                                                     case'c':

                                                            System.out.println("-------------------------------");
                                                            System.out.println("Enter amount to withdraw" );
                                                            System.out.println("-------------------------------");
                                                            
                                                            String k = "";

                                                            while(k.equalsIgnoreCase("")){

                                                                try{
                                                                    int amount = input.nextInt();
                                                                    firstCustomer.withdraw(amount);
                                                                    System.out.println(" You withdrawn: " + amount);
                                                                    System.out.println("Enter any key to go back!");
                                                                    String d = input.next();
                                                                    k = d;
                                                                }catch(Exception e){
                                                                    customerData.errorMessage("Wrong Input! Only integers please");
                                                                }
                                                            }
                                                            
                                                            break;
                                                            
                                                            case'd':
                                                            Reservation_Main.showMenu1();
                                                            break;
                                                        
                                                            default:
                                                            break;
                                                        
                                                        }
                                                    
                                                        }while(Character.toLowerCase(option) != 'e');

                                                        break;

                        case 'e':

                            clrscr();
                                System.out.println("Thank you for choosing Scandinavian Airlines");
                                System.exit(0);
                                break;
                        
                            default:
                                System.out.println("Invalid option. Please try again");
                                
                                break;
        
                    }
                


               
            } while(Character.toLowerCase(option) != 'e');
      
        }
        
        
    }








    



    
    public static void clrscr(){
		//Clears Screen in java
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
				System.out.print("\033\143");
		} catch (IOException | InterruptedException ex) {}
	}


}
