package Prototype__pattern;

public class client_prototype {

    public static void fillRegistry(StudentRegistry registry){

        // set parameters which are common to objects in the registry and parameters
        // like name , age, psp can be filled up in main method.
        Student julyBatch = new Student();
        julyBatch.setBatchName("july22");
        julyBatch.setAverageBatchPsp(98);
        registry.register("july22" , julyBatch);

        Student augBatch = new Student();
        augBatch.setBatchName("aug22");
        augBatch.setAverageBatchPsp(99);
        registry.register("aug22" , augBatch);

        Student septBatch = new Intelligent_Student();
        septBatch.setBatchName("sept22");
        augBatch.setAverageBatchPsp(98);
        ((Intelligent_Student) septBatch).IQ = 100;
        registry.register("sept22", septBatch);

    }
    public static void main(String[] args) {

        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student abc = registry.get("july22").clone();
        abc.setName("abc");
        abc.setAge(22);
        abc.setPsp(98);

        Student def = registry.get("aug22").clone();
        def.setName("def");
        def.setAge(23);
        def.setPsp(99);

        Student ghi = registry.get("sept22").clone(); 
        ghi.setName("ghi");
        ghi.setAge(23);
        ghi.setPsp(99);


        System.out.println(abc);
        System.out.println(def);
        System.out.println(ghi);

        System.out.println("debug");
    }
}
