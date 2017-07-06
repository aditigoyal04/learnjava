class NumberPattern1
{
public static void main(String args[])
{
	for(int i=5; i>=1 ;i--)
	{
		for(int j=1; j<i ;j++)
		{
		System.out.print(i);
		}
	System.out.println(i);
	}
}
}

/*

55555	 	i1,j1   i1,j2   i1,j3   i1,j4   i1,j5
4444 		i2,j1   i2,j2   i2,j3   i2,j4
333		i3,j1   i3,j2   i3,j3
22		i4,j1   i4,j2
1		i5,j1

*/