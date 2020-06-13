import java.io.*;
import java.util.*;

class NthPrime
{
public int UserMainCode(int input1)
{
    int count=0;
		int num=1;
		int i;
		while(count<input1)
		{
			num=num+1;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				break;
			}
			if(i==num)
			count++;
		}
		return num;
	}
}
