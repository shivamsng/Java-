package array;
	import java.util.ArrayList;
	import java.util.List;

	public class ArrayInsert {
		public static void main(String args[]) {
			List<String> list=new ArrayList<String>();
			list.add("Shivam");
			list.add("Pankaj");
			list.add("Yash");
			System.out.println("list of students "+list);
			list.add(0, "Yatharth");
			System.out.println("updated lists "+list);
		}

	}
