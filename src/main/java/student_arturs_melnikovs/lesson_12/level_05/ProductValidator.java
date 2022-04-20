package student_arturs_melnikovs.lesson_12.level_05;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}
