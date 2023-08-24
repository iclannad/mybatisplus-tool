package org.example;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class User {
    String name;

    List<String> ids;

}
