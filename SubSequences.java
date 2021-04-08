/*This is a Recursive Algorithm for finding a subsequences of a string in Java*/

/*A String is a subsequence of a given String, that is generated by deleting some character of a given string without changing its order.


Eg:input: abc
   o/p:a, b, c, ab, bc, ac, abc
*/

public class SubSequences {
	
	private static String[] findSequences(String str) 
	{
		if(str.length()==0)
		{
			String ans[]= {""};
			return ans;
		}
		String smallAns[]=findSequences(str.substring(1));
		String ans[]=new String[2*smallAns.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++)
			ans[k++]=smallAns[i];
		
		for(int i=0;i<smallAns.length;i++)
			ans[k++]=str.charAt(0)+smallAns[i];
		
		return ans;
	}

	public static void main(String[] args) {
	
		String str="abc";
		String ans[]=findSequences(str);
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);

	}

	

}

