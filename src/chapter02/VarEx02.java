package chapter02;

public class VarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 10;
        int y = 20;
        int tmp;

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
	}

}
