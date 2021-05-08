package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < users.length; i++ ){
            if (users[i].getUsername().equals(login)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("User not found");
        }
        return users[rsl];
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid() && user.getUsername().length() > 3) {
            rsl = true;
        }
        else {
            throw new UserInvalidException("User not valid");
        }
        return rsl;
    }


    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            System.out.println(user.getUsername());
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
