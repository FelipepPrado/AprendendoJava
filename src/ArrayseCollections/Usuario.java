package ArrayseCollections;

public class Usuario {
    String nome;
    String email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario){
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);//Melhor forma do que usar ==
            boolean emailIgual = outro.email.equals(this.email);//Melhor forma do que usar ==

            return nomeIgual && emailIgual;
        } else{
            return false;
        }
    }
}
