package by.nik.lesson2;


@FunctionalInterface
interface Convert {
    String doUpper(String string);
}

public class Person {

    Convert convert;

    public Person(Convert convert) {
        this.convert = convert;
    }

    private class Activities {
        private void typing() {
            System.out.println(convert.doUpper("person is typing from lambda"));

            Convert typingUP = new Convert() {
                @Override
                public String doUpper(String string) {
                    return string.toUpperCase();
                }
            };
            System.out.println(typingUP.doUpper("person is typing from anonymous class"));
        }
    }


    private void personAnimation(){
        Activities activities = new Activities();
        activities.typing();

        class TestLocalClass {
            String string = "testing a local class";
        }
    }

    public static void main(String... args) {
        Person person = new Person((string) -> string.toUpperCase());
        person.personAnimation();
    }

}