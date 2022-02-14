package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Autopart;

import java.util.List;

@RequiredArgsConstructor
public class AutopartServiceImpl implements AutopartService {
    private final List<Autopart> autopartsFromStore;

    @Override
    public Autopart takeAutopartByName(String name) {
        Autopart resAutopart = null;
        for (Autopart autopart : autopartsFromStore) {
            if (autopart.getName().equals(name)) {
                return autopart;
            }
        }
        if (resAutopart != null) {
            autopartsFromStore.remove(resAutopart);
            return resAutopart;
        }
        return null;
    }


    @Override
    public void putAutopart(Autopart autopart) {
        autopartsFromStore.add(autopart);

    }

    @Override
    public boolean hasAutopart(String name) {
        for (Autopart autopart : autopartsFromStore) {
            if (autopart.getName().equals(name))
                return true;
        }
        return false;
    }

    @Override
    public void printAutoparts() {
        for (Autopart autopart: autopartsFromStore){
            System.out.println(autopart.getName() + " " + autopart.getFirm());
        }
    }
}

