package flujoEntradaSalida;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GrupoUsuarios implements Serializable {
	private String nombreGrupo;
	private List<Usuario> listaGrupo;
	
	/**
	 * @param nombreGrupo
	 */
	public GrupoUsuarios(String nombreGrupo) {
		listaGrupo = new ArrayList<Usuario>();
		this.nombreGrupo = nombreGrupo;
	}
	
	public boolean addUsuario(Usuario u){
		return this.listaGrupo.add(u);
	}
	
	public boolean eliminarUsuario(Usuario u){
		return this.listaGrupo.remove(u);
	}

	@Override
	public String toString() {
		return "GrupoUsuarios [nombreGrupo=" + nombreGrupo + ", listaGrupo=" + listaGrupo + "]";
	}
	
}
