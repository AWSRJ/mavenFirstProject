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
                //Use Pipeline Maven Integration Plugin
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
        stage ('test artifacts for current build') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn test'
                }
            }
        }
        stage ('package artifacts for current build') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn package'
                }
            }
        }
        stage ('verify artifacts for current build') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn verify'
                }
            }
        }
        stage ('install artifacts for current build') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn install'
                }
            }
        }
    }
}
