class Hi {
    public void run() {
        for(int i=1; i<=5; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
                System.out.println("Hi");
            } catch (InterruptedException e){}
        }
    }
}

class Hello {
    public void run() {
        for(int i=1; i<=5; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
                System.out.println("Hello");
            } catch (InterruptedException e){}
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();
    }
}

