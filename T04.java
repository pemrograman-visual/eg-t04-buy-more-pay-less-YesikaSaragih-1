// NIM - Your Name
// 12S24024 - Yesika Nadia Saragih
// 12S24027 - Grasia Gayatri Simanullang

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        double[] price = new double[3];

        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        int[] quantity = new int[3];

        quantity[0] = 0;
        quantity[1] = 0;
        quantity[2] = 0;
        double[] eksprice = new double[3];

        eksprice[0] = 0;
        eksprice[1] = 0;
        eksprice[2] = 0;
        double totalharga;

        totalharga = 0;
        int quantity0, quantity1, quantity2, b;

        quantity0 = 0;
        quantity1 = 0;
        quantity2 = 0;
        b = 0;
        while (b < 3) {
            iSBN[b] = input.nextLine();
            if (!iSBN[b].equals("---")) {
                if (iSBN[b].equals(iSBN[0])) {
                    b = 0;
                    price[b] = Double.parseDouble(input.nextLine());
                    quantity[b] = Integer.parseInt(input.nextLine());
                    quantity0 = quantity0 + quantity[b];
                    b = b + 1;
                } else {
                    if (iSBN[b].equals(iSBN[1])) {
                        b = 1;
                        price[b] = Double.parseDouble(input.nextLine());
                        quantity[b] = Integer.parseInt(input.nextLine());
                        quantity1 = quantity1 + quantity[b];
                        b = b + 1;
                    } else {
                        if (iSBN[b].equals(iSBN[2])) {
                            b = 2;
                            price[b] = Double.parseDouble(input.nextLine());
                            quantity[b] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + quantity[b];
                            b = b + 1;
                        }
                    }
                }
            } else {
                b = 3;
            }
        }
        if (quantity0 <= 5) {
            price[0] = price[0] - price[0] * 0.02;
        } else {
            if (quantity0 <= 10) {
                price[0] = price[0] - price[0] * 0.05;
            } else {
                if (quantity0 <= 20) {
                    price[0] = price[0] - price[0] * 0.12;
                }
            }
        }
        eksprice[0] = price[0] * quantity0;
        if (quantity1 >= 20) {
            price[1] = price[1] - price[1] * 0.12;
        } else {
            if (quantity1 >= 10) {
                price[1] = price[1] - price[1] * 0.05;
            } else {
                if (quantity1 >= 5) {
                    price[1] = price[1] - price[1] * 0.02;
                }
            }
        }
        eksprice[1] = price[1] * quantity1;
        if (quantity2 >= 20) {
            price[2] = price[2] - price[2] * 0.12;
        } else {
            if (quantity2 >= 10) {
                price[2] = price[2] - price[2] * 0.05;
            } else {
                if (quantity2 >= 5) {
                    price[2] = price[2] - price[2] * 0.02;
                }
            }
        }
        eksprice[2] = price[2] * quantity2;
        totalharga = eksprice[0] + eksprice[1] + eksprice[2];
        System.out.println(toFixed(totalharga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
