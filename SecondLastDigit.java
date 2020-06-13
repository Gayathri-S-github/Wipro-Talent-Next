import java.io.*;
import java.util.*;
import java.lang.Math;

class SecondLastDigit
{
public int UserCode(int input1)
{
	int rem;
	int output;
	int input=Math.abs(input1);
	if(input<10)
    		return -1;
   	else
  	 {
       	 rem=input%100;
	 output=rem/10;
 	 }
return output;
		
}
}
