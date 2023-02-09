package  com.heefan.api.composite.product

import org.springframework.web.bind.annotation.GetMapping;

public interface ProductCompositeService {
    /**
     * Sample Usage: curl $HOST:$PORT/product-composite/1
     * 
     * @param productId
     * @return the composite product info, if found, else null
     */

    @GetMapping(
        value = "/product-composite/{productId}",
        produces = "application/json")
    ProductAggregate getProduct(@PathVariable int productId);
}
