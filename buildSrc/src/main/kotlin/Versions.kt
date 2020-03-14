import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val appcompat: String = "1.2.0-alpha03"

    const val constraintlayout: String = "2.0.0-beta4"

    const val core_ktx: String = "1.3.0-alpha02"

    const val androidx_databinding: String = "4.1.0-alpha02"

    const val lifecycle_extensions: String = "2.2.0"

    const val lifecycle_viewmodel_savedstate: String = "2.3.0-alpha01"

    const val androidx_navigation: String = "2.3.0-alpha03"

    const val androidx_room: String = "2.2.4"

    const val espresso_core: String = "3.3.0-alpha04"

    const val androidx_test_runner: String = "1.3.0-alpha04"

    const val viewpager2: String = "1.0.0"

    const val lottie: String = "3.3.1"

    const val aapt2: String = "4.1.0-alpha02-6193524"

    const val com_android_tools_build_gradle: String = "4.1.0-alpha02"

    const val lint_gradle: String = "27.1.0-alpha02"

    const val com_diffplug_gradle_spotless_gradle_plugin: String = "3.27.2"

    const val com_facebook_stetho: String = "1.5.1"

    const val com_github_bumptech_glide: String = "4.11.0"

    const val material: String = "1.2.0-alpha05"

    const val gson: String = "2.8.6"

    const val timber: String = "4.7.1"

    const val leakcanary_android: String = "2.2"

    const val logging_interceptor: String = "4.4.0"

    const val com_squareup_retrofit2: String = "2.7.1"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.4.2" // available: "0.7.0"

    const val junit: String = "4.13"

    const val library: String = "1.4.0"

    const val anko_commons: String = "0.10.8"

    const val org_jetbrains_kotlin: String = "1.3.61"

    const val org_koin: String = "2.1.3"

    /**
     *
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.2.2"

    const val gradleCurrentVersion: String = "6.1-milestone-2"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
