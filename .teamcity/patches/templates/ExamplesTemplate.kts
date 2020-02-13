package patches.templates

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the template with id = 'ExamplesTemplate'
accordingly, and delete the patch script.
*/
changeTemplate(RelativeId("ExamplesTemplate")) {
    expectSteps {
        script {
            id = "TEMPLATE_RUNNER_1"
            scriptContent = """
                #!/bin/bash
                set -e -x
                
                yarn install
                rm -rf built-storybooks
                yarn build-storybooks
            """.trimIndent()
            dockerImage = "node:lts"
            dockerImagePlatform = ScriptBuildStep.ImagePlatform.Linux
        }
    }
    steps {
        update<ScriptBuildStep>(0) {
            id = "TEMPLATE_RUNNER_1"
            scriptContent = """
                #!/bin/bash
                set -e -x
                
                yarn install
                rm -rf built-storybooks
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                mkdir -p built-storybooks
                yarn build-storybooks
            """.trimIndent()
        }
    }
}