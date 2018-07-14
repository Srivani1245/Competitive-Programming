import java.util.*;
class Solution
{
	public static void PairsOfParenthesis(int n) 
	{
		ArrayList<String> resultant = new ArrayList<String>();
		ArrayList<Integer> difference = new ArrayList<Integer>();
	 
		resultant.add("");
		difference.add(0);
	 
		for (int i=0;i<2*n;i++) 
		{
			ArrayList<String> tem1 = new ArrayList<String>();
			ArrayList<Integer> tem2 = new ArrayList<Integer>();
	 
			for (int j=0;j<resultant.size();j++)
			 {
				String str = resultant.get(j);
				int k = difference.get(j);
	 
				if (i<2*n-1){
					tem1.add(str + "(");
					tem2.add(k + 1);
				}
	 
				if (k>0 && i<2*n-1 || k==1 && i==2*n-1){
					tem1.add(str + ")");
					tem2.add(k - 1);
				}
			}
			resultant = new ArrayList<String>(tem1);
			difference = new ArrayList<Integer>(tem2);
		}
	 
		System.out.println(resultant+ " - "+ resultant.size());
	}
	public static void main(String[] args)
	{
		Scanner user_input = new Scanner(System.in);
		int a1 =2;
		int a2=3;
		int a3=5;
		int a4=4;
		int a5=1;
		int a6=6;
		PairsOfParenthesis(a1);
		PairsOfParenthesis(a2);
		PairsOfParenthesis(a3);
		PairsOfParenthesis(a4);
		PairsOfParenthesis(a5);
		PairsOfParenthesis(a6);
	}
}
