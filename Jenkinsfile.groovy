pipeline {
    agent any
    triggers {
        githubPush()
    }
    stages {
        stage('Trigger Project B') {
            steps {
                build job: 'Project_B_Job', wait: false
            }
        }
    }
}