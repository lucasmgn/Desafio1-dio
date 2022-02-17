import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DesafioDio {
	
    public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine()); 
      
      int a = Integer.parseInt(st.nextToken());
      int n; 
      int divisor = 2;
      
      for(n = 1; n <= a; n++){
 	    
 	    if(n % divisor == 0)
 	    System.out.println(n);
 	  }
  	  }}
      
