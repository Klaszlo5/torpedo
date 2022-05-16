
import java.util.Random;


public class hajo {
    
 int max = 5;
 int min = 1; 
    
int kozepont = rnd.nextInt(max - min) + min;
int[][] palya = new int[1][5];
int[][] hajok = new int[3][3];
int[] talalatok = new int[3];
int eleje = kozepont-1;
int vege = kozepont+1;
int[] pozicio = {eleje,kozepont,vege} ;

public static void hajo1(int[][] hajok){
    Random random = new Random();
    
    for(int ind=0 ; ind < 3 ; ind++){
        hajok[ind][0]=random.nextInt(5);
        hajok[ind][1]=random.nextInt(7);
      
        for(int szame=0 ; szame < ind ; szame++){
            if( (hajok[ind][0] == hajok[szame][0])&&(hajok[ind][1] == hajok[szame][1]) )
                do{
                    hajok[ind][0]=random.nextInt(5);
                    hajok[ind][1]=random.nextInt(5);
                }while( (hajok[ind][0] == hajok[szame][0])&&(hajok[ind][1] == hajok[szame][1]) );
        }
        
    }
}
}
