pipeline
{
    agent any
    
    stages {
        stage ('Pull artifacts from SCM') {
            steps {
                git 'https://github.com/AWSRJ/mavenFirstProject.git'
            }
        }
        stage ('Clean artifacts of previous build') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn clean'
                }
            }
        }
        stage ('Validate artifacts for current build') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn validate'
                }
            }
        }
    }
}
