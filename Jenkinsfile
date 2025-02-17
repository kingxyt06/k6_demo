pipeline {
    agent any
    triggers {
        githubPush()
    }
    stages {
        stage('Trigger Project B') {
            steps {
                build job: 'projectB_job', wait: false
            }
        }
    }
}
