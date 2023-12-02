# steps to reproduce

sbt:scalablytypedbug> cd leaderboardFrontendApp
```text
[info] set current project to leaderboard-frontend (in build file:/Users/florian_witteler/programming/scala/scalablyTypedBug/)
```

sbt:leaderboard-frontend> leaderboardFrontendApp/fastLinkJS

```text
up to date, audited 16 packages in 444ms

3 packages are looking for funding
run `npm fund` for details

found 0 vulnerabilities
[error] stack trace is suppressed; run last stImport for the full output
[error] (stImport) java.lang.NoSuchMethodError: 'scala.collection.mutable.WrappedArray os.list$.apply(os.Path)'
[error] Total time: 1 s, completed 02.12.2023, 13:24:49
```

sbt:leaderboard-frontend> last stImport
```text

[debug] ScalablyTypedConverterExternalNpmPlugin.scala:45 input.asJson.spaces2 {
[debug]   "converterVersion" : "1.0.0-beta43",
[debug]   "conversion" : {
[debug]     "useScalaJsDomTypes" : true,
[debug]     "flavour" : "normal",
[debug]     "outputPackage" : "typings",
[debug]     "enableScalaJsDefined" : {
[debug]       "AllExcept" : {
[debug]         "values" : [
[debug]         ]
[debug]       }
[debug]     },
[debug]     "stdLibs" : [
[debug]       "dom",
[debug]       "es6"
[debug]     ],
[debug]     "expandTypeMappings" : {
[debug]       "AllExcept" : {
[debug]         "values" : [
[debug]           "prop-types",
[debug]           "react",
[debug]           "std"
[debug]         ]
[debug]       }
[debug]     },
[debug]     "ignored" : [
[debug]       "typescript"
[debug]     ],
[debug]     "versions" : {
[debug]       "scala" : "3.3.1",
[debug]       "scalaJs" : "1.13.2"
[debug]     },
[debug]     "organization" : "org.scalablytyped",
[debug]     "enableReactTreeShaking" : {
[debug]       "NoneExcept" : {
[debug]         "values" : [
[debug]         ]
[debug]       }
[debug]     },
[debug]     "enableLongApplyMethod" : false,
[debug]     "privateWithin" : null,
[debug]     "useDeprecatedModuleNames" : false
[debug]   },
[debug]   "wantedLibs" : {
[debug]     "chart.js" : "^4.4.0"
[debug]   }
[debug] } [project => leaderboard-frontend, ms => 922]
[debug] ScalablyTypedConverterExternalNpmPlugin.scala:46 input.packageJsonHash f8ba118e688470093a9969b306e4659a [project => leaderboard-frontend, ms => 941]
[debug] ScalablyTypedConverterExternalNpmPlugin.scala:47 runCacheKey 5c9874cbc16a3e7fd1657adedf5b3720 [project => leaderboard-frontend, ms => 943]
[error] java.lang.NoSuchMethodError: 'scala.collection.mutable.WrappedArray os.list$.apply(os.Path)'
[error] 	at org.scalablytyped.converter.internal.importer.Bootstrap$.forFolder(Bootstrap.scala:106)
[error] 	at org.scalablytyped.converter.internal.importer.Bootstrap$.$anonfun$findSources$1(Bootstrap.scala:99)
[error] 	at org.scalablytyped.converter.internal.importer.Bootstrap$.findSources(Bootstrap.scala:96)
[error] 	at org.scalablytyped.converter.internal.importer.Bootstrap$.fromNodeModules(Bootstrap.scala:85)
[error] 	at org.scalablytyped.converter.internal.ImportTypings$.apply(ImportTypings.scala:68)
[error] 	at org.scalablytyped.converter.plugin.ScalablyTypedConverterExternalNpmPlugin$.$anonfun$stImportTask$6(ScalablyTypedConverterExternalNpmPlugin.scala:70)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:63)
[error] 	at sbt.std.Transform$$anon$4.work(Transform.scala:69)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:283)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:24)
[error] 	at sbt.Execute.work(Execute.scala:292)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:283)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:65)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
[error] 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:577)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
[error] 	at java.base/java.lang.Thread.run(Thread.java:1623)
[error] (stImport) java.lang.NoSuchMethodError: 'scala.collection.mutable.WrappedArray os.list$.apply(os.Path)'
```
