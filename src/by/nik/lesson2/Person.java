package by.nik.lesson2;


public class Person {

    private Convert convert;

    private Person(Convert convert) {
        this.convert = convert;
    }

    private class Activities {
        private void typing() {
            System.out.println(convert.doUpper("person is typing using lambda"));

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
                private void typing(){
                System.out.println("person is typing from local class");
            }
        }
        TestLocalClass testLocalClass = new TestLocalClass();
        testLocalClass.typing();
    }

    public static void main(String... args) {
        Person person = new Person((string) -> string.toUpperCase());
        person.personAnimation();
    }

}