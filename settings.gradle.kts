rootProject.name = "PlotSquared"

// 保证 include 的名字和目录一致，且和 build.gradle.kts 里引用一致
include("Core")
include("Bukkit")

// 不要重命名 project.name，保持目录名和 include 名一致

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
