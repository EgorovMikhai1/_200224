package org.example._2024_07_03;

public class Test {
}

//What is the result of the following class? (Choose all that apply)

class _C {
    private static int $;
    private String str;

    public static void main(String[] main) {

        int i = 1;
        int result = i++ + ++i;
        System.out.println(result);








        String a_b;
        System.out.print($);
        System.out.println(new _C().str);
//        System.out.print(a_b);
    }
}
//A. Compiler error on line 1.
//B. Compiler error on line 2.
//C. Compiler error on line 4.
//D. Compiler error on line 5.
//E. Compiler error on line 6.
//F. 0null
//G. nullnull



//What is the result of the following code?
//        String s1 = "Java";
//        String s2 = "Java";
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append("Ja").append("va");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(sb1.toString() == s1);
//        System.out.println(sb1.toString().equals(s1));

//        A. true is printed out exactly once.
//        B. true is printed out exactly twice.
//        C. true is printed out exactly three times.
//        D. true is printed out exactly four times.
//        E. The code does not compile.

/**
 * What is the output of the following program?
 * 1: public class FeedingSchedule {
 * 2:   public static void main(String[] args) {
 * 3:       boolean keepGoing = true;
 * 4:       int count = 0;
 * 5:       int x = 3;
 * 6:       while(count++ < 3) {
 * 7:           int y = (1 + 2 * count) % 3;
 * 8:           switch(y) {
 * 9:           default:
 * 10:          case 0: x -= 1; break;
 * 11:      case 1: x += 5;
 * 12:  }
 * 13: }
 * 14:      System.out.println(x);
 * 15: }
 * }
 * A. 4
 * B. 5
 * C. 6
 * D. 7
 * E. 13
 * F. The code will not compile because of line 7.
 */

/**
 * What is the output of the following code? (Choose all that apply)
 * 1: interface HasTail {
 *      int getTailLength();
 *    }
 *
 * 2: abstract class Puma implements HasTail {
 * 3:   protected int getTailLength() {
 *          return 4;
 *          }
 * 4: }
 *
 * 5: public class Cougar extends Puma {
 * 6:   public static void main(String[] args) {
 * 7:       Puma puma = new Puma();
 * 8:       System.out.println(puma.getTailLength());
 * 9: }
 * 10:
 * 11: public int getTailLength(int length) {
 *          return 2;
 *        }
 * 12: }
 *
 *
 * A. 2
 * B. 4
 * C. The code will not compile because of line 3.
 * D. The code will not compile because of line 5.
 * E. The code will not compile because of line 7.
 * F. The code will not compile because of line 11.
 * G. The output cannot be determined from the code provided.
 */

/**
 * What is the output of the following code snippet?
 * 13: System.out.print("a");
 * 14:  try {
 * 15:      System.out.print("b");
 * 16:      throw new IllegalArgumentException();
 * 17:  } catch (RuntimeException e) {
 * 18:      System.out.print("c");
 * 19:   } finally {
 * 20:      System.out.print("d");
 * 21:  }
 * 22: System.out.print("e");
 *
 * A. abe
 * B. abce
 * C. abde
 * D. abcde
 * E. The code does not compile.
 * F. An uncaught exception is thrown.
 */

/**
 * What is the result of the following program?
 * 1: public class MathFunctions {
 * 2:   public static void addToInt(int x, int amountToAdd) {
 * 3:       x = x + amountToAdd;
 * 4: }
 *
 * 5:   public static void main(String[] args) {
 * 6:       int a = 15;
 * 7:       int b = 10;
 * 8:       MathFunctions.addToInt(a, b);
 * 9:       System.out.println(a);
 * }
 * }
 *
 * A. 10
 * B. 15
 * C. 25
 * D. Compiler error on line 3.
 * E. Compiler error on line 8.
 * F. None of the above.
 */

/**
 * What is the result of the following code?
 * int[] array = {6,9,8};
 * List<Integer> list = new ArrayList<>();
 * list.add(array[0]);
 * list.add(array[2]);
 * list.set(1, array[1]);
 * list.remove(0);
 * System.out.println(list);
 *
 * A. [8]
 * B. [9]
 * C. Something like [Ljava.lang.String;@160bc7c0
 * D. An exception is thrown.
 * E. The code does not compile
 */

/**
 * 8. What is the output of the following code?
 * 1: public class Deer {
 * 2:   public Deer() {
 *          System.out.print("Deer");
 *      }
 *
 * 3:   public Deer(int age) {
 *          System.out.print("DeerAge");
 *      }
 *
 * 4:   private boolean hasHorns() {
 *          return false;
 *      }
 *
 * 5:   public static void main(String[] args) {
 * 6:       Deer deer = new Reindeer(5);
 * 7:       System.out.println(","+deer.hasHorns());
 * 8: }
 * 9: }
 * 10: class Reindeer extends Deer {
 * 11:      public Reindeer(int age) {
 *              System.out.print("Reindeer");
 *          }
 *
 * 12:      public boolean hasHorns() {
 *              return true;
 *          }
 * 13: }
 *
 * A. DeerReindeer,false
 * B. DeerReindeer,true
 * C. ReindeerDeer,false
 * D. ReindeerDeer,true
 * E. DeerAgeReindeer,false
 * F. DeerAgeReindeer,true
 * G. The code will not compile because of line 7.
 * H. The code will not compile because of line 12.
 */
