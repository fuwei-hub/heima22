/*输出所有的水仙花数
1.输出100-999的数字
2.将每个数字的个位、十位、百位列出来
3.按照水仙花数的规则，列定布尔类型的量
4.输出打印
*/

public class Domo03{
	public static void main(String[]args){
		int count=0;
		for(int i=100;i<=999;i++){
			//i
		int ge=i%10;
		int shi=i/10%10;
		int bai=i/100%10;
		if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i ){
			System.out.print(i+"  ");
			count++;
			if(count%2==0){System.out.println();}
		}		
		}
		
		
		
		
			
	}
}