package model;

public class JavaBeans {
	private String idcon;
	private String nome;
	private String telemovel;
	private String email;
	
	
	public JavaBeans() {
		super();
		
		
		
	}
	public JavaBeans(String idcon, String nome, String telemovel, String email) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.telemovel = telemovel;
		this.email = email;
	}
	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelemovel() {
		return telemovel;
	}
	public void setTelemovel(String telemovel) {
		this.telemovel = telemovel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
