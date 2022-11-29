/*
* 1. 4)참조 타입은 null값으로 초기화 할수 없다   // 할수있음
* 2. 3)참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다. // 아니다.
* 3. 2)String 타입의 문자열 비교는 == 를 사용해야한다. // equals 사용
* 4. 2) int[] array; array = {1,2,3} // 틀림
* 5. 3)boolean 타입 배열 항목의 기초 초기값은 true 이다. // 아니다.
* 6. 3,5
* 10. tmp = ballArr[i]
* ballArr[i] = ballArr[j]
* ballArr[j] = tmp;
* System.arraycopy(ballArr,0,ball3,0,3);
* */

public class Test {
    public static void main(String[] args) {
        // 7.
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

        }
        System.out.println(sum);


        //8.
        int[] array = {1,5,3,8,2};
        int pre = 0;
        for(int i=0; i < array.length; i++) {
            if(pre < array[i]) {
                pre = array[i];
            }
        }
        System.out.println(pre);

        //9.
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        double avg = 0.0;
        int count =0;
        for(int i =0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        avg = (double) sum/ count;
        System.out.prinln(sum);
        System.out.println(avg);

    }
}