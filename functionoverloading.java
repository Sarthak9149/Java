class Examples {
    public static void main(String[] args) {
        ab x = new ab();

        x.a(5);   
    }
}

class ab {
    String name;
    int value;

    public short a(short a) {
        System.out.println("short" +" " + a);
        return 0;
    }

    public int a(int a) {
        System.out.println("int" + a);
        return 0;
    }

    public char a(char a) {
        System.out.println("char" + a);
        return 0;
    }
}