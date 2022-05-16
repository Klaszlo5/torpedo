package torpedo;

public class Torpedo {
    public static void main(String[] args) {
       int[][] palya = new int[1][7];
        int[][] hajok = new int[5][3];
    }
    public static void Palya1(int[][] palya){
        for(int index=0 ; index < 5 ; index++ )
            for(int sor=0 ; sor < 5 ; sor++ )
                palya[index][sor]=-1;
    }
    public static void PalyaKiir(int[][] palya){   
    for(int sorb=0 ; sorb < 5 ; sorb++ ){
        System.out.print((sorb+1)+"");
        for(int sora=0 ; sora < 5 ; sora++ ){
            if(palya[sorb][sora]==-1){
                System.out.print("\t"+"~");
            }else if(palya[sorb][sora]==0){
                System.out.print("\t"+"*");
            }
        }
    }
}
}
