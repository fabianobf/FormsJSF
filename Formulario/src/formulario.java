import javax.faces.bean.ManagedBean;

@ManagedBean (name = "formularioBean", eager = true)
public class formulario {
	private int idUsuario;
	private String usuarioNome;
	private String usuarioSenha;
	private String usuarioDescricao;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuarioNome() {
		return usuarioNome;
	}
	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}
	public String getUsuarioSenha() {
		return usuarioSenha;
	}
	public void setUsuarioSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}
	public String getUsuarioDescricao() {
		return usuarioDescricao;
	}
	public void setUsuarioDescricao(String usuarioDescricao) {
		this.usuarioDescricao = usuarioDescricao;
	}
}