public class MakhlukHidup {

    private String nama;       
    private String jenis;
    public double berat = -1.0;  
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public MakhlukHidup(String nama) { 
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public MakhlukHidup(String nama, String jenis, int umur, double berat) { 
        this.nama = nama;  
        this.jenis = jenis; 
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama; 
        this.jenis = other.jenis; 
        this.umur = other.umur; 
        this.berat = other.berat;
    }


    public void setUmur(int umur) { 
        if (umur > 0)
            this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama; 
    }

    public String getInfo() { 
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}