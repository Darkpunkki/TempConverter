pipeline {
    agent any

    environment {
        PATH = "${env.PATH};C:\\Windows\\System32"
        GIT_CREDENTIALS = credentials('Darkpunkki')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: 'ADirin', url: 'https://github.com/Darkpunkki/TempConverter.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    jacoco execPattern: '**/target/jacoco.exec'
                }
            }
        }
    }
}
