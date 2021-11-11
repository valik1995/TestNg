import java.util.Arrays;

public class Person {
    private String name;
    private String email;
    private String phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public boolean isEmailValid(){
        return email.matches("[\\w]+@[\\w]+.[a-z]{2,}");
    }

    public boolean isFirstNameValid(){
        return name.matches("[A-Za-z]+");
    }

    public static String createPhoneNumber(int[] numbers){
        return Arrays.toString(numbers)
                .replaceAll("[, \\[\\]]", "")
                .replaceAll("(\\d{2})(\\d{3})(\\d{2})(\\d{2})", "($1) $2-$3-$4");
    }
}
