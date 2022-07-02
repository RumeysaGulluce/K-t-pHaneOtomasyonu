import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;


public  class Yonetici extends Kisiler{
    private Object barkodNumarasi;
    private String kitapIsmi;
    private String yazar;
    private String tur;
    private int yayinYili;
    private String dil;
    private int sayfaSayisi;
    
    Yonetici(){
        super();
        barkodNumarasi=0;
        kitapIsmi=null;
        yazar=null;
        tur=null;
        yayinYili=0;
        dil=null;
        sayfaSayisi=0;
    }
    
    Yonetici(int barkodNumarasi,String kitapIsmi,String yazar,String tur,int yayinYili,String dil,int sayfaSayisi){
        this.barkodNumarasi=barkodNumarasi;
        this.kitapIsmi=kitapIsmi;
        this.yazar=yazar;
        this.tur=tur;
        this.yayinYili=yayinYili;
        this.dil=dil;
        this.sayfaSayisi=sayfaSayisi;     
    }
    
    public String getKitapIsmi(){
        return kitapIsmi;
    }

    public void setKitapIsmi(String kitapIsmi){
        this.kitapIsmi = kitapIsmi;
    }

    public String getYazar(){
        return yazar;
    }

    public void setYazar(String yazar){
        this.yazar = yazar;
    }

    public String getTur(){
        return tur;
    }

    public void setTur(String tur){
        this.tur = tur;
    }

    public String getDil(){
        return dil;
    }

    public void setDil(String dil){
        this.dil = dil;
    }

    public int getYayinYili(){
        return yayinYili;
    }

    public void setYayinYili(int yayinYili){
        this.yayinYili= yayinYili;
    }

    public Object getBarkodNumarasi(){
        return barkodNumarasi;
    }

    public void setBarkodNumarasi(int barkodNumarasi) {
        this.barkodNumarasi =barkodNumarasi;
    }

    public int getSayfaSayisi(){
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi){
        this.sayfaSayisi = sayfaSayisi;
    }
    
    public void dosya_okuma(ArrayList list,String dosyaAdi) throws FileNotFoundException{        
        String dosyaadi=dosyaAdi;
        Scanner sc = new Scanner(new File(dosyaadi+".txt"));
                try{
                    while(sc.hasNextLine()){  
                        list.add(sc.nextLine());                  
                    }//end of while
                    sc.close();
                }//end of try
                catch(Exception e){
                    e.printStackTrace();
                }
    }
    public void dosyaya_yaz(ArrayList list,String dosyaAdi) throws IOException {
        String dosyaadi=dosyaAdi;
        File file=new File(dosyaadi+".txt");
            try{   
            if(!file.exists()){
            Object createNewFile = file.createNewFile();
            }
                try (PrintWriter pw = new PrintWriter(file)) {
                    for(int i=0;i<list.size();i++){
                    pw.println(list.get(i));
                    }
                    pw.close();    
                }    
            }catch(IOException e){
                e.printStackTrace();
            }        
    }
    

    public void KitapEkleme(String kitapIsmi,String yazar,String türü,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException, IOException{
        Yonetici nesne=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        nesne.dosya_okuma(arraylist,"kitaplar"); 

        for(int i=0;i<=arraylist.size();i=i+8){
            Object borkodno=arraylist.get(i);
            int id=Integer.parseInt((String) borkodno);
            if(!(id==arraylist.indexOf(arraylist.get(i))/8)){
                //int no=i/7;
                this.barkodNumarasi=i/8;
                arraylist.add(i,this.barkodNumarasi);
                arraylist.add(i+1,kitapIsmi);
                arraylist.add(i+2,yazar);
                arraylist.add(i+3,türü);
                arraylist.add(i+4,yayinYili);
                arraylist.add(i+5,dil);
                arraylist.add(i+6,sayfaSayisi);
                arraylist.add(i+7,"Rafta");
                break;
                //System.out.println(id +"degeri var");
            }
            else{
                if(i==arraylist.size()-8){
                int sayac=arraylist.size()-8;
                Object borkod=arraylist.get(sayac);
                int idd=Integer.parseInt((String) borkod);
                this.barkodNumarasi=idd+1;
                arraylist.add(this.barkodNumarasi);
                arraylist.add(kitapIsmi);
                arraylist.add(yazar);
                arraylist.add(türü);
                arraylist.add(yayinYili);
                arraylist.add(dil);
                arraylist.add(sayfaSayisi);
                arraylist.add("Rafta");
                break;                
                }
            } 
        }
        nesne.dosyaya_yaz(arraylist,"kitaplar"); 
    }
              
        
    public void kitapSilme(String silinecek) throws FileNotFoundException, IOException{
        Yonetici nesne=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        nesne.dosya_okuma(arraylist,"kitaplar");

        for(int i=0;i<arraylist.size();i=i+8){
            if(arraylist.get(i).equals(silinecek)){
                arraylist.remove(i);
                arraylist.remove(i);
                arraylist.remove(i);
                arraylist.remove(i);
                arraylist.remove(i);
                arraylist.remove(i);
                arraylist.remove(i);
                arraylist.remove(i);
        }
        }
        nesne.dosyaya_yaz(arraylist,"kitaplar");
    }
    
    public void KitapGuncelleme(String barkodno,String kitapIsmi,String yazar,String tur,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException, IOException{
        Yonetici obj=new Yonetici();
        ArrayList list=new ArrayList<>();
        obj.dosya_okuma(list,"kitaplar");
 
        for(int i=0;i<list.size();i+=8){
            if(barkodno.equals(list.get(i)) && list.indexOf(barkodno)!=-1){
                int index=i;
                list.set(index+1, kitapIsmi);
                list.set(index+2, yazar);
                list.set(index+3,tur);
                list.set(index+4, yayinYili);
                list.set(index+5, dil);
                list.set(index+6, sayfaSayisi);
            }        
        }
        obj.dosyaya_yaz(list,"kitaplar");        
    }
    
    public void kitapIdArama(String id,String ad,String yazar,String tur,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException{
        Yonetici yonetici=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        yonetici.dosya_okuma(arraylist,"kitaplar");

        for(int i=0;i<arraylist.size();i=i+8){ 
            if(arraylist.get(i).equals(id)){
                id=(String) arraylist.get(i);
                ad=(String) arraylist.get(i+1);
                yazar=(String) arraylist.get(i+2);
                tur=(String) arraylist.get(i+3);
                yayinYili=(String) arraylist.get(i+4);
                dil=(String) arraylist.get(i+5);
                sayfaSayisi=(String) arraylist.get(i+6);              
            } 
        }
    }

    public void kitapIsminegoreAra(String id,String ad,String yazar,String tur,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException{
        Yonetici yonetici=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        yonetici.dosya_okuma(arraylist,"kitaplar");

        for(int i=1;i<arraylist.size();i=i+8){ 
            if(arraylist.get(i).equals(ad)){
                id=(String) arraylist.get(i-1);
                ad=(String) arraylist.get(i);
                yazar=(String) arraylist.get(i+1);
                tur=(String) arraylist.get(i+2);
                yayinYili=(String) arraylist.get(i+3);
                dil=(String) arraylist.get(i+4);
                sayfaSayisi=(String) arraylist.get(i+5);
            }
        }
    }
    
    public void yazaragoreAra(String id,String ad,String yazar,String tur,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException{ 
        Yonetici yonetici=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        yonetici.dosya_okuma(arraylist,"kitaplar");

        for(int i=2;i<arraylist.size();i=i+8){ 
            if(arraylist.get(i).equals(yazar)){
                id=(String) arraylist.get(i-2);
                ad=(String) arraylist.get(i-1);
                yazar=(String) arraylist.get(i);
                tur=(String) arraylist.get(i+1);
                yayinYili=(String) arraylist.get(i+2);
                dil=(String) arraylist.get(i+3);
                sayfaSayisi=(String) arraylist.get(i+4);
            } 
        }
    } 
    
    public void kitapTürünegoreAra(String id,String ad,String yazar,String tur,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException{
        Yonetici yonetici=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        yonetici.dosya_okuma(arraylist,"kitaplar");

        for(int i=3;i<arraylist.size();i=i+8){ 
            if(arraylist.get(i).equals(tur)){
                id=(String) arraylist.get(i-3);
                ad=(String) arraylist.get(i-2);
                yazar=(String) arraylist.get(i-1);
                tur=(String) arraylist.get(i);
                yayinYili=(String) arraylist.get(i+1);
                dil=(String) arraylist.get(i+2);
                sayfaSayisi=(String) arraylist.get(i+3);
            } 
        }      
    }

    public void yayinYilinagoreAra(String id,String ad,String yazar,String tur,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException{
        Yonetici yonetici=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        yonetici.dosya_okuma(arraylist,"kitaplar");

        for(int i=4;i<arraylist.size();i=i+8){ 
            if(arraylist.get(i).equals(yayinYili)){
                id=(String) arraylist.get(i-4);
                ad=(String) arraylist.get(i-3);
                yazar=(String) arraylist.get(i-2);
                tur=(String) arraylist.get(i-1);
                yayinYili=(String) arraylist.get(i);
                dil=(String) arraylist.get(i+1);
                sayfaSayisi=(String) arraylist.get(i+2);
            }
        }
    }
    
    public void kitapDileGöreAra(String id,String ad,String yazar,String tur,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException{
        Yonetici yonetici=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        yonetici.dosya_okuma(arraylist,"kitaplar");

        for(int i=5;i<arraylist.size();i=i+8){ 
            if(arraylist.get(i).equals(dil)){
                id=(String) arraylist.get(i-5);
                ad=(String) arraylist.get(i-4);
                yazar=(String) arraylist.get(i-3);
                tur=(String) arraylist.get(i-2);
                yayinYili=(String) arraylist.get(i-1);
                dil=(String) arraylist.get(i);
                sayfaSayisi=(String) arraylist.get(i+1);
            } 
        }
    }

    public void sayfaSayisinagoreAra(String id,String ad,String yazar,String tur,String yayinYili,String dil,String sayfaSayisi) throws FileNotFoundException{
        Yonetici yonetici=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        yonetici.dosya_okuma(arraylist,"kitaplar");
        
        for(int i=6;i<arraylist.size();i=i+8){ 
            if(arraylist.get(i).equals(sayfaSayisi)){
                id=(String) arraylist.get(i-6);
                ad=(String) arraylist.get(i-5);
                yazar=(String) arraylist.get(i-4);
                tur=(String) arraylist.get(i-3);
                yayinYili=(String) arraylist.get(i-2);
                dil=(String) arraylist.get(i-1);
                sayfaSayisi=(String) arraylist.get(i);
            } 
        }
    }
 
    public void KullaniciEkle(String adi,String soyadi, String bolum,String sinif) throws FileNotFoundException, IOException{
        Yonetici obj= new Yonetici();
        ArrayList list = new ArrayList<>();
        obj.dosya_okuma(list,"kisiler");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object id=list.get(i);
            ydizi.add(id);
        }
        
        ArrayList ydizi2=new ArrayList<>();
        for(int i=1;i<11;i++){
            Object id=String.valueOf(i);
            ydizi2.add(id);
        }
        
        ydizi.removeAll(ydizi2);
        int index=0; 
        for(int i=0;i<41;i+=4){ 
            if(list.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }
        
        ArrayList dizi=new ArrayList<>();
        for(int i=index;i<list.size();i+=9){
            Object id=list.get(i);
            dizi.add(id);
        }
        int a= (list.size()-9)/9+10;
        
        ArrayList dizi2=new ArrayList<>();
        for(int i=11;i<a+1;i++){
            Object id=String.valueOf(i);
            dizi2.add(id);
        }
        dizi2.removeAll(dizi);
        
        if(dizi.containsAll(dizi2)){
            list.add(a+1);
            list.add(adi);
            list.add(soyadi);
            list.add(0);
            list.add(bolum);
            list.add(sinif);
            list.add(null);
            list.add(null);
            list.add(null);
        }
        else{ 
            
            list.add(dizi2.get(0));
            list.add(adi);
            list.add(soyadi);
            list.add(0);
            list.add(bolum);
            list.add(sinif);
            list.add(null);
            list.add(null);
            list.add(null);
        }
        obj.dosyaya_yaz(list,"kisiler");
    }
    
    public void KullaniciSilme(String ID) throws FileNotFoundException, IOException{
        Yonetici obj=new Yonetici();
        ArrayList list=new ArrayList<>();
        obj.dosya_okuma(list,"kisiler");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object id=list.get(i);
            ydizi.add(id);
        }
        
        ArrayList ydizi2=new ArrayList<>();
        for(int i=1;i<11;i++){
            Object id=String.valueOf(i);
            ydizi2.add(id);
        }
        
        ydizi.removeAll(ydizi2);
        int index=0;
        
        for(int i=0;i<41;i+=4){ 
            if(list.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }
        
        for(int i=index;i<list.size();i+=9){
            if(ID.equals(list.get(i))){
                int index2=i;
                for(int j=0;j<9;j++){
                    list.remove(index2);
                }            
            }
        }
        obj.dosyaya_yaz(list,"kisiler");    
    }
    
    public void KullaniciGuncelleme(String ID,String adi,String soyadi,String bolum,String sinif) throws FileNotFoundException, IOException{
    Yonetici obj=new Yonetici();
        ArrayList list=new ArrayList<>();
        obj.dosya_okuma(list,"kisiler");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object id=list.get(i);
            ydizi.add(id);
        }
        
        ArrayList ydizi2=new ArrayList<>();
        for(int i=1;i<11;i++){
            Object id=String.valueOf(i);
            ydizi2.add(id);
        }       
        ydizi.removeAll(ydizi2);
        int index=0;       
        for(int i=0;i<41;i+=4){ 
            if(list.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }

        for(int i=index;i<list.size();i+=9){
            if(ID.equals(list.get(i)) && list.indexOf(ID)!=-1){
                int index2=i;
                list.set(index2+1, adi);
                list.set(index2+2, soyadi);
                list.set(index2+4, bolum);
                list.set(index2+5, sinif);
            }
        }
        obj.dosyaya_yaz(list,"kisiler");
    } 
    
    public void kullanıcıAra(String id,String adi,String soyadi,String bolum,String sinif) throws FileNotFoundException{
        Yonetici obj = new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        obj.dosya_okuma(arraylist, "kisiler");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object ID=arraylist.get(i);
            ydizi.add(ID);
        }
        
        ArrayList ydizi2=new ArrayList<>();
        for(int i=1;i<11;i++){
            Object ID=String.valueOf(i);
            ydizi2.add(ID);
        }       
        ydizi.removeAll(ydizi2);
        int index=0;       
        for(int i=0;i<41;i+=4){ 
            if(arraylist.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }

        for(int i=index;i<arraylist.size();i=i+9){
            if(arraylist.get(i).equals(id)||arraylist.get(i).equals(id.toUpperCase())||arraylist.get(i).equals(id.toLowerCase())){  
                id=(String) arraylist.get(i);
                adi=(String) arraylist.get(i+1);
                soyadi=(String) arraylist.get(i+2);
                bolum=(String) arraylist.get(i+4);
                sinif=(String) arraylist.get(i+5);
            }          
        }
    }
    
    public void kişiUstundekiKitaplar() throws FileNotFoundException, IOException{       
        Yonetici nesne=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        ArrayList arr=new ArrayList<>();
        nesne.dosya_okuma(arr, "kisiler");
        nesne.dosyaya_yaz(arraylist, "kitaplar");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object id=arr.get(i);
            ydizi.add(id);
        }
        
        ArrayList ydizi2=new ArrayList<>();
        for(int i=1;i<11;i++){
            Object id=String.valueOf(i);
            ydizi2.add(id);
        }
        
        ydizi.removeAll(ydizi2);
        int index=0;    
        for(int i=0;i<41;i+=4){ 
            if(arr.get(i).equals(ydizi.get(0))){
            index=i;
            }
        } 
        
        for(int i=index;i<arr.size();i=i+9){
            if(!(arr.get(i+6).equals("null"))){
                Object book=arr.get(i+6);
                Object kisi=arr.get(i)+" "+arr.get(i+1)+" "+arr.get(i+2)+" "+arr.get(i+3)+" "+arr.get(i+4)+" "+arr.get(i+5);
                System.out.println(book+" ***kitabı alan kişi*** "+kisi);
            }
            if(!(arr.get(i+7).equals("null"))){
                Object book=arr.get(i+7);
                Object kisi=arr.get(i)+" "+arr.get(i+1)+" "+arr.get(i+2)+" "+arr.get(i+3)+" "+arr.get(i+4)+" "+arr.get(i+5);
                System.out.println(book+" ***kitabı alan kişi*** "+kisi);
                 System.out.println();
            }
            if(!(arr.get(i+8).equals("null"))){
                Object book=arr.get(i+8);
                Object kisi=arr.get(i)+" "+arr.get(i+1)+" "+arr.get(i+2)+" "+arr.get(i+3)+" "+arr.get(i+4)+" "+arr.get(i+5);
                System.out.println(book+" ***kitabı alan kişi*** "+kisi);
                 System.out.println();
            }    
        } 
   }
}
