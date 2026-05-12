import java.util.Random;

public class GamblingSimulation{
    public static Random random=new Random();
    public static void main(String[] args) {
        int totalStakeInAMonth=20*100;
        int monthlyEarnings=0;
        for(int i=0;i<20;i++){
            monthlyEarnings=monthlyEarnings+profitOrLossInADay();
        }
        if((monthlyEarnings-totalStakeInAMonth)<0){
            System.out.println("He lost : "+(totalStakeInAMonth-monthlyEarnings));
        }
        else{
            System.out.println("He Won : "+(monthlyEarnings-totalStakeInAMonth));
        }
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