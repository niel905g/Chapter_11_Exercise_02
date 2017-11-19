package Chapter_11;

    public class Employee extends Person {
        protected double salary;
        protected String office;
        protected MyDate dateHired;

        public Employee(String name) {
            this(name, 0, "none", new MyDate());
        }

        public Employee(String name, double salary, String office, MyDate dateHired) {
            super(name);
            this.salary = salary;
            this.office = office;
            this.dateHired = dateHired;
        }

        public Employee(String name, String office, double salary, MyDate dateHired) {
            super(name);
            this.salary = salary;
            this.office = office;
            this.dateHired = dateHired;
        }
//  Det er ikke alt hvad IntelliJ's "Generate" af Constructors o.l. getters&setters der fungerer!
//        public Employee(String name, int i, String none, MyDate dateHired) {
//        }

        public String getOffice() {
            return office;
        }

        public void setOffice(String office) {
            this.office = office;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public MyDate getDateHired() {
            return dateHired;
        }

        public void setDateHired(MyDate dateHired) {
            this.dateHired = dateHired;
        }

        @Override
        public String toString() {
            return "Name: " + getName() + " Class: " + this.getClass().getName();
        }
    }

