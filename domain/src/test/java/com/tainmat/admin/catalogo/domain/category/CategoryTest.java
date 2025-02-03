package com.tainmat.admin.catalogo.domain.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void givenAValidParams_whenCallNewCategory_ThenInstantiateACategory() {
        final var expectedName = "filmes";
        final var expectedDescription = "A categoria mais assistidas";
        final var expectesIsActive = true;
        Category.newCategory(expectedName, expectedDescription, expectesIsActive);

        final var actualCategory = Category.newCategory(expectedName, expectedDescription, expectesIsActive);

        Assertions.assertNotNull(actualCategory);
        Assertions.assertNotNull(actualCategory.getId());
        Assertions.assertEquals(expectedName, actualCategory.getName());
        Assertions.assertEquals(expectedDescription, actualCategory.getDescription());
        Assertions.assertEquals(expectesIsActive, actualCategory.isActive());
        Assertions.assertNotNull(actualCategory.getCreatedAt());
        Assertions.assertNotNull(actualCategory.getUpdatedAt());
        Assertions.assertNull(actualCategory.getDeletedAt());

    }
}
