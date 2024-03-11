public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private int bolumKodu = 104;
    private String girisSirasi = "001";

    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
    }

    public Ogrenci(String ad, String bolum, double gano, String girisSirasi, int girisYili) {
        this.ad = ad;
        this.bolum = bolum;
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Girilen Gano Değeri 0-4 Aralığında değildir!");
        }
        this.gano = gano;
        this.girisSirasi = girisSirasi;
        this.girisYili = girisYili;
    }

    public Ogrenci(Ogrenci ogrenci) {
        this.ad = ogrenci.ad;
        this.bolum = ogrenci.bolum;
        if (ogrenci.gano < 0 && ogrenci.gano > 4) {
            throw new IllegalArgumentException("Girilen Gano Değeri 0-4 Aralığında değildir!");
        }
        this.gano = ogrenci.gano;
        this.girisYili = ogrenci.girisYili;
    }

    public Ogrenci(int girisYili, double gano) {
        this.girisYili = girisYili;
        this.gano = gano;
    }

    public Ogrenci() {

    }

    public double harcHesapla(int dersSayisi) {
        //bir ders ücreti default 240 tl
        return dersSayisi * 240;
    }

    public double harcHesapla(int dersSayisi, double girisYili) {
        return dersSayisi * 240 + girisYili * 240;
    }

    public String ogrenciNoOlustur() {
        return this.ogrNo = (this.girisYili + "" + this.bolumKodu + this.girisSirasi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }
}