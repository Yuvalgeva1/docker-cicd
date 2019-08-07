pipelineJob('boilerplate-pipeline') {

    trigger {
        scm('H/5 * * * *')
    }
    definition {
        cpsScm {
            scm {
                git {
                    remote {url('https://github.com/yuvalgeva1/docker-cicd')}
                    branches('master')
                    scriptPath('./basics/misc/JenkinsFile')
                    extentions{}
                    // git('git repo: https://github.com/yuvalgeva1/docker-cicd')
                    // script(readFileFromWorkspace('./basics/misc/Jenkinsfile'))
                    // sandbox()
                }
            }
        }
    }
}