public class Hello{
	public static void main(String[] args){
		int i = 10;
		int y,z;
		
		y = Integer.parseInt(System.console().readLine());
		int i = 7;
		if( y > 10 ){
			z = i + ( i - y );
		}else{
			z =  i - y;
		}
		
		System.out.println(""+z)
	}
}