package one.digitalinnovation.experts.productcatalog.repository;

import one.digitalinnovation.experts.productcatalog.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product,Integer>{

    // Responsável pelo CRUD (Create Read Update Delete) do product, no java pode ser uma interface
    // Extendendo o crud nao precisa nem codar
    // la no elasticSearchConfig a gente falou pro SPring olhar pra esse endereço
    // quando buscasse os repositorios, então vai automatico



}
