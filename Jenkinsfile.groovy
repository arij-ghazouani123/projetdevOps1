pipeline {
    agent any
    stages {
        stage('Pulling..') {
            steps {
                script {
                    git branch: 'arijghazouani-5Sim4',
                    url: 'https://github.com/arij-ghazouani123/projetdevOps1.git'
                }
            }
        }
        stage('Maven clean') {
            steps {
                script {
                    sh 'mvn clean'
                }
            }
        }

        stage('Maven Compile') {
            steps {
                script {
                    sh 'mvn compile'
                }
            }
        }




        stage('Maven test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
        
    }
}

