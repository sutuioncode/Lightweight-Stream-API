package com.annimon.stream.operator;

import com.annimon.stream.LsaIterator;
import com.annimon.stream.function.Supplier;

public class ObjGenerate<T> extends LsaIterator<T> {

    private final Supplier<T> supplier;

    public ObjGenerate(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public T nextIteration() {
        return supplier.get();
    }
}