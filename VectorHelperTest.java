package Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import APP2.VectException;
import APP2.VectorHelper;

public class VectorHelperTest {// to change the commits

	@Test
	public void testTrieVect() {
		VectorHelper o = new VectorHelper();
		   int[]v1=new int []{4,0,5};
		   int []vresult=new int [] {5,4,0};
		      int []v3=o.trieVect(v1);
		  	assertArrayEquals(vresult,v3);
	}

	@Test
	public void testSommerV() {
		VectorHelper o = new VectorHelper();
		   int[]v1=new int []{1,0,3};
		   int []v2=new int [] {4,2,6};
		   int []vresult=new int [] {5,2,9};
		      
			
		  	try {
				assertArrayEquals(vresult,(o.sommerV(v1,v2)));
			} catch (VectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Test 
	// you want to ask about the test with just 3,5,9 §§§
	public void testInverse() {
		VectorHelper o = new VectorHelper();
		   int[]v1=new int []{1,3,5};
		   int []vresult=new int [] {5,3,1};
		   assertArrayEquals(vresult,(o.inverse(v1)));
	}

	@Test
	public void testMaxmin() {
		VectorHelper o = new VectorHelper();
		   int[]v1=new int []{5,0,3,7};
		   int []vresult=new int [] {0,7};
		   assertArrayEquals(vresult,(o.maxmin(v1)));
	}

	@Test
	public void testFormule() {
		VectorHelper o = new VectorHelper();
		   int[]v1=new int []{2,0,3,1};
		   int []vresult=new int [] {4,0,6,2};
		   assertArrayEquals(vresult,(o.formule(v1)));
	}

}
