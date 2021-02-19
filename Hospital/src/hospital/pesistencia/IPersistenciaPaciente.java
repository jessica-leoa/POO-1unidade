
package hospital.pesistencia;

import hospital.excecao.PacienteNaoEncontradoException;
import hospital.pesistencia.PacienteJaCadastradoException;


public interface IPersistenciaPaciente {
    
    /**
     *
     * @throws PacienteJaCadastradoException
     */
    public void cadastrarPaciente() throws PacienteJaCadastradoException;
    public void consultarPaciente() throws PacienteNaoEncontradoException;
    public void removerPaciente() throws PacienteNaoEncontradoException;
    public void atualizarPaciente() throws PacienteNaoEncontradoException;
    
}
