package org.quiltmc.asmr.processor.tree;

import java.util.Arrays;
import java.util.List;

public class AsmrParameterNode extends AsmrNode<AsmrParameterNode> {
    private final AsmrValueNode<String> name = new AsmrValueNode<>(this);
    private final AsmrValueListNode<Integer> modifiers = new AsmrValueListNode<>(this);

    private final List<AsmrNode<?>> children = Arrays.asList(name, modifiers);

    public AsmrParameterNode(AsmrNode<?> parent) {
        super(parent);
    }

    @Override
    AsmrParameterNode newInstance(AsmrNode<?> parent) {
        return new AsmrParameterNode(parent);
    }

    @Override
    public List<AsmrNode<?>> children() {
        return children;
    }

    @Override
    void copyFrom(AsmrParameterNode other) {
        name.copyFrom(other.name);
        modifiers.copyFrom(other.modifiers);
    }

    public AsmrValueNode<String> name() {
        return name;
    }

    public AsmrValueListNode<Integer> modifiers() {
        return modifiers;
    }
}
