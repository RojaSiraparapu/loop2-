package loop;

public class Example7 {

	
		public void NotDivisibleByFour() {
			for(int i=1;i<=100;i++) {
				
				if(i%4!=0) {
					System.out.println(i+"");
				}
		}
		}
			public static void main(String[] args)
			{
				Example7 exam=new Example7();
				exam.NotDivisibleByFour();
			}
	

}
