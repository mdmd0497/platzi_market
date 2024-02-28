package com.platzimarket.persistence;


import com.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzimarket.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository //@Repository: le indicamos a la clase que es la encarga de interactuar con la base de datos.
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //obtener todos los productos
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
    //obtener producto por sus categorias
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    //obtener productos escados
    public Optional<List<Producto>> getEscasos(int cantidad, boolean estado){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
    //obtener un producto por ID
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    //guardar un producto
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    //borrar un producto por ID
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
