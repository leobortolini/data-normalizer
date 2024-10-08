package br.com.tony.normalizer.rules;

import br.com.tony.normalizer.processor.Result;

public class UpperCaseRule implements Rule<String> {

    @Override
    public Result<String> apply(String value) {
        return new Result<>(value.toUpperCase());
    }
}
