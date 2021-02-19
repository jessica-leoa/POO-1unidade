
package hospital.pesistencia;

import hospital.Paciente;

public class PersistenciaEmArquivoPaciente implements IPersistenciaPaciente{

    @Override
    public void cadastrarPaciente() throws PacienteJaCadastradoException {
        if(this.Paciente()){
            
        }
        
        throw new PacienteJaCadastradoException("Paciente já cadastrado."); 
    }

    @Override
    public void consultarPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean Paciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
