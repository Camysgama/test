package com.example.demo;

@Entity
@Table(name = "entidade_antiga")
public class EntidadeAntiga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String someProperty;

    @ManyToOne
    @JoinColumn(name = "cod_tipo_dado")
    private NewTable newtable;


    // getters e setters
}
