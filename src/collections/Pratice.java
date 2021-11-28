package collections;

public class Pratice {
    private int empno;
    private String ename;
    private int salary;

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    public Pratice(int empno, String ename, int salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Pratice{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args){
        Pratice p1=new Pratice(1,"kollu",1000);
        System.out.println(p1);
    }

}
