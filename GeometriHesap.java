/*
 * Ad Soyad: [Enes Aladağ]
 * Ogrenci No: [250541128]
 * Tarih: [07.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar
        return side * side;
    }

    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        // Cevre = 4 * kenar
        return 4 * side;
    }

    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik
        return width * height;
    }

    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)
        return 2 * (width + height);
    }

    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        return Math.PI * radius * radius;
    }

    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r
        return 2 * Math.PI * radius;
    }

    // METOT 7: Ucgen alani
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2
        return (base * height) / 2;
    }

    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();

        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();

        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();

        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();

        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);

        double rectArea = calculateRectangleArea(rectWidth, rectHeight);
        double rectPerimeter = calculateRectanglePerimeter(rectWidth, rectHeight);

        double circleArea = calculateCircleArea(radius);
        double circleCircumference = calculateCircleCircumference(radius);

        double triangleArea = calculateTriangleArea(base, height);
        double trianglePerimeter = calculateTrianglePerimeter(side1, side2, side3);

        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        System.out.printf("Alan: %.2f cm²\n", squareArea);
        System.out.printf("Cevre: %.2f cm\n", squarePerimeter);

        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.printf("Alan: %.2f cm²\n", rectArea);
        System.out.printf("Cevre: %.2f cm\n", rectPerimeter);

        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        System.out.printf("Alan: %.2f cm²\n", circleArea);
        System.out.printf("Cevre: %.2f cm\n", circleCircumference);

        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        System.out.printf("Alan: %.2f cm²\n", triangleArea);
        System.out.printf("Cevre: %.2f cm\n", trianglePerimeter);

        System.out.println("========================================");

        input.close();
    }
}

 ODEV JAVA KODU
     
     public class GeometriHesap {

    // 1️⃣ Kare Alanı
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // 2️⃣ Kare Çevresi
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // 3️⃣ Dikdörtgen Alanı
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // 4️⃣ Dikdörtgen Çevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // 5️⃣ Daire Alanı
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 6️⃣ Daire Çevresi
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // 7️⃣ Üçgen Alanı
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    // 8️⃣ Üçgen Çevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // 🔹 Örnek değerler
        double squareSide = 5.0;       // Kare kenarı
        double rectWidth = 4.0;        // Dikdörtgen kısa kenar
        double rectHeight = 7.0;       // Dikdörtgen uzun kenar
        double radius = 3.0;           // Daire yarıçapı
        double triBase = 6.0;          // Üçgen tabanı
        double triHeight = 4.0;        // Üçgen yüksekliği
        double side1 = 5.0, side2 = 6.0, side3 = 7.0; // Üçgen kenarları

        // 🔹 Hesaplamalar
        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);

        double rectArea = calculateRectangleArea(rectWidth, rectHeight);
        double rectPerimeter = calculateRectanglePerimeter(rectWidth, rectHeight);

        double circleArea = calculateCircleArea(radius);
        double circleCircumference = calculateCircleCircumference(radius);

        double triangleArea = calculateTriangleArea(triBase, triHeight);
        double trianglePerimeter = calculateTrianglePerimeter(side1, side2, side3);

        // 🔹 Sonuçlar
        System.out.println("=== GEOMETRİK HESAPLAMA SONUÇLARI ===");

        System.out.printf("\nKARE (kenar: %.1f cm)\n", squareSide);
        System.out.printf("Alan: %.2f cm²\n", squareArea);
        System.out.printf("Çevre: %.2f cm\n", squarePerimeter);

        System.out.printf("\nDİKDÖRTGEN (%.1f x %.1f cm)\n", rectWidth, rectHeight);
        System.out.printf("Alan: %.2f cm²\n", rectArea);
        System.out.printf("Çevre: %.2f cm\n", rectPerimeter);

        System.out.printf("\nDAİRE (yarıçap: %.1f cm)\n", radius);
        System.out.printf("Alan: %.2f cm²\n", circleArea);
        System.out.printf("Çevre: %.2f cm\n", circleCircumference);

        System.out.printf("\nÜÇGEN (taban: %.1f cm, yükseklik: %.1f cm)\n", triBase, triHeight);
        System.out.printf("Alan: %.2f cm²\n", triangleArea);
        System.out.printf("Çevre: %.2f cm\n", trianglePerimeter);

        System.out.println("======================================");
    }
}

