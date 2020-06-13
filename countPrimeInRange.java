import java.io.*; 
import  java.util.*; 
 
// Read only region start 
class countPrimesInRange
{ 
 
 public int UserMainCode (int input1,int input2){ 
  // Read only region end 
 int d=input1,i,c=0; 
  int cou=0; 
 while(d<=input2){ 
  for(i=2;i<d;i++){ 
   if(d%i==0){ 
    c++; 
    break;
   } 
    
  } 
   
  if(c==0){ 
   cou++; 
   System.out.println(d); 
  } 
  d++; 
  c=0; 
 } 
 return cou; 
  
 } 
} 
