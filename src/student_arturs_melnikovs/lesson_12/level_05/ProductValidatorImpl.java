package student_arturs_melnikovs.lesson_12.level_05;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

    @Override
    public List<ValidationException> validate(Product product) {
        return new ArrayList<ValidationException>() ;
    }

}
