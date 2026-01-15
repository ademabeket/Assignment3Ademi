public class Main {
    public static void main(String[] args) {

        UserDAO.addUser(new User("Ademi", 17, 55.5));
        UserDAO.addUser(new User("Dana", 21, 62.0));

        System.out.println("ALL USERS:");
        UserDAO.getAllUsers().forEach(System.out::println);

        UserDAO.updateWeight(1, 57.0);
        UserDAO.deleteUser(2);
    }
}

