
public class Main {
    static void one(){
        System.out.println("my project");
    }
    public static void main(String[] args) {
        String name = "John";
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        int x = 5;
        int y = 3;
        System.out.println(x + y);
        int w = 8;
        int z = 3;
        System.out.println(w - z);
        int j = 3;
        int i = 4;
        System.out.println(j * i);
        int p = 12;
        int q = 3;
        System.out.println(p / q);
        int s = 4;
        int v = 2;
        System.out.println(s % v);
        int t = 5;
        int r = 3;
        System.out.println(t > r);
        int m = 5;
        int n = 3;
        System.out.println(m < n);
        int f = 5;
        int g = 3;
        System.out.println(f == g);
        int h = 5;
        System.out.println(h > 3 && h < 10);
        int a = 5;
        System.out.println(a > 3 || a < 4);
        int b = 5;
        System.out.println(!(b > 3 && b < 10));
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            }
        for(int c = 0; c <= 10; c = c + 2) {
            System.out.println(c);
            int e = 0;
            do {
                System.out.println(e);
                e++;
            }
            while (e < 5);
        }
        one();
    }
}

















