public class MirrorRightTrianglePattern
{  
public static void main(String[] args)  
{ 
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		
		MirrorRightTrianglePattern pd=new MirrorRightTrianglePattern();
		pd.print(row,col); 
		
}
void print(int r,int c){    
for (int row= 0; row<= r; row++)  
{    
for (int col=1; col<=c-row; col++)  
{  
System.out.print(" ");  
}  
for (int k=0;k<=row;k++)  
{  
System.out.print("*");  
}   
System.out.println("");  
}  
}   
}
