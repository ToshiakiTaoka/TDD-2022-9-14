package tddbc;

public class Fizzbuzz {
	
	public String convert(int i) {
//		// TODO Auto-generated method stub
//		if (i == 1) { 
//			return "1" ;
//			
//		}
//		if (i == 2) {
//			return "2" ;
//		}else if(i == 3) {
//			return "Fizz" ;
//		}else if(i == 4) {
//			return "4" ;
//		}else if(i == 5) {
//			return "Buzz" ;
//		}else {
//			return "" ;
//		}
		// TODO Auto-generated method stub
		if (i % 15 == 0) { 
			return "FizzBuzz" ;
		}else if(i % 3 == 0) { 
			return "Fizz" ;
		}
		if (i % 5 == 0) {
			return "Buzz" ;
		}else {
			//return Integer.toString(i) ;
			return String.valueOf(i) ;
		}
			
	}

}
