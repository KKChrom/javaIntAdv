package sam;

public class Smallest {
public static void main(String[] args) {
	Boolean flag = true;
	int count = 2520;
	while(flag)
	{
		
		if(count % 1== 0 && count % 2==0 && count % 3==0  && count % 4 ==0  && count % 5 ==0  && count % 6 ==0  && count % 7==0   && count % 8==0  && count % 9==0  && count % 10==0  && count % 12==0  && count % 13==0  && count % 11==0  && count % 14==0  && count % 15==0  && count % 16==0  && count % 17==0  && count % 18==0  && count % 19==0  && count % 20==0 )
		{
			flag = false;
			System.out.println(count);
			break;
		}
		count++;
	}
}
}