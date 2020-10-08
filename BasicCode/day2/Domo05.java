public class Domo05{
	public static void main(String[]args){
		short a=20;
		a *=5;//a=a*5  a*=5等同于a=(short)（a*5）;这里a*5必须加括号，因为是从左往右进行计算的。
		System.out.println(a);
	}
}
		