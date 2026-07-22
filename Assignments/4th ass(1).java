class Bank {
    void interest() {
        System.out.println("General Bank Interest");
    }
}

class SBI extends Bank {
    @Override
    void interest() {
        System.out.println("SBI Interest: 6.5%");
    }
}

class HDFC extends Bank {
    @Override
    void interest() {
        System.out.println("HDFC Interest: 7%");
    }
}

public class  Sriram {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.interest();
        b2.interest();
    }
}
