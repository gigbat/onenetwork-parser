package com.onenetwork.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class DefaultFieldStorage {
    private final String messageType;
    private final String controlIdentifier;
    private final Integer endPositionOfControlIdentifier;
}
