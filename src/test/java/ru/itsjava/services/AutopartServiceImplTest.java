package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Autopart;

import java.util.ArrayList;
import java.util.List;

public class AutopartServiceImplTest {
    List<Autopart> autopartList = new ArrayList<>();

    @DisplayName("Должен правильно проверять метод есть ли запчасть в списке")
    @Test
    public void shouldHaveCorrectHasAutopartMethod() {
        Autopart expectedAutopart = new Autopart(" автошина", "MICHELIN");
        autopartList.add(expectedAutopart);
        Assertions.assertTrue(autopartList.contains(expectedAutopart));
    }


    @DisplayName("Должен правильно проверять метод взять запчасть (удалять из списка")
    @Test
    public void shouldHaveCorrectTakeAutopartByNameMethod() {
        Autopart expectedAutopart = new Autopart(" автошина", "MICHELIN");
        autopartList.add(expectedAutopart);
        AutopartService service = new AutopartServiceImpl(autopartList);
        Assertions.assertNotEquals(expectedAutopart, service.takeAutopartByName("автошина"));
    }

    @DisplayName("Должен правильно проверять метод положить запчасть (добавить в список)")
    @Test
    public void shouldHaveCorrectPutAutopartMethod() {
        Autopart expectedAutopart1 = new Autopart(" автошина", "MICHELIN");
        Autopart expectedAutopart2 = new Autopart(" свеча_зажигания", "BOSCH");

        autopartList.add(expectedAutopart1);
        autopartList.add(expectedAutopart2);
        Assertions.assertEquals(expectedAutopart1, autopartList.get(0));
        Assertions.assertEquals(expectedAutopart2, autopartList.get(1));
    }

    @DisplayName("Должен правильно проверять метод напечатать список запчастей")
    @Test
    public void shouldHaveCorrectPrintAutopartsMethod() {
        Autopart expectedAutopart = new Autopart(" автошина", "MICHELIN");
        autopartList.add(expectedAutopart);
        Assertions.assertEquals(expectedAutopart, autopartList.get(0));
    }
}


