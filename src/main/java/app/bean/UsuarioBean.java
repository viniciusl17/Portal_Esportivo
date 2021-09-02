package app.bean;


public class UsuarioBean {

	
	private String nomeCompleto;
	private String apelido;
	private String email;
	private String senha;
	
	
	public UsuarioBean() {
		}


	public UsuarioBean(String nomeCompleto, String apelido, String email, String senha) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.apelido = apelido;
		this.email = email;
		this.senha = senha;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}	
	
}
