pipelineJob('boilerplate-pipeline') {
    definition {
        cpsScm {
            scm {
                git('git repo: https://github.com/yuvalgeva1/docker-cicd')
                script(readFileFromWorkspace('./basics/misc/Jenkinsfile'))
                sandbox()
            }
        }
    }
}