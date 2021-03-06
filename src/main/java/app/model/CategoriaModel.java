package app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class CategoriaModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id	
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	
	public CategoriaModel () {
		
	}

	public CategoriaModel(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
 
}
