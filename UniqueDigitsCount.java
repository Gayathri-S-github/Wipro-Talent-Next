import java.io.*;
import java.util.*;

class UniqueDigitsCount
{
public int UserMainCode(int input1) {

int h[]=new int[10];
    int rem;
	int count=0;
    while(input1>0)
    {
        rem=input1%10;
        h[rem]++;
        input1=input1/10;
    }
	for(int i=0;i<h.length;i++)
	{
		if(h[i]>0)
		count++;
	}
	return count;
	}
}

/* If the given number is 292, 
the function should return 2, because there are only 2 unique digits '2' and '9' */
