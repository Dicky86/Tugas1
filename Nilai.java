package tugas1;

public class Nilai {
    String nim;
	String nama;
	float  NilaiMahasiswaAbsen;
	float  NilaiMahasiswaTugas;
	float  NilaiMahasiswaUTS;
	float  NilaiMahasiswaUAS;
	float  NilaiMahasiswaAkhir;
	
	float nilai() {
		float NAkhir = (NilaiMahasiswaAbsen * 10/100) + (NilaiMahasiswaTugas * 20/100) + (NilaiMahasiswaUTS * 30/100) + (NilaiMahasiswaUAS * 40/100);
		return NAkhir;
	}
	
	void CetakNilai() {
		System.out.println("NIM: "+nim);
		System.out.println("Nama: "+nama);
		System.out.println("Nilai Absen [10%]: "+NilaiMahasiswaAbsen);
		System.out.println("Nilai Tugas [20%]: "+NilaiMahasiswaTugas);
		System.out.println("Nilai UTS [30%]: "+NilaiMahasiswaUTS);
		System.out.println("Nilai UAS [40%]: "+NilaiMahasiswaUAS);
		System.out.println("Nilai Akhir: "+nilai());
	}
}
