package generics;

public class PairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, Integer> n=new Pair<Integer,Integer>(1, 2);
		Pair<String, String> n1=new Pair<String, String>("Hello","Soumy");
		Pair<Integer, String>n2=new Pair(1,"Tree");
		n.setFirst(11);
		System.out.println(n.getFirst());
		System.out.println(n.getSecond());
		System.out.println(n1.getFirst());
		System.out.println(n1.getSecond());
		System.out.println(n2.getSecond());

	}

}
