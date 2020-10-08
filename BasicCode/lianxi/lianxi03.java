public class lianxi03{
	public static void main(String[]args){
    byte a=10;
	a+=10;	//这里的赋值包含了强制类型转换
		System.out.println(a);
		int b=10;
		int s=++b + b++ + --b + b--;//11+11+11+11
		System.out.println(s);
	}
}
	
