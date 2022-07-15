package student_aleksandrs_korsaks.ak_lesson_12.level_5_6;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}
