
class covid{
    private String NIK;
    private String nama;
    private String alamat;
    private String tgllahir;
    private String kelamin;
    private String golda;

    public covid(String NIK,String nama,String alamat,String tgllahir,String kelamin, String golda){
    this.NIK = NIK;
    this.nama = nama;
    this.alamat = alamat;
    this.tgllahir = tgllahir;
    this.kelamin = kelamin;
    this.golda = golda;
    }

    public String getNIK(){
        return NIK;
    }
    public void setNIK(String NIK){
        this.NIK = NIK;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getTgllahir(){
        return tgllahir;
    }
    public void setTgllahir (String tgllahir){
        this.tgllahir = tgllahir;
    }
    public String getKelamin(){
        return tgllahir;
    }
    public void setKelamin (String kelamin){
        this.kelamin = kelamin;
    }
    public String getGolda(){
        return golda;
    }
    public void setGolda(String golda){
        this.golda = golda;
    }

}
