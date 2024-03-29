/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
 * @author Ramzi
 */
public interface CRUDRepoPesanan<T, ID, I> {
    List<T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(int id);
    ID delete(int id);
    List<T> findKodeProd();
    List<T> findUserPem();
    I userPayment(String kodeProd);
    I getSelisihKodeProd(int kodePes);
}
