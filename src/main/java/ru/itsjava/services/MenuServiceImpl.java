package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{
    private  final ClientService clientService;
    private  final Scanner scanner;

    @Override
    public void menu() {
        while (true){
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();

            if (menuNum == 1){
                System.out.println("Вы выбрали купить автозапчасть");
                clientService.buyAutopart();
                } else  if (menuNum == 2) {
                System.out.println("Вы выбрали положить автозапчасть");
                clientService.putAutopart();
            } else if (menuNum == 3) {
                System.out.println("Печатаем название запчастей...");
                clientService.printAutoparts();
            }else {
                System.out.println("До встречи");
                break;
            }
        }

    }

    @Override
    public void printMenu() {
        System.out.println("1 - Купить; 2 - Отдать; 3 - Вывод запчастей; Всё остальное выход");
    }
}
