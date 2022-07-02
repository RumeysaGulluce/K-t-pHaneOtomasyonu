public class Kisiler {
    private int ID;
    private String isim;
    private String soyisim;
    private int sifre;
    
    Kisiler(){
        this.ID=0;
        this.isim=" ";
        this.soyisim=" ";
        this.sifre=0;     
    }
    
    Kisiler(int ID,String isim,String soyisim,int sifre){
        this.ID=ID;
        this.isim=isim;
        this.soyisim=soyisim;
        this.sifre=sifre;   
    }

    public int getID(){
        return ID;
    }
   
    public void setID(int ID){
        this.ID = ID;
    }
   
    public String getIsim(){
        return isim;
    }
    
    public void setIsim(String isim){
        this.isim = isim;
    }
   
    public String getSoyisim(){
        return soyisim;
    }
    
    public void setSoyisim(String soyisim){
        this.soyisim = soyisim;
    }
   
    public int getSifre(){
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
    
    public String toString(){
    return "ID:"+ID+"\n"+"isim:"+isim+"\n"+"soyisim:"+soyisim+"\n"+"şifre:"+sifre;
   }
}

    

