package system_product_app;

/**
 *
 * @author Rafael De La Cruz
 */


import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

//    Aqui se aplica el patrón de diseño de tipo Singleton, donde se instancia una unica vez esta clase y se puede reutilizar en todo el proyecto.
    
    private static Database db;
    
    public static Database getInstance(){
        
        if(db == null){
        
            Database.db =  new Database();
        }
    
        return db;
    }
    
	Connection Conectar = null;
        
	public Connection Conexion() {
		
		try {
			
			
			
			Conectar = DriverManager.getConnection("jdbc:mysql://db4free.net/almacenitlafinal","estuditlafinal","itla123.");
			
			System.out.print("Base de Datos Conectada");
		}catch(Exception e) {
			
			System.out.print("Error conectado la base de datos");
		}
		return Conectar;
		
	}
	

}
