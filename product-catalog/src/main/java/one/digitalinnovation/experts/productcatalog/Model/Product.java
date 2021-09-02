package one.digitalinnovation.experts.productcatalog.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product", type = "catalog")
//Como esse produto sera persistido no elastic search, indice = tabelas do elastic

public class Product {
    // O que é meu produto

    @Id
    private Long id;
    private String name;
    private Integer amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
