/*
* 1.31
* 2.가
* 3.
* pencils/students
* pencils%students
* 4. value /100 *100
* 5. 1) (lengthTop+lengthBottom) * height / 2.0
* 2) (lengthTop+lengthBottom) * height * 1.0 / 2
* 3) (double)(lengthTop+lengthBottom) * height / 2
* 4) (double)( (lengthTop+lengthBottom) * height / 2)
* 6. true, false
* 7. Double.inNaN(z)
* 8. numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
* 9. class Exercise {
    public static void main(String[] args) {
        int num = 10;
       System.out.println(num > 0 ? "양수":(num < 0 ? "음수" : "0"));
    }
}
* 10. num/10*10+1
* 11. (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
* 13. ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9')
* 14. ('A' <= ch && ch <= 'Z') ? (char)(ch+32): ch;
* */

//12.
public class Test {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3 / 2f;
        long l = 3000 * 3000 * 3000L;
        float f2 = 0.1f;

        double d = 0.1;
        boolean result = (float)d==f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }
}