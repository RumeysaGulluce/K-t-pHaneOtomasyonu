
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Uye extends Kisiler {  
    private String bolum;
    private int sinif;   
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat bicim=new SimpleDateFormat("dd.M.yyyy");
    Date tarih=new Date();
    String bugün=(String)bicim.format(tarih);
    

    
    Uye(){
        super();
        bolum=null;
        sinif=0;
    }
    Uye(int ID, String isim ,String soyisim, int sifre, String bolum, int sinif){
       super(ID, isim, soyisim, sifre);
       this.bolum=bolum;
       this.sinif=sinif;
    }
    
    public String getBolum(){
        return bolum;
    }
   
    public void setBolum(String bolum){
        this.bolum = bolum;
    }
    
    public int getSinif(){
        return sinif;
    }
    
    public void setSinif(int sinif){
        this.sinif = sinif;
    }
 
    public void bilgilerimi_düzenle(String ID,String adi,String soyadi,String sifre,String bolum,String sinif) throws FileNotFoundException, IOException{
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
                list.set(index2+3,sifre);
                list.set(index2+4, bolum);
                list.set(index2+5, sinif);
            }        
        }
        obj.dosyaya_yaz(list,"kisiler");
    } 
    
    public void kitapAlma(String id,String barkodNumarasi) throws FileNotFoundException, IOException {       
        Yonetici nesne=new Yonetici();
        ArrayList arraylist=new ArrayList<>();
        nesne.dosya_okuma(arraylist,"kitaplar");
        String kitap=null;        
        
        ArrayList arr=new ArrayList<>();
        nesne.dosya_okuma(arr, "kisiler");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object ID=arr.get(i);
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
            if(arr.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }
        for(int i=index;i<arr.size();i=i+9){
            if(id.equals(arr.get(i))){
                for(int j=0;j<arraylist.size();j=j+8){                    
                    if(arraylist.get(j).equals(barkodNumarasi)){                        
                        if(arraylist.get(j+7).equals("Rafta") && arr.get(i+6).equals("null")){
                            kitap = arraylist.get(j)+" "+arraylist.get(j+1)+" "+arraylist.get(j+2)+" "+arraylist.get(j+3)+" "+arraylist.get(j+4)+" "+arraylist.get(j+5)+" "+arraylist.get(j+6);
                            arr.set(i+6,kitap);
                            arraylist.set(j+7,bugün);
                            Component rootPane = null;
                            JOptionPane.showMessageDialog(rootPane, "Kitap Ödünç Alınmıştır.","Uyarı",0);
                            break;
                        }
                         if(arraylist.get(j+7).equals("Rafta")&&arr.get(i+7).equals("null")){
                            kitap = arraylist.get(j)+" "+arraylist.get(j+1)+" "+arraylist.get(j+2)+" "+arraylist.get(j+3)+" "+arraylist.get(j+4)+" "+arraylist.get(j+5)+" "+arraylist.get(j+6);
                            arr.set(i+7,kitap);
                            arraylist.set(j+7,bugün);
                            Component rootPane = null;
                            JOptionPane.showMessageDialog(rootPane, "Kitap Ödünç Alınmıştır.","Uyarı",0);
                            break;
                        }
                         if(arraylist.get(j+7).equals("Rafta")&&arr.get(i+8).equals("null")){
                            kitap = arraylist.get(j)+" "+arraylist.get(j+1)+" "+arraylist.get(j+2)+" "+arraylist.get(j+3)+" "+arraylist.get(j+4)+" "+arraylist.get(j+5)+" "+arraylist.get(j+6);
                            arr.set(i+8,kitap);
                            arraylist.set(j+7,bugün);
                            Component rootPane = null;
                            JOptionPane.showMessageDialog(rootPane, "Kitap Ödünç Alınmıştır.","Uyarı",0);
                            break;
                        }
                        else{
                            Component rootPane = null;
                            JOptionPane.showMessageDialog(rootPane, "Kitap Ödünç Alınamaz.","Uyarı",0);
                        }
                    }       
                }      
            }
        }     
        nesne.dosyaya_yaz(arraylist,"kitaplar");
        nesne.dosyaya_yaz(arr, "kisiler");
    }
    
    public void elimdekiKitaplariGorüntüle(String id) throws FileNotFoundException{
        
        Yonetici obj = new Yonetici(); 
        ArrayList arr=new ArrayList<>();
        obj.dosya_okuma(arr, "kisiler");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object ID=arr.get(i);
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
            if(arr.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }
        
         for(int i=index;i<arr.size();i=i+9){
            if(arr.get(i).equals(id)){
                //System.out.println(arr.get(i+6)+"\n"+arr.get(i+7)+"\n"+arr.get(i+8));
                break;
            }               
       }                 
    }
    
    public void kitapIadeEtme(String id,String barkodNumarasi) throws FileNotFoundException, IOException{
        Yonetici nesne=new Yonetici();
        Uye nesne2 = new Uye();
        ArrayList arr=new ArrayList<>();
        nesne.dosya_okuma(arr, "kisiler");
        String kitap=null;        
        
        ArrayList arraylist=new ArrayList<>();
        nesne.dosya_okuma(arraylist,"kitaplar");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object ID=arr.get(i);
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
            if(arr.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }                
        for(int i=index;i<arr.size();i=i+9){
           if(id.equals(arr.get(i))){
                for(int j=0;j<arraylist.size();j=j+8){  
                    if(arraylist.get(j).equals(barkodNumarasi)){
                        kitap = arraylist.get(j)+" "+arraylist.get(j+1)+" "+arraylist.get(j+2)+" "+arraylist.get(j+3)+" "+arraylist.get(j+4)+" "+arraylist.get(j+5)+" "+arraylist.get(j+6);
                        if(!(arraylist.get(j+7).equals("Rafta"))&&arr.get(i+6).equals(kitap)){
                            String gecmis=(String)arraylist.get(j+7);
                            nesne2.Tarih(gecmis);
                            arr.set(i+6,"null");
                            arraylist.set(j+7,"Rafta");
                            Component rootPane = null;
                            JOptionPane.showMessageDialog(rootPane, "Kitap İade Edilmiştir.","Uyarı",0);
                            break; 
                        }
                         if(!(arraylist.get(j+7).equals("Rafta"))&&arr.get(i+7).equals(kitap)){
                            String gecmis=(String)arraylist.get(j+7);
                            nesne2.Tarih(gecmis);
                           arr.set(i+7,"null");
                            arraylist.set(j+7,"Rafta");
                            Component rootPane = null;
                            JOptionPane.showMessageDialog(rootPane, "Kitap İade Edilmiştir.","Uyarı",0);
                            break;
                        }
                         if(!(arraylist.get(j+7).equals("Rafta")) &&arr.get(i+8).equals(kitap)){
                            String gecmis=(String)arraylist.get(j+7);
                            nesne2.Tarih(gecmis);
                            arr.set(i+8,"null");
                            arraylist.set(j+7,"Rafta");
                            Component rootPane = null;
                            JOptionPane.showMessageDialog(rootPane, "Kitap İade Edilmiştir.","Uyarı",0);
                            break;
                        }
                    }        
                }
            }
        }
        nesne.dosyaya_yaz(arr, "kisiler");   
        nesne.dosyaya_yaz(arraylist,"kitaplar");    
    }
    
    public void Tarih(String iade) throws IOException {
        long diff = -1;
            try {
                Date dateStart = simpleDateFormat.parse(iade);
                Date dateEnd = simpleDateFormat.parse(bugün);
                diff = Math.round((dateEnd.getTime() - dateStart.getTime()) / (double) 86400000);
            } 
            catch (Exception e) {   
            }
        int i=(int)diff;
        if(i>15){
        double miktar=(i-15)*0.25;
        Component rootPane = null;
        JOptionPane.showMessageDialog(rootPane, "Geciken gün sayısı: "+(i-15)+" Ödeyeceğiniz miktar: "+miktar,"Uyarı",0);       
        }
    }       
}//end of class

