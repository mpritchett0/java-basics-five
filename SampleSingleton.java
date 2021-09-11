import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SampleSingleton {

    private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
        SampleSingleton ref = instance;
        if(ref == null){
            synchronized(SampleSingleton.class){
                if(ref == null){
                    instance = new SampleSingleton();
                } else{
                    return ref;
                }
            }
        }
        return ref;
        

	}

}
