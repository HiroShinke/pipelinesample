pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn package'
            }
        }
        stage('deploy') {
            steps {
                sh './deploywork.sh'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/**/*.jar', fingerprint: true
            junit 'target/surefire-reports/**/*.xml'
            deleteDir() /* clean up our workspace */

        }
        success {
            echo 'This will run only if successful'
            mail to: 'hiro.shinke@gmail.com',
                 subject: "Success Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Congratuation!! with ${env.BUILD_URL}"

        }
        failure {
            echo 'This will run only if failed'
            mail to: 'hiro.shinke@gmail.com',
                 subject: "Failure Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Too Bad!! with ${env.BUILD_URL}"
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}
