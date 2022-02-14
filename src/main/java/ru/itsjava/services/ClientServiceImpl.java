package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Autopart;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final AutopartService autopartService;

    @Override
    public void buyAutopart() {
        System.out.println("Введите название запчасти");
        String name = scanner.next();
        if(autopartService.hasAutopart(name)){
            autopartService.takeAutopartByName(name);
            System.out.println("Купили запчасть" + name);
        } else {
            System.out.println("Не смогли купить запчасть.... Нет в наличии :(");
        }
    }

    @Override
    public void putAutopart() {
        System.out.println("Введите название запчасти");
        String name = scanner.next();
        System.out.println("Введите фирму производителя");
        String firm = scanner.next();

        Autopart autopart =  new Autopart(name,firm);
        autopartService.putAutopart(autopart);
    }

    @Override
    public void printAutoparts() {
        System.out.println("Уважаемый" + client.getName());
        System.out.println("Вот наши запчасти:");
        autopartService.printAutoparts();
    }
}
