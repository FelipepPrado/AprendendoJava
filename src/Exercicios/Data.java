package Exercicios;

public class Data {
    int dia;
    int mes;
    int ano;
    //static quer dizer que pertence a classe e não a instância!
    public Data(int dia, int mes, int ano){//Construtor, não tem retorno e nem tipo
        this.dia = dia;//ter o mesmo nome da problema! Mas usando o this da certo!
        this.mes = mes;//ter o mesmo nome da problema! Mas usando o this da certo!
        this.ano = ano;//ter o mesmo nome da problema! Mas usando o this da certo!
        //Valores Padrão:
        // byte, short, int, log -> 0
        // float, double = 0.0
        // boolean -> false
        // char -> '\u0000'
        //Objetos -> null
        //Não da pra usar variáveis não inicializadas nos contrutores
        //Mas dentro da instância da certo, elas são inicializadas por padrão
    }

    public Data(){
        this(1, 1, 1975); // Você chama o construtor dentro do construtor!
    }

    public String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    public void obterData() {//Quando você não coloca se é publico o private, ele coloca por si só private!!
        System.out.printf("Data de Aniversário: %d/%d/%d\n", dia, mes, ano);
    }
    public void altData(int dia, int mes, int ano){
        /*this serve para você referenciar o atributo da instãncia, ou seja,
         não da em metodo estático
         */
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }
}
