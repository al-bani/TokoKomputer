/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
<<<<<<< HEAD:TokoKomputer/src/main/java/Repository/CRUDRepo.java
 * @author User
 */
public interface  CRUDRepo<T, UsernamePembeli> {
    List<T> findAll();
    UsernamePembeli create(T object);
    UsernamePembeli update(T object);
    T findByUsername(String usernamePembeli);
    UsernamePembeli delete(String usernamePembeli);
}
=======
 * @author alzildan
 * @param <T> Type
 * @param <ID> Identifier
 */
public interface RepoPesanan<T, ID> {
    List<T> findAll(String query);
    List<T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(String id);
    ID delete(String kodeProduk);
}
>>>>>>> 2cd703de5137d38d93e52a02071d6619d5ee5ca0:TokoKomputer/src/main/java/Repository/RepoPesanan.java
