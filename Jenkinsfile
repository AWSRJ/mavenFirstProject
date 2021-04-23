pipeline
{
    agent any
    
    stages {
        stage ('Pull artifacts from SCM') {
            steps {
                git 'https://github.com/AWSRJ/mavenFirstProject.git'
            }
        }
        stage ('Clean') {
            steps {
                //Use Pipeline Maven Integration Plugin
                withMaven(maven: 'maven_home') {
                    sh 'mvn clean'
                }
            }
        }
        stage ('Validate') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn validate'
                }
            }
        }
        stage ('Test') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn test'
                }
                // It will publish the JUnit test case graph
                post {
                    always {
                        junit '**/target/surefire-reports/TEST-*.xml'
                    }
                }
            }
        }
        stage ('Package') {
            steps {
                withMaven(maven: 'maven_home') {
                    sh 'mvn package'
                }
            }
            post {
                success {
                    archiveArtifacts artifacts: '**/target/mavenFirstProject-1.0-SNAPSHOT.jar', followSymlinks: false
                }
            }
        }
    }
}
