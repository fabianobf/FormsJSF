import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@RequestScoped
public class form {

	@NotNull(message = "Nome não pode ser vazio")
	String usuarioNome;
	@NotNull(message = "Senha deve ter 6 caracteres")
	@Size(min = 6, max = 6, message = "Senha deve ter 6 caracteres")
	String usuarioSenha;

	public String getNome() {
		return usuarioNome;
	}

	public void setuNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public String getSenha() {
		return usuarioSenha;
	}

	public void setuSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}

}
