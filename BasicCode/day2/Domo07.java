public class Domo07{
	public static void main(String[]args){
		int a=185;
		int b=220;
		int c=206;
		System.out.println(++a>b&&c--<b);//1
		System.out.println(a);//a=186
		System.out.println(c);//c=206
		System.out.println(a++<b&&--c<b);//2
		System.out.println(a);//a=187
		System.out.println(c);//c=205
		System.out.println(++a>b||c--<b);//3
		System.out.println(a);//a=188
		System.out.println(c);//c=204
		System.out.println(++a<b||c--<b);//4
		System.out.println(a);//a=189
		System.out.println(c);//c=204
		/*在运算以上四个里面的a和c的值时，要考虑到其的值是否以及发生变化，
		&&表示且，只有都符合才算对，所以如果第一个不对的话，那么后面的式子就不用理了，例如1*/
	}
}