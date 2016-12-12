package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Computer entity managed by Ebean
 */
@Entity 
public class Producto extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    public String precio;
    
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date fecha;
    
   public static Find<Long,Producto> find = new Find<Long,Producto>(){};
	public static List<Producto> listadoProducto() {
		// TODO Auto-generated method stub
		return find.all();
	}
    
}

