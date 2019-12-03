import java.util.*;
class dec2{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        Map <String,Integer> hm = new HashMap<>();
        System.out.println("Enter number of testcases");
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name");
			String name=s.nextLine();
			System.out.println("Enter number");
			int number=s.nextInt();
			s.nextLine();
            hm.put(name,number);
		}
		while(s.hasNext())
		{
			String str=s.nextLine();
            if(hm.containsKey(str))
            {
                int number = hm.get(str);
                System.out.println(str + "=" + number);
            }
            else
                System.out.println("Not found");
		}
        s.close();
	}
}
