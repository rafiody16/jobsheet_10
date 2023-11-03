import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menuItem;
        boolean running = true;
        String nama, next;
        String [][] penonton = new String[4][2];

        do{
            System.out.println("Main Menu:");
            System.out.println("1. Input data");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("(int) Pilih Menu: ");
            menuItem = sc.nextInt();
            sc.nextLine();

            switch (menuItem)
            {
                case 1:
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if ((baris - 1) >= penonton.length || (kolom - 1) >= penonton[baris - 1].length)
                        {
                            System.out.println("Kursi tidak tersedia");
                        }
                        else if(penonton[baris - 1][kolom - 1] ==  null)
                        {
                            penonton [baris - 1][kolom - 1] = nama;
                        }
                        else
                        {
                            System.out.println("PERHATIAN KURSI SUDAH TERISI!!");
                            continue;
                        }
                        break;
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) 
                    {
                        break;
                    }
                }
                break;
                
                case 2:
                for (int i = 0; i < penonton.length; i++)
                {
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": ");
                    boolean isNext = false;
                    for (String x : penonton[i])
                    {
                        if (isNext) {
                            System.out.print(", ");
                        }
                        System.out.print((x == null)? "***": x);
                        isNext =true;
                    }
                    System.out.println();
                }
                break;

                case 3:
                running = false;
                break;

                default:
                System.out.println("Inputan tidak valid.");
                break;
            }
        }
        while (running);
        System.out.println("\n\nProgram Berhenti");
    }
}
