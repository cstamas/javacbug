# javac bug?

Just run: `mvn -V package -e`

I get this:
```
$ mvn -V package -e
Apache Maven 3.9.11 (3e54c93a704957b63ee3494413a2b544fd3d825b)
Maven home: /home/cstamas/.sdkman/candidates/maven/current
Java version: 21.0.8, vendor: Eclipse Adoptium, runtime: /home/cstamas/.sdkman/candidates/java/21.0.8-tem
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.16.7-200.fc42.x86_64", arch: "amd64", family: "unix"
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:boom-reproducer >------------------
[INFO] Building Boom 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ boom-reproducer ---
[INFO] skip non existing resourceDirectory /home/cstamas/tmp/m-compiler-p-or-javac/src/main/resources
[INFO] 
[INFO] --- compiler:3.14.0:compile (default-compile) @ boom-reproducer ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug target 1.8] to target/classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.356 s
[INFO] Finished at: 2025-09-19T14:27:32+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.14.0:compile (default-compile) on project boom-reproducer: Fatal error compiling: Cannot load from object array because "this.hashes" is null -> [Help 1]
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.14.0:compile (default-compile) on project boom-reproducer: Fatal error compiling
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:333)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:261)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:173)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:101)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:906)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:283)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:206)
    at jdk.internal.reflect.DirectMethodHandleAccessor.invoke (DirectMethodHandleAccessor.java:103)
    at java.lang.reflect.Method.invoke (Method.java:580)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:255)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:201)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:361)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:314)
Caused by: org.apache.maven.plugin.MojoExecutionException: Fatal error compiling
    at org.apache.maven.plugin.compiler.AbstractCompilerMojo.execute (AbstractCompilerMojo.java:1229)
    at org.apache.maven.plugin.compiler.CompilerMojo.execute (CompilerMojo.java:225)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:328)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:261)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:173)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:101)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:906)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:283)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:206)
    at jdk.internal.reflect.DirectMethodHandleAccessor.invoke (DirectMethodHandleAccessor.java:103)
    at java.lang.reflect.Method.invoke (Method.java:580)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:255)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:201)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:361)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:314)
Caused by: org.codehaus.plexus.compiler.CompilerException: Cannot load from object array because "this.hashes" is null
    at org.codehaus.plexus.compiler.javac.JavaxToolsCompiler.compileInProcess (JavaxToolsCompiler.java:179)
    at org.codehaus.plexus.compiler.javac.JavacCompiler.performCompile (JavacCompiler.java:214)
    at org.apache.maven.plugin.compiler.AbstractCompilerMojo.execute (AbstractCompilerMojo.java:1226)
    at org.apache.maven.plugin.compiler.CompilerMojo.execute (CompilerMojo.java:225)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:328)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:261)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:173)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:101)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:906)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:283)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:206)
    at jdk.internal.reflect.DirectMethodHandleAccessor.invoke (DirectMethodHandleAccessor.java:103)
    at java.lang.reflect.Method.invoke (Method.java:580)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:255)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:201)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:361)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:314)
Caused by: java.lang.NullPointerException: Cannot load from object array because "this.hashes" is null
    at com.sun.tools.javac.util.UnsharedNameTable.fromValidUtf (UnsharedNameTable.java:97)
    at com.sun.tools.javac.util.UnsharedNameTable.fromUtf (UnsharedNameTable.java:91)
    at com.sun.tools.javac.util.Names.fromUtf (Names.java:455)
    at com.sun.tools.javac.jvm.PoolReader.resolve (PoolReader.java:233)
    at com.sun.tools.javac.jvm.PoolReader$ImmutablePoolHelper.readIfNeeded (PoolReader.java:391)
    at com.sun.tools.javac.jvm.PoolReader.getName (PoolReader.java:185)
    at com.sun.tools.javac.jvm.PoolReader.resolve (PoolReader.java:247)
    at com.sun.tools.javac.jvm.PoolReader$ImmutablePoolHelper.readIfNeeded (PoolReader.java:391)
    at com.sun.tools.javac.jvm.PoolReader.getClass (PoolReader.java:121)
    at com.sun.tools.javac.jvm.ClassReader.readClass (ClassReader.java:2888)
    at com.sun.tools.javac.jvm.ClassReader.readClassBuffer (ClassReader.java:3036)
    at com.sun.tools.javac.jvm.ClassReader.readClassFile (ClassReader.java:3060)
    at com.sun.tools.javac.code.ClassFinder.fillIn (ClassFinder.java:373)
    at com.sun.tools.javac.code.ClassFinder.complete (ClassFinder.java:302)
    at com.sun.tools.javac.code.Symbol.complete (Symbol.java:683)
    at com.sun.tools.javac.code.Symbol$ClassSymbol.complete (Symbol.java:1452)
    at com.sun.tools.javac.code.Symbol.apiComplete (Symbol.java:689)
    at com.sun.tools.javac.jvm.ClassReader$1.getEnclosingType (ClassReader.java:604)
    at com.sun.tools.javac.code.Printer.visitClassType (Printer.java:228)
    at com.sun.tools.javac.code.Printer.visitClassType (Printer.java:52)
    at com.sun.tools.javac.code.Type$ClassType.accept (Type.java:1050)
    at com.sun.tools.javac.code.Printer.visit (Printer.java:136)
    at com.sun.tools.javac.code.Printer.visitTypes (Printer.java:108)
    at com.sun.tools.javac.code.Printer.printMethodArgs (Printer.java:339)
    at com.sun.tools.javac.code.Printer.visitMethodSymbol (Printer.java:381)
    at com.sun.tools.javac.code.Printer.visitMethodSymbol (Printer.java:52)
    at com.sun.tools.javac.code.Symbol$MethodSymbol.accept (Symbol.java:2305)
    at com.sun.tools.javac.code.Printer.visit (Printer.java:147)
    at com.sun.tools.javac.util.AbstractDiagnosticFormatter.formatArgument (AbstractDiagnosticFormatter.java:206)
    at com.sun.tools.javac.util.AbstractDiagnosticFormatter.formatArguments (AbstractDiagnosticFormatter.java:167)
    at com.sun.tools.javac.util.BasicDiagnosticFormatter.formatMessage (BasicDiagnosticFormatter.java:111)
    at com.sun.tools.javac.util.BasicDiagnosticFormatter.formatMessage (BasicDiagnosticFormatter.java:67)
    at com.sun.tools.javac.util.AbstractDiagnosticFormatter.formatSubdiagnostic (AbstractDiagnosticFormatter.java:308)
    at com.sun.tools.javac.util.AbstractDiagnosticFormatter.formatSubdiagnostics (AbstractDiagnosticFormatter.java:285)
    at com.sun.tools.javac.util.BasicDiagnosticFormatter.formatMessage (BasicDiagnosticFormatter.java:128)
    at com.sun.tools.javac.util.BasicDiagnosticFormatter.formatMeta (BasicDiagnosticFormatter.java:186)
    at com.sun.tools.javac.util.BasicDiagnosticFormatter.formatDiagnostic (BasicDiagnosticFormatter.java:100)
    at com.sun.tools.javac.util.AbstractDiagnosticFormatter.format (AbstractDiagnosticFormatter.java:123)
    at com.sun.tools.javac.util.AbstractDiagnosticFormatter.format (AbstractDiagnosticFormatter.java:75)
    at com.sun.tools.javac.util.JCDiagnostic.toString (JCDiagnostic.java:800)
    at com.sun.tools.javac.api.ClientCodeWrapper$DiagnosticSourceUnwrapper.toString (ClientCodeWrapper.java:852)
    at org.codehaus.plexus.compiler.javac.JavaxToolsCompiler.compileInProcess (JavaxToolsCompiler.java:145)
    at org.codehaus.plexus.compiler.javac.JavacCompiler.performCompile (JavacCompiler.java:214)
    at org.apache.maven.plugin.compiler.AbstractCompilerMojo.execute (AbstractCompilerMojo.java:1226)
    at org.apache.maven.plugin.compiler.CompilerMojo.execute (CompilerMojo.java:225)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:328)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:261)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:173)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:101)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:906)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:283)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:206)
    at jdk.internal.reflect.DirectMethodHandleAccessor.invoke (DirectMethodHandleAccessor.java:103)
    at java.lang.reflect.Method.invoke (Method.java:580)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:255)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:201)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:361)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:314)
[ERROR] 
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
[cstamas@angeleyes m-compiler-p-or-javac (main)]$ 
```
