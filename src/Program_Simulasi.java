import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


@SuppressWarnings("ALL")
public class Program_Simulasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));

        String Decision = "Y";
        int[] data = new int[5];

        Scanner scData = new Scanner(System.in);
        Random numberRandom = new Random();
        int min, max, result, choose, x, i, y;

        while (Decision.equals("Y") || Decision.equals("y")) {
            System.out.println("\nSelamat Datang di Program Simulasi");
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Buble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Buble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.println("Masukan Pilihan Anda : ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Batas Bawah : ");
                    min = sc.nextInt();
                    System.out.print("Batas Atas : ");
                    max = sc.nextInt();

                    for (int counter = 0; counter < data.length; counter++) {
                        result = min + numberRandom.nextInt(max - min);
                        data[counter] = result;
                    }
                    for (int counter = 0; counter < data.length; counter++) {
                        System.out.print(" " + data[counter]);
                    }
                    System.out.println("");
                    break;

                case 2: {
                    int pass = 1;
                    for (y = 0; y < 4; y++) {
                        System.out.println("");
                        System.out.println("Pass " + pass);
                        for (int counter = 0; counter < data.length; counter++) {
                            System.out.print(" " + data[counter]);
                        }
                        System.out.println("");

                        for (i = 0; i < 4; i++) {
                            if (data[i] > data[i + 1]) {
                                x = data[i];
                                data[i] = data[i + 1];
                                data[i + 1] = x;

                                for (int counter = 0; counter < data.length; counter++) {
                                    System.out.print(" " + data[counter]);
                                }
                                System.out.println("");
                            } else {
                                for (int counter = 0; counter < data.length; counter++) {
                                    System.out.print(" " + data[counter]);
                                }
                                System.out.println("");
                            }
                        }
                        System.out.println("");
                        System.out.println("Result of pass " + pass);
                        for (int counter = 0; counter < data.length; counter++) {
                            System.out.print(" " + data[counter]);
                        }
                        System.out.println("");
                        pass = pass + 1;
                    }
                    break;
                }
                case 3:
                    for (x = 0; x < 5 - 1; x++) {
                        System.out.println("pass : " + (x + 1));
                        for (y = 0; y < 5; y++) {
                            System.out.print(data[y] + " ");
                        }
                        System.out.println("    Apakah Data " + data[x] + "  Sudah benar pada urutannya?");

                        boolean swap = false;
                        int index = 0;
                        min = data[x];
                        String pesan = "    Tidak Ada Pertukaran";

                        for (y = x + 1; y < 5; y++) {
                            if (min > data[y]) {
                                swap = true;
                                index = y;
                                min = data[y];
                            }
                        }

                        if (swap == true) {
                            pesan = "   Data " + data[x] + " di tukar dengan Data " + data[index];
                            int temp = data[x];
                            data[x] = data[index];
                            data[index] = temp;
                        }

                        for (y = 0; y < 5; y++) {
                            System.out.print(data[y] + " ");
                        }
                        System.out.println(pesan + "\n");
                    }
                    break;

                case 4: {
                    int pass = 1;
                    for (y = 0; y < 4; y++) {
                        System.out.println("");
                        System.out.println("pass " + pass);

                        for (int counter = 0; counter < data.length; counter++) {
                            System.out.print(" " + data[counter]);
                        }
                        System.out.println("");

                        for (i = 0; i < 4; i++) {
                            if (data[i] < data[i + 1]) {
                                x = data[i];
                                data[i] = data[i + 1];
                                data[i + 1] = x;

                                for (int counter = 0; counter < data.length; counter++) {
                                    System.out.print(" " + data[counter]);
                                }
                                System.out.println("");
                            } else {
                                for (int counter = 0; counter < data.length; counter++) {
                                    System.out.print(" " + data[counter]);
                                }
                                System.out.println("");
                            }
                        }
                        System.out.println("");
                        System.out.println("Result of Pass " + pass);
                        for (int counter = 0; counter < data.length; counter++) {
                            System.out.print(" " + data[counter]);
                        }
                        System.out.println("");
                        pass = pass + 1;
                    }
                    break;
                }
                case 5:
                    for (x = 0; x < 5 - 1; x++) {
                        System.out.println("Pass " + (x + 1));
                        for (y = 0; y < 5; y++) {
                            System.out.print(data[y] + " ");
                        }
                        System.out.println("    Apakah Data " + data[x] + " Sudah benar pada urutannya?");

                        boolean swap = false;
                        int index = 0;
                        max = data[x];
                        String pesan = "    Tidak Ada Pertukaran";

                        for (y = x + 1; y < 5; y++) {
                            if (max < data[y]) {
                                swap = true;
                                index = y;
                                max = data[y];
                            }
                        }
                        if (swap == true) {
                            pesan = "   Data " + data[x] + " ditukar dengan Data " + data[index];
                            int temp = data[x];
                            data[x] = data[index];
                            data[index] = temp;
                        }
                        for (y = 0; y < 5; y++) {
                            System.out.print(data[y] + " ");
                        }
                        System.out.print(pesan + "\n");
                    }
                    break;
                case 6: {
                    System.exit(0);
                }
                break;
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
            System.out.print("Kembali ke Menu Tampilan ? Y/T : ");
            try {
                Decision = input2.readLine();
            } catch (IOException e) {
                System.out.println("Gagal Membaca Perintah");
            }
        }
    }
}