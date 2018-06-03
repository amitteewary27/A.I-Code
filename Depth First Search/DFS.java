import java.util.*;
class stack
{
 char st[];
 int top,n;
 stack(int n1)
 {
  n=n1;
  st=new char[n];
  top=-1;
 }
 public void push(char inp)
 {
  if(top==n-1)
  {
  }
  else if(top==-1)
  {
   top=0;
   st[top]=inp;
  }else
   st[++top]=inp;
 }
 public void pop()
 {
char temp;
  if(top==-1)
  {
   temp=' ';
  }else if(top==0)
   {
    temp=st[top];
    st[top]='-';
    top=-1;
   }else
   {
    temp=st[top];
    st[top--]='-';
    }
	//return temp;
 }
public boolean isEmpty()
{
if(top==-1)
return true;
else
return false;
}
public char getT()
{
 return st[top];
}
public int getTop()
{
return top;
}
}

class DFS
{
 public static void main(String ar[])
  {
     int mat[][];
		int n,a,b,c,tflag=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of nodes:");
		n=sc.nextInt();
		mat=new int[n][n];
		System.out.println("Enter the graph(1if path is there):");
		String s;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(i!=j)
				{
				System.out.print((char)(i+97)+"->"+(char)(j+97)+":");
				
				mat[i][j]=sc.nextInt();
				}else
				{
				mat[i][j]=-1;
				}
			}
		}
		char ch;
		System.out.println("\n\n");
		for(int i=0;i<n;i++)
			System.out.print(" "+(char)(i+97));
		System.out.println("");
		for(int i=0;i<n;i++)
		{
			System.out.print((char)(i+97)+" ");
			for(int j=0;j<n;j++)
			{
				
					System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
 		stack st=new stack(n);
		int l;
		a=0;
		b=0;
		ch=(char)mat[a][b];
		ch+=(char)97;
		int count=0;
		st.push(ch);
		int arr[]=new int[n];
		int flag=0;
		System.out.print(ch+"* ");
		arr[count++]=a;
		do
		{
		
		a=(int)(st.getT()-97);
	//	System.out.println("\n__"+a+"__");
		for(b=a+1;b<n;b++)
		{
			flag=0;
			//System.out.println("##__a="+(char)(a+97)+" b="+(char)(b+97)+" mat="+mat[a][b]);
			if(mat[a][b]==1)
			{
			for(int i=0;i<count;i++)
		{
			//System.out.println("{arr[i]="+arr[i]+"=="+b+"==b}");
			if(b==arr[i])
			flag=1;
		}	
		//System.out.println("--Flag="+flag+"--");
		if(flag==0)
		{
		arr[count++]=b;
		ch=(char)b;
		ch+=(char)97;
		st.push(ch);

		System.out.print(st.getT()+"* ");
		
		break;
		}
			}	
		}
			if(b==n)
			st.pop();
			tflag=0;
			//System.out.println("--"+st.getT()+"--");
		//l=sc.nextInt();
		}while(st.getTop()!=-1);		
		
		
  }
}
