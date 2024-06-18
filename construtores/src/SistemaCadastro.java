public class SistemaCadastro {
    public static void main(String[] args) throws Exception {

        Pessoa marcos = new Pessoa("413152321832", "fehh");

        marcos.setEndereco("RUA DOS ALFINEROS");
        
        
        System.out.println(marcos.getNome() + " - " + marcos.getCpf() );
    }
}
