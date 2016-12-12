package controllers;

import java.util.List;

import models.Producto;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
       public Result index() {
    	   List<Producto> productos=Producto.listadoProducto();
        return ok(index.render(Producto.listadoProducto()));
    }
}
