package agenda.model;

import java.util.ArrayList;
import java.util.List;
/*
public class Contato {
	//por que Integer e n�o int ?
	private Integer id;
	private String nome;
	private String sobrenome;
	private List<Telefone> telefones = new ArrayList();
	//GERAR GETTERS/SETTERS, TOSTRING, EQUALS/HASHCODE
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void addTelefone(Telefone t){
		telefones.add(t);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", sobrenome="
				+ sobrenome + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
*/

public class Contato {
	// por que Integer e n�o int? Para ser ANUL�VEL.
	private Integer id;
	private String nome;
	private String sobrenome;
	private List<Telefone> telefones = new ArrayList();
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void addTelefone(Telefone t) {
		telefones.add(t);
	}

	// gerar getters/setters, toString, hashCode and equals
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
