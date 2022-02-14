package ru.itsjava.services;

import ru.itsjava.domain.Autopart;

public interface AutopartService {
    Autopart takeAutopartByName(String name);
    void putAutopart(Autopart autopart);
    boolean hasAutopart(String name);
    void  printAutoparts();
}
