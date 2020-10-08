//一张纸0.1折叠多少次能够和珠峰一样高


public class Domo05{
	public static void main(String[]args){
		int count=0;
		int zf=8844430;
		double paper=0.1;
		while(paper<=zf){
			paper*=2;
			count++;	
		}
	System.out.println("一共要折叠："+count);
	}
}