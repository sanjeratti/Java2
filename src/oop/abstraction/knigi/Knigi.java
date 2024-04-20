package oop.abstraction.knigi;

public abstract class Knigi {

        public String name;
        private int year;

        public Knigi(String name, int year) {
            this.name = name;
            this.year = year;
        }

        public int getYear() {
            return year;
        }
        public abstract  void read();
        public void Tsena(){
            System.out.println("500 som");
        }

        @Override
        public String toString() {
            return "Knigi{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    '}';
    }
}
