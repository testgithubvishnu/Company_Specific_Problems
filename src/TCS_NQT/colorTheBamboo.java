package TCS_NQT;

//String s each index is green or either red
// if it's green make red and if red make it green untill all becomes green
// find no. of minute  for this operation if each operation take 1 minute

//Ex.. N=7,K=3 , str=RGGRGRG
// K starts from where first R occurs
public class colorTheBamboo {
    public static void main(String[] args) {
     String str="RGGRGRG";
     int min=0,k=3;
     int i=0;
     int len=str.length();
     while(i<len && str.charAt(i)=='G'){
         i++;
     }
       int startWindow=i;
       int endWindow=i+k;

       if(i<len && str.charAt(i)=='R') min++;

           while(startWindow<len && startWindow<endWindow){
             //  str.charAt(startWindow) = str.charAt(startWindow)=='R'? 'G':'R';
               startWindow++;
           }

    }
}
