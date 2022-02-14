package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Autopart {
    private final String name;
    private final String firm;
}
