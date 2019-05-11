interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return a -> { if(a%2==0) { return false;} return true;};

	}

	public PerformOperation isPrime() {
		return a -> { 
			if(a==2) return true;
			int count=0;
			for(int i=0; i<a/2; i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count==1) {return true;}
			return false;
		};
	}

	public PerformOperation isPalindrome() {
		return a -> { 
			int r,sum=0;
			int tmp=a;
			while (a>0) {
				r=a%10;
				sum=(sum*10)+r;
				a=a/10;
			}
			if(tmp==sum) {
				return true;
			}
			return false;
		};
	}
}