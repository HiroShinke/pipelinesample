package com.sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Jenkins!!" );
        System.out.println( "Hello Notifications!!" );
        System.out.println( "Hello Notifications2!!" );
        System.out.println( "Hello Notifications2!!" );
        System.out.println( "Hello World!" );
    }

    public int addValues(int x, int y){
	return x + y;
    }

    public String concatString(String x, String y){
	return x + y;
    }

    public int fibo(int n){

	if( n < 2 ){
	    return n;
	}
	else {
	    return fibo(n-1) + fibo(n-2);
	}
    }

}
