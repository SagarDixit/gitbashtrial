package check;

public class JunitTesting {
	
           public int square(int x) {
                   return x*x;
            }
           
         public int countU(String Name) {
                   int no = 0;
                   for(int a = 0; a<Name.length( ); a++) {
                	   if(Name.charAt(a)=='u' || Name.charAt(a)=='U') {
                		   no++;
                	   }
                 }
               return no;
          }
 }	           

