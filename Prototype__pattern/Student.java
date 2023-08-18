package Prototype__pattern;

public class Student implements prototype_interface{
    private String name;
    private int age;
    private double psp;
    String batchName;
    double avgBatchPsp;

    Student(){

    }
    Student(Student student){
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batchName = batchName;
        this.avgBatchPsp = avgBatchPsp;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =  name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getPsp(){
        return psp;
    }
    public void setPsp(double psp){
        this.psp = psp;
    }

    public double getAverageBatchPsp() {
        return avgBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.avgBatchPsp = averageBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Student clone(){
//        Student st = new Student();
//        st.name = this.name;
//        st.age = this.age;
//        st.psp = this.psp;
//        st.batchName = this.batchName;
//        st.avgBatchPsp = this.avgBatchPsp;
//        return st;

        return new Student(this);
    }

}
