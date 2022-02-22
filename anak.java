/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Inas
 */
public class anak extends ayah {
    double nilaimax=99.9;
    String nama="Dina";
    int age=17;
    
    //tambahan (latihan 2)
    public void setnama(String nama){
        this.nama=nama;
    }
    public void Cetak(){
        System.out.println("Anak ini memiliki sifat "+super.sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+" tahun");
        System.out.println("dengan tinggi badan "+super.Tb+" cm");
        //tambahan (latihan 2)
        super.hobi();
    }
}
