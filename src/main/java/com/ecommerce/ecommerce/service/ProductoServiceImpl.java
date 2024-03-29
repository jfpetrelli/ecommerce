package com.ecommerce.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.model.Producto;
import com.ecommerce.ecommerce.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @SuppressWarnings("null")
    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @SuppressWarnings("null")
    @Override
    public Optional<Producto> get(Integer id) {
        return productoRepository.findById(id);
    }

    @SuppressWarnings("null")
    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

    @SuppressWarnings("null")
    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }


}
