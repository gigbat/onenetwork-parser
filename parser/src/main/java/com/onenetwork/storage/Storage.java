package com.onenetwork.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Storage<E> {
    private final String path;
    private final E value;
}
