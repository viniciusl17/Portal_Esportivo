package app.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class EventoBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;
	private String descricao;
	private Date data;
	private String local;
	private String endereco;

	private List<EventoBean> Eventos = new ArrayList<>();

	public EventoBean() {
	}

	public EventoBean(Integer id, String nome, String descricao, Date data, String local, String endereco,
			List<EventoBean> eventos) {
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

	public List<EventoBean> getEventos() {
		return Eventos;
	}

	public void setEventos(List<EventoBean> eventos) {
		Eventos = eventos;
	}

	public Integer getId() {
		return id;
	}

}