public class Main {

    public static String pad(String text, int length, String substr){

        if (text == null){
            return null;
        }

        if(text.length() > length){
            throw new RuntimeException("Ты дурак?");
        }

        String resuit = text;
        while (resuit.length() < length){
            resuit += substr;
        }

        return resuit;



    }


    public static void main(String[] args) {
        Person person = new Person("Valin", "375336.506619@mail.ru", "33-650-66-19");

        if(person.isFirstNameValid()){
            System.out.println("Valid first name");
        }else {
            System.out.println("Not Valid first name");

        }

        if(person.isEmailValid()){
            System.out.println("Valid email");
        }else {
            System.out.println("Not Valid email");

        }

    }
}
