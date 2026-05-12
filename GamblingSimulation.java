import java.util.Random;

public class GamblingSimulation{
    public static Random random=new Random();
    public static void main(String[] args) {
        profitOrLossInADay();
    }
    public static int profitOrLossInADay(){
        int stake=100;
        int bet=1;
        int outcome=random.nextInt(2);
  if(outcome==0){
    System.out.println("He Lost The Bet");
  }
  else{
    System.out.println("He won the bet");
  }
    }
}