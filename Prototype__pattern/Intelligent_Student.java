package Prototype__pattern;

public class Intelligent_Student extends Student{
    int IQ;
    Intelligent_Student(){

    }
    Intelligent_Student(Intelligent_Student student){
        super(student);
        this.IQ = student.IQ;
    }
    public Intelligent_Student clone(){
//        Intelligent_Student st = new Intelligent_Student();
//        st.setName(this.getName());
//        st.setAge(this.getAge());
//        st.setBatchName(this.getBatchName());
//        st.setAverageBatchPsp(this.getAverageBatchPsp());
//        st.setPsp(this.getPsp());
//        st.IQ = this.IQ;
//        return st;

        return new Intelligent_Student(this);
    }
}
