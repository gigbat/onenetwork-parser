package com.onenetwork.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FileInfoStorage {
    private final String path;
    private final String xml;
}
