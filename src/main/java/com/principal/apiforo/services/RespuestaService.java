package com.principal.apiforo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.principal.apiforo.dto.respuesta.RespuestaRequestDTO;
import com.principal.apiforo.dto.respuesta.RespuestaResponseDTO;
import com.principal.apiforo.repositories.RespuestaRepository;

@Service
public class RespuestaService implements IServices<RespuestaRequestDTO, RespuestaResponseDTO> {

    @Autowired
    private RespuestaRepository respuestaRepository;

    public RespuestaResponseDTO actualizar(Long id, RespuestaRequestDTO nuevosDatos) {
        return null;
    }

    public void eliminar(Long id) {
        
    }

    public RespuestaResponseDTO encontrar(Long id) {
        return null;
    }

    public RespuestaResponseDTO guardar(RespuestaRequestDTO nuevoRegistro) {
        

        return null;
    }

    public List<RespuestaResponseDTO> listar() {
        return null;
    }


    




}

