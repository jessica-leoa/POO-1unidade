
package hospital;

import hospital.excecao.ExameNaoRealizadoException;
import hospital.excecao.PacienteNaoEncontradoException;

public interface ITiposDePaciente {
    
    public float calculoIMC() throws PacienteNaoEncontradoException;
    public boolean adicionarExame() throws ExameNaoRealizadoException;
    public boolean removerExame()throws ExameNaoRealizadoException;

    
    
}
