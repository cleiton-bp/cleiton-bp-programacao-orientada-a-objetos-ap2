package com.example.trabalho_ap2.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.trabalho_ap2.models.ClientModel;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {
    private List<ClientModel> clients = new ArrayList<>();

    public List<ClientModel> findAll() {
        return clients;
    }

    public Optional<ClientModel> findById(Long id) {
        return clients.stream().filter(client -> client.getId().equals(id)).findFirst();
    }

    public void save(ClientModel client) {
        clients.add(client);
    }

    public void update(ClientModel modifiedClient) {
        clients.replaceAll(client -> client.getId().equals(modifiedClient.getId()) ? modifiedClient : client);
    }

    public void deleteById(Long id) {
        clients.removeIf(client -> client.getId().equals(id));
    }

    public List<ClientModel> findByAge(int age) {
        List<ClientModel> result = new ArrayList<>();
        for (ClientModel client : clients) {
            if (client.getAge() == age)
                result.add(client);
        }
        return result;
    }
}
