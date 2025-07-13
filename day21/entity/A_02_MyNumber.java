package day21.entity;

import day21.utils.A_02_IntOperations;

public class A_02_MyNumber implements A_02_IntOperations
{

	@Override
	public boolean isOdd(int num) {
		return num%2 != 0;
	}

	@Override
	public boolean isEven(int num) {
		return num%2 == 0;
	}

	@Override
	public boolean isPrime(int num) {
		if(num <=1 ) return false;
		if(num <=3) return true;
		if(num%2 ==0 || num%3 ==0) return false;
		
		for(int i=5 ; i*i <= num; i +=6) {
			if(num % i ==0 || num % (i+2) ==0)return false;
		}
		return true;
	}

	@Override
	public double isFactorial(int num) {
		if(num < 0) {
			throw new IllegalArgumentException("Factorial can't be calculated for negative number");
		}
		double result = 1;//120
		for(int i=2;i<=num ;i++)//2,3,4,5
		{
			result = result * i;//24*5=120
		}
		return result;
	}
	
	
}
