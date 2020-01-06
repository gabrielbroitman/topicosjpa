package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_FUNCIONARIO")
	private int idFuncionario;

	private String email;

	@NotNull
	@Column(name = "NM_FUNCIONARIO")
	@Size(max = 50, min = 3)
	private String primeironome;

	private String sobrenome;

	public Funcionario() {
	}

	public int getIdFuncionario() {
		return this.idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.primeironome;
	}

	public void setFirstname(String firstname) {
		this.primeironome = firstname;
	}

	public String getLastname() {
		return this.sobrenome;
	}

	public void setLastname(String lastname) {
		this.sobrenome = lastname;
	}

	@Override
	public String toString() {
		return "Employee [idEmployee=" + idFuncionario + ", email=" + email + ", firstname=" + primeironome
				+ ", lastname=" + sobrenome + "]";
	}

}