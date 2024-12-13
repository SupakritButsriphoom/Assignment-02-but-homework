/*
 * 3) จงเขียนโปรแกรมเพื่อรับค่าวัน เดือน และปี จากแป้นพิมพ์ในฟังก์ชันหลัก จากนั้นตรวจสอบว่าค่าที่รับมาเป็นค่าที่ถูกต้องหรือไม่ แล้วแสดงให้ผู้ใช้รับทราบ โดยใช้เกณฑ์ดังนี้
- วันที่ ต้องมากกว่า 0 และไม่เกินวันสุดท้ายของเดือนนั้น โดยให้เดือนกุมภาพันธ์มี 28 วัน
- เดือน ต้องมากกว่า 0 และไม่เกิน 12
- ปี มีค่าในช่วง 2500-2565
- หากกรอกวัน เดือน ปีไม่ถูกต้อง ให้ทำการวนซ้ำ จนกว่าจะกรอกวัน เดือน ปีที่ถูกต้อง

โดยกำหนดให้ฟังก์ชันหลัก (main) เรียกฟังก์ชันดังนี้
- checkInput() กำหนดให้มีตัวแปร 3 ตัวสำหรับส่งผ่านค่าวัน เดือน ปี แบบส่งผ่านโดยค่า (by value) 
และแสดงผลลัพธ์ว่าค่าที่รับมา เป็นวันเดือนปีที่ถูกต้องหรือไม่ โดยถ้าวัน เดือน ปี มีค่าที่ถูกต้อง ให้แสดงผลลัพธ์เป็น Correct! 
แต่ถ้าวัน เดือน ปี มีค่าที่ไม่ถูกต้อง ให้แสดงผลลัพธ์เป็น wrong value(s)

 */
package date3;

import java.util.Scanner;

public class App {
    public static boolean checkInput(int day, int month, int year) {

        if (year < 2500 || year > 2565) {
            return false;
        }
        if (month < 1 || month > 12) {

            return false;
        }
        if (day < 1 || day > getDaysInMonth(month)) {

            return false;
        }
        return true;
    }

    public static int getDaysInMonth(int month) {
        switch (month) {
            case 1:
                return 31;
            case 2: // กุมภาพันธ์
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter day: ");
            int day = sc.nextInt();
            System.out.print("Enter month: ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            if (checkInput(day, month, year)) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong value(s)");
            }
        }
        sc.close();
    }

    public Object getGreeting() {

        throw new UnsupportedOperationException("Unimplemented method 'getGreeting'");
    }
}