/*
 * 1. 3)하나의 클래스로 하나의 객체만 생성할수있다. // 여러개 할수있음
 * 2. 4)로컬변수 // 구성멤버 변수가 아님
 * 3. 4) 클래스는 반드시 필드와 메소드를 가져야 한다. // 아니다.
 * 4. 3) 필드는 반드시 생성자 선언 전에 선언 되어야한다. //아니다
 * 5. 1) 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다. // 아니다
 * 6. 4) 메소드의 이름은 중복해서 선언할 수 없다. // 아니다.
 * 7. 2) 반드시 리턴 타임이 달라야 한다. // 아니다
 * 8. 2) 인스턴스 필드는 생성자 및 정적 블록에서 초기화되 수 있다. //아니다.
 * 9. 2) final 필드와 상수는 생성자에서 초기화될수 있다 // 초기화 안됨
 * 10. 4) com.mycom 패키지에 소속된 클래스는 com.yourcom 에 옮겨 놓아도 동작한다. //변경필요
 * 11. 3) default 접근 제한은 해당 클래스 내부에서만 사용을 허가한다.
 * 12. 필드, 생성자, 메소드
 * 13. public class Member {
 *  String name;
 *  String id;
 *  String password;
 *  int age;
 * }
 *
 * 16. static int weapon = 6; //공격력
 * static int armor = 0; // 방어력
 * static void weaponUp() {
 * statis void armorUp() {
 *
 * 17. 1) long add(int x, int y) {return x+y;} //매개변수의 타입, 개수가 같다.
 * 18. static 변수의 초기황 인스턴스 변수를 사용할 수 없다.
 * static 메서드에서는 인스턴스 변수를 사용할 수 없다.
 * static 메서드에서는 인스턴스메서드를 사용할 수 없다.
 *
 * 19. isPowerOn = !isPowerOn;
 * if(value < MAX_VOLUME) volume++;
 * if(value > MIN_VOLUME) volume--;
 * if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            channel++;
        }
 * if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }

*
 */
public class Test {
    // 20.
    public static boolean isNumber(String str) {
        if(str == null || str.equals("")) {
            return false;
        }
        for(int i = 0; i < str.length(); i++ ){
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    //21.
    public static int max(int[] arr) {
        if(arr == null || arr.length == 0) return -999999;
        int max = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        /* //20.
        String str = "123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

         */

        //21.
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println(max(data));
        System.out.println(max(null));
        System.out.println(max(new int[] {}));
    }

}

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 10000000;
    private int balance;
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
            return;
        }
        this.balance = balance;
    }
}