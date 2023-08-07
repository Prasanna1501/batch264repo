package javaprograms;

public class SwappingNumbers 
{
  public static void main(String[] args) 
  {
	  int a = 10;
	    int b = 20;
	 b = b + a;
     a = b - a;
    b = b - a;
    System.out.printf("%d %d", a, b);
}

}
