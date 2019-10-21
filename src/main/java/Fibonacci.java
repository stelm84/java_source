
public class Fibonacci {

	static int x = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Liczymy sume N pierwszych cyfr ciagu Fibonacciego
		// 0 1 1 2 3 5 8 13 21 34
		// suma = 88

		System.out.println(x);
		
		int sum = 1;
		int [] tab = new int [10];
		tab[0] = 0;
		tab[1] = 1;
		
		for(int i=2; i<10; i++)
		{
			tab[i]=tab[i-2]+tab[i-1];
			sum+=tab[i];
		}
		
		System.out.println("Suma pierwszych "+tab.length+" elementow ciagu Fibonnaciego wynosi: "+sum);
	}

}
