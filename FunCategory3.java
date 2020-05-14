class abc{
	public int fun() {
		int a=13;
		int c=a*a;
	    return c;
}
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc o=new abc();
		int r=o.fun();
		System.out.println(r);
	}

}
