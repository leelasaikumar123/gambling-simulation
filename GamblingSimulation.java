import java.util.Random;

public class GamblingSimulation{
    public static Random random=new Random();
    public static void main(String[] args) {
        System.out.println(profitOrLossInADay());
    }
    public static int profitOrLossInADay(){
        int stake=100;
        int bet=1;
        int outcome=random.nextInt(2);
while(stake != 50 && stake != 150){
      if(outcome==0){
    stake--;
  }
  else{
    stake++;
  }
}
return stake;
    }
}