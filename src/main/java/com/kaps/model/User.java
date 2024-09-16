package com.kaps.model;

import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.lang.annotation.Documented;
import java.time.LocalDateTime;
import java.util.Set;

//@Documented(collection = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id private String id;
    private String name;
    private String email;
    private Set<Slot> availableSlots;
    //private Set<Pair<LocalDateTime, LocalDateTime>> availableSlots;
}
