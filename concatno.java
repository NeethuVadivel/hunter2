class firstrepeat
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int i=0,j=0;
		String s="";
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			s+=a[i];
		}
		int n1=s.length();
		StringBuffer sb=new StringBuffer(s);
		while(n1>0){
			n1=n1-3;
			sb.insert(n1,",");
		}
		System.out.println(sb);
	}
}
