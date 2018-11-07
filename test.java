
class Main{
	static public void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		while(num >1){
			if( num% 3 == 0)
				num /=3;
			else if(num % 2 ==0)
				num /=2;
			else
				num /=1;
			++count;
		}
		System.out.println(count);
	}
}