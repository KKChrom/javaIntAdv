package sam;

public class Tripley {
public static void main(String[] args) {
	int a = 1;
	int b = 1;
	int c = 1;
	double as = Math.pow(a,2);
	double bs = Math.pow(b,2);
	double cs = Math.pow(c,2);
	for(a = 0;a<1000;a++)
	{
		as = Math.pow(a, 2);

		for(b = 0;b<1000;b++)
		{
			bs = Math.pow(b, 2);
			for(c = 0;c<1000;c++)
			{
				cs = Math.pow(c, 2);
				if(a+b+c == 1000 && as+bs == cs)
				{
					System.out.println("A is "+a+", B is "+b+", C is "+c);
					System.out.println(a*b*c);
					
				}		
			}
			
		}
		
		
	}
}
}
