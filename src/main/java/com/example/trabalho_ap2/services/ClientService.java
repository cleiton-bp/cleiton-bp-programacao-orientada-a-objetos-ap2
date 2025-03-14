package com.example.trabalho_ap2.services;

import java.util.List;
import java.util.Optional;

import com.example.trabalho_ap2.models.ClientModel;
import com.example.trabalho_ap2.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<ClientModel> findAll() {
        return clientRepository.findAll();
    }

    public Optional<ClientModel> findById(long id) {
        return clientRepository.findById(id);
    }

    public void save(ClientModel client) {
        clientRepository.save(client);
    }

    public void update(long id, ClientModel client) {
        client.setId(id);
        clientRepository.update(client);
    }

    public void deleteById(long id) {
        clientRepository.deleteById(id);
    }

    public List<ClientModel> findByAge(int age) {
        return clientRepository.findByAge(age);
    }
}
