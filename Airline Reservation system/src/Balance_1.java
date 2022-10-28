// import java.util.Scanner;

// public class Balance_1 {

//     static void balanceCall(){


//         String option;
//         try (Scanner input = new Scanner(System.in)){
//             Reservation_Main.clrscr();
//             System.out.println( "A: Check Balance \n" +
//                                 "B: Deposit \n" + 
//                                 "C: Withdraw\n"+
//                                 "D: Return to main menu");
//             option = input.nextLine();

//             switch (option.toLowerCase()){
//                 case"a":
//                     System.out.println("-------------------------------");
//                     System.out.println("Your balance is: "  );
//                     System.out.println("-------------------------------");
                        
//                     break;
//                 case"b":
//                     System.out.println("-------------------------------");
//                     System.out.println("Enter amount to deposit" );
//                     System.out.println("-------------------------------");


//                     try{
//                         int amount = input.nextInt();
//                         deposit(amount);
//                     }catch(Exception e){
//                         customerData.errorMessage("Wrong Input! Only integers please");
//                         }

//                         break;

//                 case"c":
//                     System.out.println("-------------------------------");
//                     System.out.println("Enter amount to deposit" );
//                     System.out.println("-------------------------------");
                    
//                     try{
//                         int amount = input.nextInt();
//                         withdraw(amount);
//                     }catch(Exception e){
//                         customerData.errorMessage("Wrong Input! Only integers please");
//                     }
//                         break;

//                 case"d":
//                     Reservation_Main.showMenu1();
//                     break;
                
//                 default:
//                     break;
//             }



//         } 



//     }

//             static void deposit(int amount){
//                 if(amount >0){
//                     customerData.customerBalance = customerData.customerBalance + amount;
//                 }else{
//                     customerData.errorMessage("Invalid Amount");;
//                 }
//             }
    


//              static void withdraw(int amount){
//                 if(amount > 0 && customerData.customerBalance > 0 && customerData.customerBalance >= amount){
//                     customerData.customerBalance = customerData.customerBalance + amount;
//                 }else{
//                     if(amount < 0){
//                         customerData.errorMessage("Invalid amount! Please try again");
//                     }else{
//                         customerData.errorMessage("Insufficient Balance");
//                     }
//                 }

//             }
    
// }
