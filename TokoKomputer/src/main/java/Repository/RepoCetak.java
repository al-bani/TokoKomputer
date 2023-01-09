/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

/**
 *
 * @author alzildan
 */
public interface RepoCetak<D, I> {
    I hitungTotalPem();
    I hitungTotalProd();
    I hitungTotalPes();
    D hitungKeuntungan();
    I hitungJumPes();
    D hitungTotalHarga();
}
