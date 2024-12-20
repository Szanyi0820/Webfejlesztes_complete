package cars;

import java.io.OutputStream;
import java.util.List;

public abstract class ICars {

	// public abstract ICars getInstance( ) throws Exception;
	public abstract void toHtmlStream( OutputStream out ) throws Exception;

	public abstract List<Car> getCars( );
}
