package loop;

public class Example6 {

	public  void reverseMultiply(int num) {
		for(int i=10;i>=12;i--) {
			int result=num*i;
			System.out.println(num+"*"+i+"="+result);
		}
		}
public static void maion(String[] args) {
	Example6 reverseMult=new Example6();
			reverseMult.reverseMultiply(6);
	}

}
