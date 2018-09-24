package model;

import java.math.BigInteger;

public class Karatsuba {
	
	public Karatsuba() {
		
	}
	
	public BigInteger karatsuba(BigInteger num1, BigInteger num2) {
		  int posiciones = Math.max(num1.bitLength(), num2.bitLength());
		  //Para n < 1000 es más eficiente la multiplicación normal.
		  if (posiciones <= 1000) {
		      return num1.multiply(num2);
		  }
		  posiciones = posiciones / 2;

		  BigInteger b = num1.shiftRight(posiciones);
		  BigInteger a = num1.subtract(b.shiftLeft(posiciones));
		  BigInteger d = num2.shiftRight(posiciones);
		  BigInteger c = num2.subtract(d.shiftLeft(posiciones));

		 
		  BigInteger z0 = karatsuba(a, c); //z0=a*c
		  BigInteger z1 = karatsuba(a.add(b), c.add(d)); //z1=(a+b)*(c+d)
		  BigInteger z2 = karatsuba(b, d); //z2=b*d

		  BigInteger result = z1.subtract(z2).subtract(z0); //z1-z2-z0

		  
		  return z2.shiftLeft(2 * posiciones).add(result.shiftLeft(posiciones)).add(z0);
		} 
	

}
