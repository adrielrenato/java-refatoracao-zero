package br.com.alura.command;

import br.com.alura.infra.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsDoAbrigoCommand implements Command {
    @Override
    public void execute() {
        try {
            var client = new ClientHttpConfiguration();
            var petService = new PetService(client);

            petService.importarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
