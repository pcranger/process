import java.util.ArrayList;

public class Kitten {
    public static void main(String[] args) {
        System.out.println(kittenMittens(3));
        System.out.println(kittenMittens2(3));
        String[] q3 = fireIce(1,6);
        for (String item: q3){
            System.out.println(item);
        }
        

    }
    public static int kittenMittens(int k){
        int m = 0;
        for (int i =1; i<= k; i++){
            if(i % 2 == 0){
                m += 3;
            }
            else{
                m +=4;
            }
        }
        return(m);
    }

    public static int kittenMittens2(int k){
        if(k == 1){
            return 4;
        }else{
            if(k %2 == 0){
                return 3 + kittenMittens2(k-1);
            } else
                return 4 + kittenMittens2(k-1) ;
            }
        }

        public static String[] fireIce(int start, int end){
            String[] result =  new String[end - start + 1];
            for(int i = start ; i< end; i++){
             if(i % 5 == 0 && i % 3 == 0){
                    result[i] = "Water";
                }
                else if(i % 3 == 0){
                    result[i] = "Fire";
               } else if(i % 5 == 0){
                   result[i] = "Ice";
               }else{
                   result[i] = String.valueOf(i);
               }
            }
            
            return result;

        }

        
    }

