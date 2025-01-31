package com.tainmat.admin.catalogo.application;

import com.tainmat.admin.catalogo.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}