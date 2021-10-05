

public class Demo {
    public static void main(String[] args) {

        FieldCopier copier = new FieldCopier();
        Person gogo = new Person(5,"gogo",2517.52,true) ;
        Animal cat = new Animal(75,"cat");
        copier.copyFields(gogo,cat);
        System.out.println(cat.toString());

    }

    public static class Person {


        private int id;
        private String name;
        private double salary;
        private boolean isItMale;


        public Person(int id, String name, double salary, boolean isItMale) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.isItMale = isItMale;
        }


    }

    public static class Animal{
        private int id;
        private String name;



        public Animal(int id, String kind) {
            this.id = id;
            this.name = kind;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
