package com.tainmat.admin.catalogo.domain.category;

import java.time.Instant;
import java.util.UUID;

public class Category {

    private String id;
    private String name;
    private String description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private Category(
            final String id,
            final String name,
            final String description,
            final boolean active,
            final Instant createdAt,
            final Instant updatedAt,
            final Instant deletedAt
    ) {
        this.deletedAt = deletedAt;
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public String getDescription() {
        return description;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean aIsActive) {
        final var id = UUID.randomUUID().toString();
        var now = Instant.now();
        return new Category(id, aName, aDescription, aIsActive, now, now, null);
    }
}
