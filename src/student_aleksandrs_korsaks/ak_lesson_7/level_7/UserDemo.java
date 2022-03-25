package student_aleksandrs_korsaks.ak_lesson_7.level_7;

class UserDemo extends  UserRepository {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity(111, "Aleks", "Korsak", "5848644688");
        UserEntity secondUser = new UserEntity(112, "Mihail", "Korsak", "0000000000000");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        System.out.println(userRepository.getAllUsers());
        System.out.println(userRepository.getUsersById(1111));
        System.out.println(userRepository.getUsersByName("mihail"));
    }
}
