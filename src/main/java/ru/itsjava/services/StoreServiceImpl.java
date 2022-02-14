package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Autopart;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите ваше ФИО");
        String clintName = scanner.next(); //считали ФИО

        Client client = new Client(clintName, new ArrayList<>()); // создали клиента

        List<Autopart> autopartList = new ArrayList<>(); // создали список
        autopartList.add(new Autopart("автошина", "MICHELIN"));
        autopartList.add(new Autopart("аккумулятор", "DELTA"));
        autopartList.add(new Autopart("термостат", "WEEN"));

        AutopartService autopartService = new AutopartServiceImpl(autopartList);

        ClientService clientService = new ClientServiceImpl(client, scanner, autopartService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();


    }
}
