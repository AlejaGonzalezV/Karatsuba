package model;

import java.math.BigInteger;

public class Karatsuba {
	
	private final  BigInteger TEN = BigInteger.valueOf((long)10);
	
	public Karatsuba() {
		
	}
	
	public  BigInteger karatsuba(BigInteger i, BigInteger j) { 
	    if (i.compareTo(TEN) == -1 || j.compareTo(TEN) == -1) { 
	     return i.multiply(j) ; 
	    } 
	    double n = Math.round(getCount(i)); 
	    if (n % 2 == 1) { 
	     n++; 
	    } 
	    BigInteger a =  (i.divide(BigInteger.valueOf((long) Math.pow(10, Math.round(n/2))))); 
	    BigInteger b =  (i.mod(BigInteger.valueOf((long) Math.pow(10, Math.round(n/2))))); 
	    BigInteger c =  (j.divide(BigInteger.valueOf((long) Math.pow(10, Math.round(n/2))))); 
	    BigInteger d =  (j.mod(BigInteger.valueOf((long) Math.pow(10, Math.round(n/2))))); 

	    BigInteger first = karatsuba(a, c); 
	    BigInteger second = karatsuba(b, d); 
	    BigInteger third = karatsuba(a.add(b), c.add(d)); 

	    return (( ((first.multiply( BigInteger.valueOf((long) Math.pow(10, n)))).add(((third.subtract( first ).subtract(second) ).multiply(BigInteger.valueOf((long) Math.pow(10, Math.round(n/2))))).add(second))))) ; 
	} 
	
	private int getCount(BigInteger i) { 
	    String totalN= i.toString(); 
	    return totalN.length(); 
	} 
	


}
