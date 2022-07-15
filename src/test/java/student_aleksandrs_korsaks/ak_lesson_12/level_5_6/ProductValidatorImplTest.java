package student_aleksandrs_korsaks.ak_lesson_12.level_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductValidatorImplTest {

    ProductValidatorImpl validator;
    Product product;
    List<ValidationException> exceptions;


    @BeforeEach
    void setUp() {
        validator = new ProductValidatorImpl(new ProductTitleValidationRule(),
                new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
    }

    @Test
    void rule1_v1() {
        product = new Product(null, 1, "description");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-1", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title can not be empty", exceptions.get(0).getDescription());
    }

    @Test
    void rule1_v2() {
        product = new Product("", 1, "description");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-1", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title can not be empty", exceptions.get(0).getDescription());
    }

    @Test
    void rule2() {
        product = new Product("ab", 1, "description");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-2", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title should contain at least 3 symbols", exceptions.get(0).getDescription());
    }

    @Test
    void rule3() {
        product = new Product("a".repeat(101), 1, "description");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-3", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title should not contain more than 100 symbols", exceptions.get(0).getDescription());
    }

    @Test
    void rule4_v1() {
        product = new Product("abc!", 1, "description");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-4", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title must only consist of eng characters and/or numbers", exceptions.get(0).getDescription());
    }

    @Test
    void rule4_v2() {
        product = new Product("a2cЫ", 1, "description");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-4", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title must only consist of eng characters and/or numbers", exceptions.get(0).getDescription());
    }

    @Test
    void rule5() {
        product = new Product("abc", null, "description");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-5", exceptions.get(0).getRuleName());
        assertEquals("price", exceptions.get(0).getFieldName());
        assertEquals("Price can not be empty", exceptions.get(0).getDescription());
    }

    @Test
    void rule6() {
        product = new Product("abc", 0, "description");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-6", exceptions.get(0).getRuleName());
        assertEquals("price", exceptions.get(0).getFieldName());
        assertEquals("Price should be more than zero", exceptions.get(0).getDescription());
    }

    @Test
    void rule7() {
        product = new Product("abc", 1, "a".repeat(2001));
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-7", exceptions.get(0).getRuleName());
        assertEquals("description", exceptions.get(0).getFieldName());
        assertEquals("Description should not contain more than 2000 symbols", exceptions.get(0).getDescription());
    }

    @Test
    void rule8_v1() {
        product = new Product("abc", 1, "abc2?");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-8", exceptions.get(0).getRuleName());
        assertEquals("description", exceptions.get(0).getFieldName());
        assertEquals("Description must only consist of eng characters and/or numbers", exceptions.get(0).getDescription());
    }

    @Test
    void rule8_v2() {
        product = new Product("abc", 1, "abc2Ф");
        exceptions = validator.validate(product);
        assertEquals(1, exceptions.size());
        assertEquals("RULE-8", exceptions.get(0).getRuleName());
        assertEquals("description", exceptions.get(0).getFieldName());
        assertEquals("Description must only consist of eng characters and/or numbers", exceptions.get(0).getDescription());
    }
}