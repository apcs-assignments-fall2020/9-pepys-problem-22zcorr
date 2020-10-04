public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        double sixes = 0.0;
        for(int i =0; i<10000;i++){
            for(int j =0;j<6;j++){
                if((int)((Math.random()*6)+1)==6){ 
                sixes+=1;
                j=0;
                break;
                }

            }
        }
        double prct = sixes/100.0;
        return prct;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double sixes = 0.0;
        int tempSix = 0;
        for(int i =0; i<10000;i++){
            tempSix=0;
            for(int j =0;j<12;j++){

                if((int)((Math.random()*6)+1)==6){
                tempSix+=1;  
                }
            }
            if(tempSix>1){
                    sixes+=1;
                    }
        }
        double prct = sixes/100.0;
        return prct;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double sixes = 0.0;
        int temp6 = 0;
        
        for(int i =0; i<10000;i++){
            temp6=0;

            for(int j =0;j<18;j++){
                if((int)((Math.random()*6)+1)==6){
                temp6+=1;  
                }

            }
            if(temp6>2){
                    sixes+=1;
                    }


        }
        double prct = sixes/100.0;
        return prct;
    }


    public static void main(String[] args) {
        System.out.println("5 runs of each:");
        System.out.println(probabilityOneSix()+" "+probabilityOneSix()+" "+probabilityOneSix()+" "+probabilityOneSix()+" "+probabilityOneSix());
        System.out.println(probabilityTwoSixes()+" "+probabilityTwoSixes()+" "+probabilityTwoSixes()+" "+probabilityTwoSixes()+" "+probabilityTwoSixes());
        System.out.println(probabilityThreeSixes()+" "+probabilityThreeSixes()+" "+probabilityThreeSixes()+" "+probabilityThreeSixes()+" "+probabilityThreeSixes());
    }
}
