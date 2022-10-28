public class ActualAirplane {
    public int x = 0;
    public int y = 0;
    public int[][] planeSeats;
    public String Name;
    

     ActualAirplane(String k) {
     

        if("a".equalsIgnoreCase(k)){
            x = 26;
            y = 6;
            this.planeSeats = new int[x][y];
            for (int row = 0; row < planeSeats.length; row++) {
                for (int col = 0; col < planeSeats[row].length; col++) {
                    planeSeats[row][col]= (int) (Math.random()*2);
                }
        }
        this.Name = "Boing";}
        
        if("b".equalsIgnoreCase(k)){
            x = 50;
            y = 8;
            this.planeSeats = new int[x][y];
            for (int row = 0; row < planeSeats.length; row++) {
                for (int col = 0; col < planeSeats[row].length; col++) {
                    planeSeats[row][col]= (int) (Math.random()*2);
                } }

            this.Name = "Airbus";

    }

}

public int Transform(String k){
    int z=0;
switch ((k).toLowerCase()){
    case "a":
    z=0;
    break;
    case "b":
    z=1;
    break;
    case "c":
    z=2;
    break;
    case "d":
    z=3;
    break;
    case "e":
    z=4;
    break;
    case "f":
    z=5;
    break;
    case "g":
    z=6;
    break;
    case "h":
    z=7;
    break;
    case "i":
    z=8;
    break;
    case "j":
    z=9;
    break;
    default:
        break;
}


    return z;



}

public Boolean isSeatTaken (int n, String a){


    if (planeSeats[n-1][Transform(a)]==1){
        return true;
    } else {
        return false;
    }

}
public void reserveSeat(int n, String B){

    planeSeats[n-1][Transform(B)]=1;

}


    public void ShowSeats(){
        char c='A';
        int x=1;

        int rown2=planeSeats[0].length;
        while(rown2 >0){
            System.out.print(c + " ");
            c=(char) (c+1);
            rown2=rown2-1;
           
        }
        System.out.println("\n");



        for (int row = 0; row < planeSeats.length; row++) {
            System.out.print(x + " ");
            for (int col = 0; col < planeSeats[row].length; col++) {
                if (col==0){


                }
                
                System.out.print(planeSeats[row][col] == 1 ? " X " : " O " );
               
            }
            x=x+1;
            System.out.print("\n");
        }
    }

}
