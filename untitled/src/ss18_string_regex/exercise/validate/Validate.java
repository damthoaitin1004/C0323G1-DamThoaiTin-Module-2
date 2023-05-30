package ss18_string_regex.exercise.validate;

public class Validate {
    public static boolean checkInput(String name, String regex){
        return name.matches(regex);
    }
}
