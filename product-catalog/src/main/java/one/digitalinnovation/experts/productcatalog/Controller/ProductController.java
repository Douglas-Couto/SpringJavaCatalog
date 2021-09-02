package one.digitalinnovation.experts.productcatalog.Controller;


import one.digitalinnovation.experts.productcatalog.Model.Product;
import one.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
//Isso diz pro Spring q aqui é um rest controller, e que o que ocorrer aqui é parte
// do serviço do Rest
@RequestMapping(value = "/product")
// Estou falando pro Spring que quando ocorrer um /product, ESTE controller é responsavel por atender a requisição

public class ProductController {

    //Http POST http://localhost:8080/product id=1 nome=TV amount=10
    // Quando le o /product sabe que aciona aqui por conta do @RequestMapping
    //QUando ve o POST sabe que é o create la de baixo

    @Autowired
    private ProductRepository productRepository;

    //O SPring vai injetar essa instancia, neste atributo de classe
    //Com o autowired o Spring vai buscar a instancia correta e injetar

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id) {
       return productRepository.findById(id);
    }



}
