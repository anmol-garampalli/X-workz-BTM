class LeftTriangle
{
public static void main(String a[])
{
for(int row=1;row<=5;row++){
	
	for(int col=1;col<=5;col++){
	if(row==1)
System.out.print("*");		
else if(col==1)
System.out.print("*");
 else if(row+col==6)
System.out.print("*");		
		 
	else
	{
		System.out.print(" ");
		
	}		
		
		
		
	}
	System.out.println();
}

}
}
