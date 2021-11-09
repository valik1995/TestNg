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

    }
}
