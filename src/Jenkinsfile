pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Darkpunkki/jenkins_ex1.git'
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
        }

        stage('Code Coverage') {
            steps {
                jacoco execPattern: '**/target/jacoco.exec'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            jacoco execPattern: '**/target/jacoco.exec'
        }
    }
}
