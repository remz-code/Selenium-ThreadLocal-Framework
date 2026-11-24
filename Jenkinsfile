
pipeline {

    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/remz-code/Selenium-ThreadLocal-Framework.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Execute Tests') {
            steps {
                 bat 'mvn test -Dheadless=true'
            }
        }

    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
