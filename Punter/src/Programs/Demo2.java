package Programs;

public class Demo2
{
	public static void main(String[] args) 
	{
		String s="javamava";
		System.out.println(s.contains("mava"));
		System.out.println(s.substring(0,7));
		System.out.println(s.substring(0));
		System.out.println(s.substring(6,7));
		String r="laptop";
		System.out.println(r.startsWith("lap"));
		System.out.println(r.startsWith("ap"));
		System.out.println(r.endsWith("top"));
		String i="Mom";
		String n="mom";
		System.out.println(i.equals(n));
		System.out.println(i.equalsIgnoreCase(n));
		String h="javamava";
		System.out.println(h.concat("atthe"));
		String j="method";
		char[] arr=j.toCharArray();
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
			
		}
		String o=" java mava ";
		System.out.println(o.trim());
		String l="nanna manasalli ninge jaga illa";
		String[] arr1=l.split(" ");
		for(int y=0;y<arr1.length;y++)
		{
			System.out.println(arr1[y]+" ");
			
		}
		boolean b=true;
		String f=String.valueOf(b);
		System.out.println(f);
		
	}

}
