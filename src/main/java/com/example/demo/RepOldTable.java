
@Repository
public interface EntidadeAntigaRepository extends JpaRepository<EntidadeAntiga, Long> {

    @Query("SELECT e FROM EntidadeAntiga e JOIN FETCH e.tabelaNova WHERE e.id = :id")
    Optional<EntidadeAntiga> findByIdWithTabelaNova(@Param("id") Long id);
}

//Observe que a consulta usa a cláusula JOIN FETCH para garantir que a entidade TabelaNova seja carregada com a entidade EntidadeAntiga em uma única consulta.

@Repository
public interface EntidadeAntigaRepository extends JpaRepository<EntidadeAntiga, Long> {

    @Query("SELECT ea FROM EntidadeAntiga ea JOIN ea.tabelaNova tn WHERE tn.tipoDado = :tipoDado")
    List<EntidadeAntiga> findByTipoDado(@Param("tipoDado") String tipo
//Para buscar a entidade EntidadeAntiga com o tipo de dado correspondente, 
//você pode criar um método no repositório da entidade EntidadeAntiga que use uma consulta JPQL 
//para buscar a entidade com base no tipo de dado. Por exemplo: