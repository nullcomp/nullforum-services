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
		controller.postHandler();
    }
	
    public static void initializeModel(){
        User usuariobeta = new User(1,"flromeiroc1","Fabio Lucas", "flromeiroc@gmail.com","123456");
        model.addUser(usuariobeta);
	}
	
}
