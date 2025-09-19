package org.apache.maven.boom;

import org.eclipse.aether.util.graph.manager.ClassicDependencyManager;

public class MyClass {
    private final ClassicDependencyManager foo;

    public MyClass() {
        this.foo = new ClassicDependencyManager(true, true, null);
    }
}
