package primaputraagusantara;

import java.util.Scanner;

public class UTS_2226250130P 
{
	public static void main(String[] args) 
	{
		//DEKLARASI VARIABEL
		Scanner input = new Scanner(System.in);
		String nama = null, npm = null, predikat = null, kelulusan = null;
		int jumlahMahasiswa_Prima = 0, softSkill_Prima = 0, kuis_Prima = 0, tugas_Prima = 0, uts_Prima = 0, uas_Prima = 0;
		double nilaiAkhir_Prima;
		
		System.out.println("----------------------DATA MAHASISWA----------------------");
		
		
		System.out.print("Masukkan Jumlah Mahasiswa : ");
		jumlahMahasiswa_Prima = input.nextInt();
		
		for(int i = 1; i <= jumlahMahasiswa_Prima; i++)
		{
			System.out.println("----------------------------------------------------------");
			System.out.println("Data Mahasiswa Ke -" + i);
			
			System.out.print("Masukkan Nama \t: ");
			nama = input.next();
			
			System.out.print("Masukkan NPM \t: ");
			npm = input.next();
			
			System.out.println("Masukkan Nilai");
			System.out.print("Softskill \t: ");
			softSkill_Prima = input.nextInt();
			
			System.out.print("Kuis \t\t: ");
			kuis_Prima = input.nextInt();
			
			System.out.print("Tugas \t\t: ");
			tugas_Prima = input.nextInt();
			
			System.out.print("UTS \t\t: ");
			uts_Prima = input.nextInt();
			
			System.out.print("UAS \t\t: ");
			uas_Prima = input.nextInt();
			
			nilaiAkhir_Prima = (softSkill_Prima * 0.1) + (kuis_Prima * 0.1) + (tugas_Prima * 0.2) + (uas_Prima * 0.3) + (uas_Prima * 0.3);
			
			
			//===KONDISI PEMBACAAN PREDIKAT
			if(nilaiAkhir_Prima < 46)
			{
				predikat = "E";
			}
			
			else if(nilaiAkhir_Prima >=46 && nilaiAkhir_Prima <56)
			{
				predikat = "D";
			}
			
			else if(nilaiAkhir_Prima >= 56 && nilaiAkhir_Prima < 60)
			{
				predikat = "C";
			}
			
			else if(nilaiAkhir_Prima >= 60 && nilaiAkhir_Prima < 64)
			{
				predikat = "C+";
			}
			
			else if(nilaiAkhir_Prima >= 64 && nilaiAkhir_Prima < 68)
			{
				predikat = "B-";
			}
			
			else if(nilaiAkhir_Prima >= 68 && nilaiAkhir_Prima < 72)
			{
				predikat = "B";
			}
			
			else if(nilaiAkhir_Prima >= 72 && nilaiAkhir_Prima < 76)
			{
				predikat = "B+";
			}
			
			else if(nilaiAkhir_Prima >= 76 && nilaiAkhir_Prima < 80)
			{
				predikat = "A-";
			}
			
			else if(nilaiAkhir_Prima >= 80)
			{
				predikat = "A";
			}
			
			
			//KONDISI STATUS KELULUSAN
			
			if(predikat == "C" || predikat == "D" || predikat == "E")
			{
				kelulusan = "Tidak Lulus";
			}
			
			else
			{
				kelulusan = "Lulus";
			}
			
			System.out.println("Nilai Akhir \t: " + nilaiAkhir_Prima);
			System.out.println("Nilai Huruf \t: " + predikat);
			System.out.println("Status \t\t: " + kelulusan);
			
		}
		
	}
}
