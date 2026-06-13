pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK21'
    }

    environment {
        APP_DIR = 'jenkins'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/abdoulfatahhousseinkaire-dj/jenkins-test.git'
            }
        }

        stage('Verify Tools') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Build') {
            steps {
                dir(APP_DIR) {
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Tests') {
            steps {
                dir(APP_DIR) {
                    sh 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                dir(APP_DIR) {
                    sh 'mvn package -DskipTests'
                }
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: "${APP_DIR}/target/*.jar", fingerprint: true
            }
        }

        stage('Deploy') {
            steps {
                sh """
                    ansible-playbook -i inventory.ini deploy.yml \
                    --extra-vars "jar_path=\$(pwd)/${APP_DIR}/target/*.jar"
                """
            }
        }
    }
}