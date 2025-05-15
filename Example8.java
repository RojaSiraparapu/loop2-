package loop;

public class Example8 {

	
		public void cubeOfNumber(int base) {
			int res=1;
			for(int i=1;i<=base;i++) {
				res=i*i*i;
				
				System.out.println( "The cube of "+i+" is:"+res);
				}
		}
		

			public static void main(String[] args)
			{
				Example8 exam=new Example8();
				exam.cubeOfNumber(10);
			}
	



	}


