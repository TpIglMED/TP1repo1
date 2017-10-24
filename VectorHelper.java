package APP2;

public class VectorHelper {

/**
 * this function sort elements of vector from the biggest to the smallest
 * @param v1 vector we want to sort
 * @return vector sorted 
 */
	public int [] trieVect ( int [] v1)
	   {  int[] v2 =new int [v1.length];
	      for(int i=0;i<v1.length;i++)
	      { for(int j=0;j<v1.length;j++)
	        { if(v1[i]>v2[j])
	           { int tmp =v1[i];
	             v1[i]=v2[j];
	             v2[j]=tmp;
	           }
	        }
	      } 
	    return v2;   
	   }
  
	/**
	 * this function return sum of two vectors
	 * @param v1 the first vector 
	 * @param v2 the second vector 
	 * @return sommeVect the vector containing the sum
	 * @throws VectException in case we have diffrent size
	 */
 public int[] sommerV(int []v1,int[]v2)throws VectException
 {  if(v1.length != v2.length )
      { throw new VectException();}
      else { 
    	  
    	  int[] c = new int[v1.length];
    	  for (int i = 0; i < v1.length; i++) {
    	      c[i] = v1[i] + v2[i];
    	  }
    	  return c ;}
      }


 /**
  * this function reverse numbers in a vector
  * @param v1 the vector we want to reverse 
  * @return v2 vector which s v1 after reverse
  */
public int [] inverse (int []v1)
 { 
	int [] v2= new int[v1.length];
	 for (int i=0;i<v1.length;i++)
	 { v2[((v1.length)-i-1)]=v1[i];};
	 return v2;
 }

/**
 * this function return the maximum and minimum in vector 
 * @param v1 the vector we want to find it's min and max
 * @return a vector contains in first case the min and in the second the max
 */
public int[] maxmin (int[]v1)
{  int [] extrem =new int[2];
  extrem[0]=v1[0];extrem[1]=v1[0];

   for(int i=1;i<v1.length;i++)
   {   if(v1[i]<extrem[0]){extrem[0]=v1[i];}
      if(v1[i]>extrem[1]){extrem[1]=v1[i]; }
   }
   return extrem ;
}

/**
 * this function multiplies the elements of given vector by 2
 * @param v1 the vector given on wich we want to apply the formula
 * @return vector after multiplying by2
 */
public int [] formule(int[]v1)
{ int[] result= new int [v1.length];
  for(int i=0;i<v1.length;i++)
  { result[i]=(2*(v1[i]));}
   
  return result ;
}
}
