package practice;
import java.util.*;
class ArrayListOps {
public ArrayList<Integer> makeArrayListInt(int n)
{
ArrayList<Integer> list = new ArrayList<>();
for(int i =0 ; i<n;i++)
{
list.add(0);
}
 return list;
}
public ArrayList<Integer> reverseList(ArrayList<Integer> list)
{
Collections.reverse(list);
return list;
}
public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
{
ArrayList<Integer> list1 = new ArrayList<>();
for(Integer i : list)
{
if(i==m)
list1.add(n);
else
list1.add(i);
}
return list1;
}
 
}

public class prac1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 
				25, 33, 28, 10, 12));
				ArrayListOps alo= new ArrayListOps();
				ArrayList<Integer> list1 =alo.makeArrayListInt(4);
				ArrayList<Integer> list2 =alo.reverseList(list);
				ArrayList<Integer> list3 =alo.changeList(list2,28,20);
				System.out.println(list1);
				System.out.println(list2);
				System.out.println(list3);
				}
				}