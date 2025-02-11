package com.tainmat.admin.catalogo.domain.category;

import com.tainmat.admin.catalogo.domain.validation.Error;
import com.tainmat.admin.catalogo.domain.validation.ValidationHandler;
import com.tainmat.admin.catalogo.domain.validation.Validator;

public class CategoryValidator extends Validator {

    public static final int NAME_MIN_LENGHT = 3;
    public static final int NAME_MAX_LENGHT = 255;
    private final Category category;

    protected CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        checkNameConstraints();
    }

    private void checkNameConstraints() {
        final String name = this.category.getName();

        if (name == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
            return;
        }

        if (name.isBlank()) {
            this.validationHandler().append(new Error("'name' should not be empty"));
            return;
        }

        if (name.trim().length() < NAME_MIN_LENGHT || name.length() > NAME_MAX_LENGHT) {
            this.validationHandler().append(new Error("'name' must be between 3 and 255 characters"));
        }
    }
}
