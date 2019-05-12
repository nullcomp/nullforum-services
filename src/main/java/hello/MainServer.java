package hello;

import static spark.Spark.*;

import java.util.LinkedList;
import java.util.List;

public class MainServer {

	final static Model model = new Model();

    public static void main(String[] args) {

        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8080;
        }
        port(port);

        initializeModel();
		
		REST controller = new REST(model); 
		
		controller.userHandler();
    }
	
    public static void initializeModel(){
		// model.addUser(new User(0, "flromeiroc", "Fábio Lucas", "flromeiroc@gmail.com", "123456"));
	}
	
}
