//Andy Dell'Orfano
// 10/29/24


package AT06;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
public class Calender {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstOfMonth = today.minusDays(today.getDayOfMonth() - 1);
        Month month = today.getMonth();
        DayOfWeek dayofWeek; 
        dayofWeek = firstOfMonth.getDayOfWeek();
        int lastDay = month.length(false);
        int now = today.getDayOfMonth();
        System.out.println("        " + month);
        System.out.println("MON TUE WED THU FRI SAT SUN");
        int i =1;
        
        if (dayofWeek == DayOfWeek.MONDAY) {
            i =1;
            while (i< now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 7){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 8){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 14) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 15) {
                    System.out.print(" " + i);
                }else if (i == 21) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 22) {
                    System.out.print(" " + i);
                }else if (i == 28) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 29) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
            if (i == now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i + "*");
                }else if (i == 7){
                    System.out.print("   " + i + "*");
                    System.out.println("");
                }else if (i == 8){
                    System.out.print("  " + i + "*");
                }else if (i<10){
                    System.out.print("   " + i + "*");
                } else if (i == 14) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                } else if (i == 15) {
                    System.out.print(" " + i + "*");
                }else if (i == 21) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 22) {
                    System.out.print(" " + i + "*");
                }else if (i == 28) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 29) {
                    System.out.print(" " + i + "*");
                }
                else {
                    System.out.print("  " + i + "*");
                }
                i++;
            }if (i == now +1){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print(" " + i );
                }else if (i == 7){
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 8){
                    System.out.print(" " + i);
                }else if (i<10){
                    System.out.print("  " + i);
                } else if (i == 14) {
                    System.out.print(" " + i);
                    System.out.println("");
                } else if (i == 15) {
                    System.out.print("" + i);
                }else if (i == 21) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 22) {
                    System.out.print(" " + i);
                }else if (i == 28) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 29) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print(" " + i);
                }
                i++;
            }while (i<= lastDay){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 7){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 8){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 14) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 15) {
                    System.out.print(" " + i);
                }else if (i == 21) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 22) {
                    System.out.print(" " + i);
                }else if (i == 28) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 29) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
        } else if (dayofWeek == DayOfWeek.TUESDAY) {
            i =0;
            while (i< now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 6){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 7){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 13) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 14) {
                    System.out.print(" " + i);
                }else if (i == 20) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 21) {
                    System.out.print(" " + i);
                }else if (i == 27) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 28) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
            if (i == now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i + "*");
                }else if (i == 6){
                    System.out.print("   " + i + "*");
                    System.out.println("");
                }else if (i == 7){
                    System.out.print("  " + i + "*");
                }else if (i<10){
                    System.out.print("   " + i + "*");
                } else if (i == 13) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                } else if (i == 14) {
                    System.out.print(" " + i + "*");
                }else if (i == 20) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 21) {
                    System.out.print(" " + i + "*");
                }else if (i == 27) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 28) {
                    System.out.print(" " + i + "*");
                }
                else {
                    System.out.print("  " + i + "*");
                }
                i++;
            }if (i == now +1){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print(" " + i );
                }else if (i == 6){
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 7){
                    System.out.print(" " + i);
                }else if (i<10){
                    System.out.print("  " + i);
                } else if (i == 13) {
                    System.out.print(" " + i);
                    System.out.println("");
                } else if (i == 14) {
                    System.out.print(" " + i);
                }else if (i == 20) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 21) {
                    System.out.print(" " + i);
                }else if (i == 27) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 28) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print(" " + i);
                }
                i++;
            }while (i<= lastDay){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 6){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 7){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 13) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 14) {
                    System.out.print(" " + i);
                }else if (i == 20) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 21) {
                    System.out.print(" " + i);
                }else if (i == 27) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 28) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
        } else if (dayofWeek == DayOfWeek.WEDNESDAY) {
            i =-1;
            while (i< now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 5){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 6){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 12) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 13) {
                    System.out.print(" " + i);
                }else if (i == 19) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 20) {
                    System.out.print(" " + i);
                }else if (i == 26) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 27) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
            if (i == now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i + "*");
                }else if (i == 5){
                    System.out.print("   " + i + "*");
                    System.out.println("");
                }else if (i == 6){
                    System.out.print("  " + i + "*");
                }else if (i<10){
                    System.out.print("   " + i + "*");
                } else if (i == 12) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                } else if (i == 13) {
                    System.out.print(" " + i + "*");
                }else if (i == 19) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 20) {
                    System.out.print(" " + i + "*");
                }else if (i == 26) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 27) {
                    System.out.print(" " + i + "*");
                }
                else {
                    System.out.print("  " + i + "*");
                }
                i++;
            }if (i == now +1){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print(" " + i );
                }else if (i == 5){
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 6){
                    System.out.print(" " + i);
                }else if (i<10){
                    System.out.print("  " + i);
                } else if (i == 12) {
                    System.out.print(" " + i);
                    System.out.println("");
                } else if (i == 13) {
                    System.out.print("" + i);
                }else if (i == 19) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 20) {
                    System.out.print(" " + i);
                }else if (i == 26) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 27) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print(" " + i);
                }
                i++;
            }while (i<= lastDay){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 5){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 6){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 12) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 13) {
                    System.out.print(" " + i);
                }else if (i == 19) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 20) {
                    System.out.print(" " + i);
                }else if (i == 26) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 27) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
        }else if (dayofWeek == DayOfWeek.THURSDAY){
            i =-2;
            while (i< now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 4){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 5){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 11) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 12) {
                    System.out.print(" " + i);
                }else if (i == 18) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 19) {
                    System.out.print(" " + i);
                }else if (i == 25) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 26) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
            if (i == now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i + "*");
                }else if (i == 4){
                    System.out.print("   " + i + "*");
                    System.out.println("");
                }else if (i == 5){
                    System.out.print("  " + i + "*");
                }else if (i<10){
                    System.out.print("   " + i + "*");
                } else if (i == 11) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                } else if (i == 12) {
                    System.out.print(" " + i + "*");
                }else if (i == 18) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 19) {
                    System.out.print(" " + i + "*");
                }else if (i == 25) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 26) {
                    System.out.print(" " + i + "*");
                }
                else {
                    System.out.print("  " + i + "*");
                }
                i++;
            }if (i == now +1){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print(" " + i );
                }else if (i == 4){
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 5){
                    System.out.print(" " + i);
                }else if (i<10){
                    System.out.print("  " + i);
                } else if (i == 11) {
                    System.out.print(" " + i);
                    System.out.println("");
                } else if (i == 12) {
                    System.out.print(" " + i);
                }else if (i == 18) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 19) {
                    System.out.print(" " + i);
                }else if (i == 25) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 26) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print(" " + i);
                }
                i++;
            }while (i<= lastDay){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 4){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 5){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 11) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 12) {
                    System.out.print(" " + i);
                }else if (i == 18) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 19) {
                    System.out.print(" " + i);
                }else if (i == 25) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 26) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
        }else if (dayofWeek == DayOfWeek.SATURDAY) {
            i =-4;
            while (i< now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 2){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 3){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 9) {
                    System.out.print("   " + i);
                    System.out.println("");
                } else if (i == 10) {
                    System.out.print(" " + i);
                }else if (i == 16) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 17) {
                    System.out.print(" " + i);
                }else if (i == 23) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 24) {
                    System.out.print(" " + i);
                }else if (i==30){
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 31){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
            if (i == now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i + "*");
                }else if (i == 2){
                    System.out.print("   " + i + "*");
                    System.out.println("");
                }else if (i == 3){
                    System.out.print("  " + i + "*");
                }else if (i<10){
                    System.out.print("   " + i + "*");
                } else if (i == 9) {
                    System.out.print("   " + i + "*");
                    System.out.println("");
                } else if (i == 10) {
                    System.out.print(" " + i + "*");
                }else if (i == 16) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 17) {
                    System.out.print(" " + i + "*");
                }else if (i == 23) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 24) {
                    System.out.print(" " + i + "*");
                }else if (i==30){
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 31){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i + "*");
                }
                i++;
            }if (i == now +1){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print(" " + i );
                }else if (i == 2){
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 3){
                    System.out.print(" " + i);
                }else if (i<10){
                    System.out.print("  " + i);
                } else if (i == 9) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 10) {
                    System.out.print(" " + i);
                }else if (i == 16) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 17) {
                    System.out.print(" " + i);
                }else if (i == 23) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 24) {
                    System.out.print("" + i);
                }else if (i==30){
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 31){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print(" " + i);
                }
                i++;
            }while (i<= lastDay){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 2){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 3){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 9) {
                    System.out.print("   " + i);
                    System.out.println("");
                } else if (i == 10) {
                    System.out.print(" " + i);
                }else if (i == 16) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 17) {
                    System.out.print(" " + i);
                }else if (i == 23) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 24) {
                    System.out.print(" " + i);
                } else if (i==30){
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 31){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
        } else if (dayofWeek == DayOfWeek.FRIDAY) {
            i =-3;
            while (i< now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 3){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 4){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 10) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 11) {
                    System.out.print(" " + i);
                }else if (i == 17) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 18) {
                    System.out.print(" " + i);
                }else if (i == 24) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 25) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
            if (i == now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i + "*");
                }else if (i == 3){
                    System.out.print("   " + i + "*");
                    System.out.println("");
                }else if (i == 4){
                    System.out.print("  " + i + "*");
                }else if (i<10){
                    System.out.print("   " + i + "*");
                } else if (i == 10) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                } else if (i == 11) {
                    System.out.print(" " + i + "*");
                }else if (i == 17) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 18) {
                    System.out.print(" " + i + "*");
                }else if (i == 24) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 25) {
                    System.out.print(" " + i + "*");
                }
                else {
                    System.out.print("  " + i + "*");
                }
                i++;
            }if (i == now +1){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print(" " + i );
                }else if (i == 3){
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 4){
                    System.out.print(" " + i);
                }else if (i<10){
                    System.out.print("  " + i);
                } else if (i == 10) {
                    System.out.print(" " + i);
                    System.out.println("");
                } else if (i == 11) {
                    System.out.print(" " + i);
                }else if (i == 17) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 18) {
                    System.out.print(" " + i);
                }else if (i == 24) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 25) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print(" " + i);
                }
                i++;
            }while (i<= lastDay){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                }else if (i == 3){
                    System.out.print("   " + i);
                    System.out.println("");
                }else if (i == 4){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 10) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 11) {
                    System.out.print(" " + i);
                }else if (i == 17) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 18) {
                    System.out.print(" " + i);
                }else if (i == 24) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 25) {
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
        }else if (dayofWeek == DayOfWeek.SUNDAY) {
            i =-4;
            while (i< now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                System.out.println("");
                }else if (i == 2){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 8) {
                    System.out.print("   " + i);
                    System.out.println("");
                } else if (i == 9) {
                    System.out.print("  " + i);
                }else if (i == 15) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 16) {
                    System.out.print(" " + i);
                }else if (i == 22) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 23) {
                    System.out.print(" " + i);
                }else if (i==29){
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 30){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
            if (i == now){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i + "*");
                System.out.println("");
                }else if (i == 2){
                    System.out.print("  " + i + "*");
                }else if (i<10){
                    System.out.print("   " + i + "*");
                } else if (i == 8) {
                    System.out.print("   " + i + "*");
                    System.out.println("");
                } else if (i == 9) {
                    System.out.print("  " + i + "*");
                }else if (i == 15) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 16) {
                    System.out.print(" " + i + "*");
                }else if (i == 22) {
                    System.out.print("  " + i + "*");
                    System.out.println("");
                }else if (i == 23) {
                    System.out.print(" " + i + "*");
                }else if (i==29){
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 30){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i + "*");
                }
                i++;
            }if (i == now +1){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print(" " + i );
                    System.out.println("");
                }else if (i == 2){
                    System.out.print(" " + i);
                }else if (i<10){
                    System.out.print("  " + i);
                } else if (i == 8) {
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 9) {
                    System.out.print(" " + i);
                }else if (i == 15) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 16) {
                    System.out.print(" " + i);
                }else if (i == 22) {
                    System.out.print(" " + i);
                    System.out.println("");
                }else if (i == 23) {
                    System.out.print(" " + i);
                }else if (i==28){
                    System.out.print(" " + i);
                    System.out.println("");
                } else if (i == 29){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print(" " + i);
                }
                i++;
            }while (i<= lastDay){
                if (i < 1){
                    System.out.print("    ");
                } else if (i ==1){
                System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 2){
                    System.out.print("  " + i);
                }else if (i<10){
                    System.out.print("   " + i);
                } else if (i == 8) {
                    System.out.print("   " + i);
                    System.out.println("");
                } else if (i == 9) {
                    System.out.print("  " + i);
                }else if (i == 15) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 16) {
                    System.out.print(" " + i);
                }else if (i == 22) {
                    System.out.print("  " + i);
                    System.out.println("");
                }else if (i == 23) {
                    System.out.print(" " + i);
                } else if (i==29){
                    System.out.print("  " + i);
                    System.out.println("");
                } else if (i == 30){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print("  " + i);
                }
                i++;
            }
        } 
    
    
        }
    }
