package task3.models;

import task3.Column;

import java.util.UUID;

@task3.Entity
public class Entity {

    @Column(name = "id", primaryKey = true)
    private UUID id;

}