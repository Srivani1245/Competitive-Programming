import java.util.*;
class UniqueMorse{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
				  ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String org[]={"gin", "zen", "gig","msg"};
			for (int j=0;j<org.length ;j++)
			{
					System.out.println(org[j]+"==="+uniquemorse(array,org[j]));	
			}
		System.out.println("total transformations = "+obj.size());
		// String org1[]={"a", "z", "g","m"};
		// 	for (int j=0;j<org1.length ;j++) {
		// 			System.out.println(org1[j]+"--------------->"+uniquemorse(array,org1[j]));	
		// 	}
		// System.out.println("total transformations = "+obj.size());

		// String org2[]={"bhi", "vsv", "sgh","vbi"};
		// 	for (int j=0;j<org2.length ;j++) {
		// 			System.out.println(org2[j]+"--------------->"+uniquemorse(array,org2[j]));	
		// 	}
		// System.out.println("total transformations = "+obj.size());

		// String org3[]={"a", "b", "c","d"};
		// 	for (int j=0;j<org3.length ;j++) {
		// 			System.out.println(org3[j]+"--------------->"+uniquemorse(array,org3[j]));	
		// 	}
		// System.out.println("total transformations = "+obj.size());

		// String org4[]={"hig", "sip", "pot"};
		// 	for (int j=0;j<org4.length ;j++) {
		// 			System.out.println(org4[j]+"--------------->"+uniquemorse(array,org4[j]));	
		// 	}
		// System.out.println("total transformations = "+obj.size());

	}
	
	public static ArrayList<String> obj=new ArrayList<String>();

	public static String uniquemorse(String arr[],String k)
	{
		String str="";
		for (int i=0;i<k.length();i++)
		{
			int m=k.charAt(i)-97;
			str+=arr[m];
		}
		if(!obj.contains(str))
			obj.add(str);
		return str;
	}
}
