package br.unip.sistemaerd;

public class DadosCadastriasFactory {

    public static DadosCadastrais build(){
        return new DadosCadastrais(
                100,
                "Erika",
                "111.111.111-11",
                "Rua das Flores",
                444,
                "apto 101",
                "11.111-001",
                "Floresta",
                "Jardim",
                "SP",
                "Celular",
                "(11)99999-9999"
        );
    }
}
