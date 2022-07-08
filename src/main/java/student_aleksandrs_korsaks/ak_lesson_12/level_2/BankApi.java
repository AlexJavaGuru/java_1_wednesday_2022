package student_aleksandrs_korsaks.ak_lesson_12.level_2;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws IllegalAccessException;
}
