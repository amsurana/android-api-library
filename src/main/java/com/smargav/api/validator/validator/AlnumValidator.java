package com.smargav.api.validator.validator;

import android.content.Context;
import android.text.TextUtils;

import com.smargav.api.R;
import com.smargav.api.validator.AbstractValidator;

/**
 * Validator to check if a field contains only numbers and letters.
 * Avoids having special characters like accents.
 */
public class AlnumValidator extends AbstractValidator {

    private static final int DEFAULT_ERROR_MESSAGE_RESOURCE = R.string.validator_alnum;

    public AlnumValidator(Context c) {
        super(c, DEFAULT_ERROR_MESSAGE_RESOURCE);
    }

    public AlnumValidator(Context c, int errorMessageRes) {
        super(c, errorMessageRes);
    }

    @Override
    public boolean isValid(String text) {
        return TextUtils.isDigitsOnly(text);
    }
}
