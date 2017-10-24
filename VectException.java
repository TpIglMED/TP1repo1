package APP2;

/**
 * this exception when two vectors don't have the same size
 * @author ua
 *example of use :when we want to sum the elements of two vectors
 */
public class VectException  extends Exception {
	public VectException () {
		super("Vecteurs de tailles différentes");
	}

}
