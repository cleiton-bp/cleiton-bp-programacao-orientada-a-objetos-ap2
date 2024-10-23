package com.example.trabalho_ap2.controllers;

import java.util.List;
import java.util.Optional;

import com.example.trabalho_ap2.models.ClientModel;
import com.example.trabalho_ap2.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<ClientModel> getAllClients() {
        return clientService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ClientModel> getClientById(@PathVariable long id) {
        return clientService.findById(id);
    }

    @GetMapping(params = "age")
    public List<ClientModel> getClientsByAge(@RequestParam int age) {
        return clientService.findByAge(age);
    }

    @PostMapping
    public void addClient(@RequestBody ClientModel client) {
        clientService.save(client);
    }

    @PutMapping("/{id}")
    public void updateClient(@PathVariable long id, @RequestBody ClientModel client) {
        clientService.update(id, client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable long id) {
        clientService.deleteById(id);
    }
}
