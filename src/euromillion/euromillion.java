package euromillion;

import java.util.Random;

public class euromillion {
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public static void main(String[] args) {
        int n = 0, a, b, c, d, e, f, g, ma, mb, mc, md, me, mf, mg;
        System.out.println("Starting...");
        while (true) {
        	n++;
        	
        	a = getRandomNumberInRange(1, 2);
        	b = getRandomNumberInRange(1, 50);
        	c = getRandomNumberInRange(1, 50);
        	d = getRandomNumberInRange(1, 50);
        	e = getRandomNumberInRange(1, 50);
        	f = getRandomNumberInRange(1, 12);
        	g = getRandomNumberInRange(1, 12);
        	
        	ma = getRandomNumberInRange(1, 2);
        	mb = getRandomNumberInRange(1, 50);
        	mc = getRandomNumberInRange(1, 50);
        	md = getRandomNumberInRange(1, 50);
        	me = getRandomNumberInRange(1, 50);
        	mf = getRandomNumberInRange(1, 12);
        	mg = getRandomNumberInRange(1, 12);
        	
        	if (a == ma) {
        		if (b == mb) {
        			if (c == mc) {
        				if (d == md) {
        					if (e == me) {
        						if (f == mf) {
        							if (g == mg) {
        								System.out.println(a + " " + b + " " + c + " " + d + " " + e + "  " + f + " " + g);
        								System.out.println(ma + " " + mb + " " + mc + " " + md + " " + me + "  " + mf + " " + mg);
        								System.out.println(n);
        								System.out.println("");
        								break;
        				        	}
        			        	}
        		        	}
        	        	}
                	}
            	}
        	}
        }
    }
}
