package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventos")
public class EventoModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	private String descricao;
	private Date data;
	private String local;
	private String endereco;
	
	private List<EventoModel> Eventos = new ArrayList<>();
	
	public EventoModel() {
			
	}

	public EventoModel(Integer id, String nome, String descricao, Date data, String local, String endereco,
			List<EventoModel> eventos) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.data = data;
		this.local = local;
		this.endereco = endereco;
		Eventos = eventos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<EventoModel> getEventos() {
		return Eventos;
	}

	public void setEventos(List<EventoModel> eventos) {
		Eventos = eventos;
	}

	public Integer getId() {
		return id;
	}	
	

}
