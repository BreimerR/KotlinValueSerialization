package libetal.kotlinx.serialization.plugin

import org.gradle.api.GradleException
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.compile.AbstractCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions
import org.jetbrains.kotlin.gradle.plugin.*


@Suppress("unused") // USED in file:///build.gradle.kts
class ValueSerialization : KotlinCompilerPluginSupportPlugin, @Suppress("DEPRECATION") // implementing to fix KT-39809
KotlinGradleSubplugin<AbstractCompile> {

    companion object {
        const val SERIALIZATION_GROUP_NAME = "libetal.kotlinx.serialization"
        const val SERIALIZATION_ARTIFACT_NAME = "value-serialization"
        const val SERIALIZATION_ARTIFACT_UNSHADED_NAME = "kotlin-value-serialization-unshaded"
    }

    override fun isApplicable(kotlinCompilation: KotlinCompilation<*>): Boolean = true

    override fun applyToCompilation(
        kotlinCompilation: KotlinCompilation<*>
    ): Provider<List<SubpluginOption>> =
        kotlinCompilation.target.project.provider { emptyList() }

    override fun getPluginArtifact(): SubpluginArtifact =
        SubpluginArtifact(SERIALIZATION_GROUP_NAME, SERIALIZATION_ARTIFACT_NAME, "1.5.31")

    /*  override fun getPluginArtifactForNative(): SubpluginArtifact =
          SubpluginArtifact(SERIALIZATION_GROUP_NAME, SERIALIZATION_ARTIFACT_UNSHADED_NAME)*/

    override fun getCompilerPluginId() = "value.serialization"

    //region Stub implementation for legacy API, KT-39809
    override fun isApplicable(project: Project, task: AbstractCompile): Boolean = true

    override fun apply(
        project: Project,
        kotlinCompile: AbstractCompile,
        javaCompile: AbstractCompile?,
        variantData: Any?,
        androidProjectHandler: Any?,
        kotlinCompilation: KotlinCompilation<KotlinCommonOptions>?
    ): List<SubpluginOption> = throw GradleException(
        "This version of the kotlin-serialization Gradle plugin is built for a newer Kotlin version. " +
                "Please use an older version of kotlin-serialization or upgrade the Kotlin Gradle plugin version to make them match."
    )
    //endregion
}
