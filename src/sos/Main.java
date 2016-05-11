/** 
 * Main 
 * Books - kniha, ktera ma pocet stran
 * IsBookBigger - metoda na vraceni poctu stan
 * 
 * Info: there is wrong - import sas,ses, ...it should be better way
 * 
 * It is done, but is is not very clever solution.
 */
package sos;

import java.util.logging.Logger;
import sas.*;
import ses.*;

public class Main {

	public Main() {

	}

	static Books BigBook = new Books(455);
	
	public final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		LOGGER.info("");

		System.out.println("Is this number of pages bigger than 0?");		

		System.out.println(IsBookBiggerThan.zero(BigBook));

		System.out.println("It is done, but is is not very clever solution.");
	}

}
