package builderPattern;

public class Builder_client_1 {
    public static void main(String[] args) {
        student_1 st = student_1.getBuilder().
                setAge(45).
                setName("jkhj").
                setEmail("xyz").
                setpno("1234").
                setPsp(98).build();

        System.out.println(st);
    }
}
