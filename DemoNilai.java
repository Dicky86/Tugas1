package tugas1;

public class DemoNilai {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nilai NilaiMahasiswa = new Nilai();
		NilaiMahasiswa.nim = "2210631170086";
		NilaiMahasiswa.nama = "Abdul Pollet Potek Mullet";
		NilaiMahasiswa.NilaiMahasiswaAbsen = (float) 95;
		NilaiMahasiswa.NilaiMahasiswaTugas = (float) 90;
		NilaiMahasiswa.NilaiMahasiswaUTS = (float) 96;
		NilaiMahasiswa.NilaiMahasiswaUAS = (float) 98;
		NilaiMahasiswa.CetakNilai();
		
	}
}
