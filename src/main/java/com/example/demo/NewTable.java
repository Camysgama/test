package com.example.demo;

@Entity
@Table(name = "tabela_nova")
public class TabelaNova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private EntidadeAntiga entidadeAntiga;

    private String tipo;

    @OneToMany(mappedBy = "newtable")
    private List<EntidadeAntiga> entidadeantiga;

    // getters e setters
}


    // ...

    public String getTipoDado() {
        switch (id.intValue()) {
            case 1:
                return "string";
            case 2:
                return "inteiro";
            case 3:
                return "decimal";
            default:
                return null;
        }
    }
    //Observe que o método usa um switch-case para retornar o tipo de dado correspondente ao ID da tabela tabela_nova.


