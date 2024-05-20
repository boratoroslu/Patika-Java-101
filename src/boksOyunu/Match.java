package boksOyunu;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
      Fighter firstAttacker(){
          Random random = new Random();
          return random.nextBoolean() ? f1 : f2;
      }

    public void run(){
        if (isChech()){
            //ilk vuracak olan
            Fighter firstAttacker = firstAttacker();
            Fighter secondAttacker = (firstAttacker == f1) ? f2 : f1;

            System.out.println(firstAttacker.name + " ilk saldıran.");
            System.out.println("--YENİ ROUND--");


            while (this.f1.health>0 && this.f2.health >0){
                 System.out.println("--YENİ ROUND--");
               this.f2.health = this.f1.hit(this.f2);

                 if (isWin()){
                     break;
                 }
                 this.f1.health = this.f2.hit(this.f1);
                 if (isWin()){
                     break;
                 }
                 System.out.println(this.f1.name +"Sağlık :" + this.f1.health);
                 System.out.println(this.f2.name +"Sağlık :" + this.f2.health);
             }
        }else{
            System.out.println("Sporcuların sikleti denk değil!!");
        }
    }
    boolean isChech(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(f2.name+"Kazandı!");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+"Kazandı!");
            return true;
        }
        return false;
    }
}

