package student_aleksandrs_korsaks.ak_lesson_7.level_7;

class UserDemo extends  UserRepository {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity( "Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity( "Mihail", "Korsak", "200810-10126");
        UserEntity thirdUser = new UserEntity( "Oksana", "Korsak", "200810-10125");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        userRepository.saveUser(thirdUser);
        System.out.println(userRepository.getAllUsers());
        System.out.println(userRepository.getUsersById(2));
        System.out.println(userRepository.getUsersByName("Mihail"));
    }
}
