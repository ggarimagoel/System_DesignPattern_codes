package builderPattern;


public class student_1 {
    private String name;
    private String pno;
    private String email;
    private int age;
    private int psp;

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {

        this.psp = psp;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private student_1(builder_1 builder){
        this.name = builder.name;
        this.pno = builder.pno;
        this.email = builder.email;
        this.psp = builder.psp;
        this.age = builder.age;
    }

    public static builder_1 getBuilder(){
        return new builder_1();
    }
    public static class builder_1 {
        private static String name;
        private String pno;
        private String email;
        private static int age;
        private static int psp;

        public builder_1 setAge(int age) {
            this.age = age;
            return this;
        }

        public builder_1 setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public builder_1 setName(String name) {
            this.name = name;
            return this;
        }

        public builder_1 setpno(String pno) {
            this.pno = pno;
            return this;
        }

        public builder_1 setEmail(String email) {
            this.email = email;
            return this;
        }

        public student_1 build() {
            if (isvalidAge(this.age) == false) {
                throw new IllegalArgumentException("invalid age");
            }
            if (isvalidName(this.name) == false) {
                throw new IllegalArgumentException("invalid name");
            }
            return new student_1(this);
            }
        private static boolean isvalidName(String name){
            if(name == null || name.length() == 0){
                return false;
            }
            return true;
        }
        private static boolean isvalidAge(int age){
            if(age < 20 || age > 60){
                return false;
            }
            return true;
        }
        }
    }
