import java.util.PriorityQueue;
import java.util.Queue;


public class customerData {

    public String customerFirstName;
    public String customerLastName;
     public int customerBalance;
     public int nseatsr;
     public Queue<String> seatsreserves = new PriorityQueue<>();
     public Queue<String> Destrination = new PriorityQueue<>();
     public Queue<String> planesQueue = new PriorityQueue<>();


    

    public customerData(){
        
    }

   



    public customerData(String customerFirstName, String customerLastName, int customerBalance) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerBalance = customerBalance;
    }


    public String getCustomerFirstName() {
        return customerFirstName;
    }


    public String getCustomerLastName() {
        return customerLastName;
    }


    public int getCustomerBalance() {
        return customerBalance;
    }


    /**
     * showMenu1
     * But a fly ticket (buyTicket)
     * choose a seat of my prefrence (chooseSeat)
     * deposit to balance
     * withraw
     * errorMessage x
     */



    
    
      static void errorMessage(String message) {
        System.out.println(message);
    }
    public void increasers(){
        nseatsr=nseatsr+1;
    }
    public void seatsreserved(int x, String z){
        String String2 =x + z;
        seatsreserves.add(String2);

    }
    public void adddestinations (String z){
        Destrination.add(z);
        
    }
    public void addPlane (String k){
        planesQueue.add(k);
    }
    public void withdraw(int amount){
        if(amount > 0 && customerBalance > 0 && customerBalance >= amount){
            customerBalance = customerBalance - amount;
        }else{
            if(amount < 0){
                customerData.errorMessage("Invalid amount! Please try again");
            }else{
                customerData.errorMessage("Insufficient Balance");
            }
        }

    }

    public Boolean withdraw2 (int Amount) {
        boolean h;
        if(Amount > 0 && customerBalance > 0 && customerBalance >= Amount){
            h=true;
        }else {

            h=false;
        }
       
        return h;
        
    }
    public void deposit(int amount){
        if(amount >0){
            customerBalance = customerBalance + amount;
        }else{
            customerData.errorMessage("Invalid Amount");;
        }
    }
    public void getData(){
        System.out.println(customerFirstName  + " " + customerLastName + " " + "with balance " + customerBalance + " " + "you have bought " + nseatsr +" tickets"+ " ");
        while(!seatsreserves.isEmpty()){
            System.out.println( "To " +  Destrination.poll() + " on seat " + seatsreserves.poll() + " in a " + planesQueue.poll());
        }


    }




    
}
