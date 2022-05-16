
import java.util.Random;


public class hajo {
    
 int max = 5;
 int min = 1; 

Random rnd = new Random();
int kozepont = rnd.nextInt(max - min) + min;
int eleje = kozepont-1;
int vege = kozepont+1;
int[] pozicio = {eleje,kozepont,vege} ;
    
}
