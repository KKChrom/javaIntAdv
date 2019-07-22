package im;

public class Bigo {
public static void main(String[] args) {
	int n =100000;
	int l = 100;
	int v = 1;
	Bigo b = new Bigo();
	b.bigg(n);
	b.bigg(l);
	b.bigg(v);
}
public void bigg(int n)
{
	System.out.println("Log: "+(Math.log(n)));
	System.out.println("NLog: "+(Math.log(n) * n));
	System.out.println("Squared "+(n*n));
	}
}
