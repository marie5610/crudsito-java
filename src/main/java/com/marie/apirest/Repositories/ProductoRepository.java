package com.marie.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marie.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
