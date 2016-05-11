package ses;

import sos.*;
import sas.*;

public class IsBookBiggerThan {

	public IsBookBiggerThan() {
		
	}

	public static boolean zero(Books books) {
		Main.LOGGER.info("");
		return (books.getNumberOfPage() > 0);
	}

}
