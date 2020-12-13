name := "smile-spark"

libraryDependencies ++= {
  val sparkV = "3.0.1"
  Seq(
    "org.apache.spark" %% "spark-core"  % sparkV % Provided,
    "org.apache.spark" %% "spark-sql"   % sparkV % Provided,
    "org.apache.spark" %% "spark-mllib" % sparkV % Provided,
    "org.specs2"       %% "specs2-core" % "4.10.5" % Test,
    "org.bytedeco" % "javacpp"   % "1.5.4"        % "test" classifier "macosx-x86_64" classifier "windows-x86_64" classifier "linux-x86_64",
    "org.bytedeco" % "openblas"  % "0.3.10-1.5.4" % "test" classifier "macosx-x86_64" classifier "windows-x86_64" classifier "linux-x86_64",
    "org.bytedeco" % "arpack-ng" % "3.7.0-1.5.4"  % "test" classifier "macosx-x86_64" classifier "windows-x86_64" classifier "linux-x86_64"
  )
}
