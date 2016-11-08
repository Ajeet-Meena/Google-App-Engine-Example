package com.example.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by Ajeet Kumar Meena on 06-11-2016.
 */

@Entity
public class Auther {
    @Id
    private Long id;
    String name;

}
