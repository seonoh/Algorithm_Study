
import java.util.*;

public class Main {

	public static void main(String args[]) throws Exception	{
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Order> o = new ArrayList<>();
		
		sc.nextLine();
		
		for(int T=0; T<N; T++) {
			String msg = sc.nextLine();
			switch(msg.split(" ")[0]) {
			case "order":
				o.add(new Order(Integer.parseInt(msg.split(" ")[1]), Integer.parseInt(msg.split(" ")[2])));
				printOrder(o);
				break;
			case "sort":
				Collections.sort(o,new Comparator<Order>() {
					@Override
					public int compare(Order o1, Order o2) {
						// TODO Auto-generated method stub
						int firstValue = o1.getT();
						int secondValue = o2.getT();
						int firstN= o1.getN();
						int secondN= o2.getN();
						
						// Order by descending 
						if (firstValue > secondValue) {
							return 1;
						} else if (firstValue < secondValue) {
							return -1;
						} else {
							if (firstN > secondN) {
								return 1;
							} else if (firstN < secondN) {
								return -1;
							}else {
								return 0;
							}
							
						}
					}
				});
				printOrder(o);
				break;
			case "complete":
				int tn = Integer.parseInt(msg.split(" ")[1]);
				for(Order i : o) {
					if(i.getN()==tn) {
						o.remove(i);
						break;
					}
				}
				if(o.isEmpty()) {
					System.out.println("sleep");
				}else {
					printOrder(o);
				}
				
				break;
			default:
				break;	
			}
		}
			
		
	}
	
	public static void printOrder(ArrayList<Order> arr) {
		for(Order o : arr) {
			System.out.print(o.getN()+" ");
		}
		System.out.println("");
	}
	
}
class Order{
	int n;
	int t;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public Order(int n, int t) {
		super();
		this.n = n;
		this.t = t;
	}
	
}










