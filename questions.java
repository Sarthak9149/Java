class questions {
    public static void main(String[] args) {
        String s = "";

        if(s != null) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Test {
    public static void main(String[] args) {
        int count;
        Test() {
            count++;
        }
        public void printNumber(){
            System.out.println(count);
        }
    }
    public class qeustion3 {
        public static void main(String[] args) {
            Test t1 = new Test();
            Test t2 = new Test();
            Test t3 = new Test();
            t1.printNumber();
            t2.printNumber();
            t3.printNumber();
        }
    }
}