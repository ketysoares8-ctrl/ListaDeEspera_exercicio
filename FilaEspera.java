public class FilaEspera {

    private ListaEncadeada pacientes;

    public FilaEspera() {
        pacientes = new ListaEncadeada();
    }

    public void adicionarPaciente(String nome) {
        pacientes.adicionar(nome);
    }

    public void listarPacientes(){
       System.out.println("\n === Fila de ESpera");
       pacientes.listar();    
    }

    public void buscarPaciente(String nome){
        if (pacientes.buscar(nome)){
            System.out.println("Paciente encontrado");
        } else {
            System.out.println("Paciente não encontrado");
        }
    }

    public void removerPaciente(String nome){
       if(pacientes.buscar(nome)){
        pacientes.remover(nome);
        System.out.println(nome + "foi removido");
       }else{
        System.out.println("Paciente não localizado");
       }
    }

    }

