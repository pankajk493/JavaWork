package lists;
import java.util.ArrayList;
import java.util.List;
public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> fruits=new ArrayList();
      //List<String> vegetables=new ArrayList();
      fruits.add("Apple");
      fruits.add("orange");
      fruits.add("grapes");
     
      //fruits.set(1, "banana");
      
      //vegetables.add("Carrot");
      //vegetables.add("potato");
      //vegetables.add("tomato");
      //fruits.add(23);
      //fruits.addAll(vegetables);
      
     System.out.println(fruits);
		Pair<String,Integer> p1=new Pair("Pankaj",74);
		Pair<Boolean,String> p2=new Pair(true,"Kaushik");
        p1.description();
        p2.description();
	}

}
